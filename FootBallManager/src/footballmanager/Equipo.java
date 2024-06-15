/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author wesker
 */
public class Equipo {
    
    String NombreEquipo;
    
    ArrayList<Futbolista> OnceInicial = new ArrayList<>();
    
    
    ArrayList<Futbolista> Reserva = new ArrayList<>();

    ArrayList<Futbolista> Retirados = new ArrayList<>();
    
    // Quiza crear algo asi como clase participacion donde salgan las estadisticas ya sea de torneo o liga
    // Jajaja por culpa de esto tendre que crear un metodo iniciar equipo donde se configuren algunas cosas como esta...
    ArrayList<Integer> Dorsales = new ArrayList<>();
    
    
   
    
    int EntrenosPorEquipo = 2;
    
    
    int Dinero;
    
    ArrayList<Trofeo> Trofeos = new ArrayList<>();
    
    
    
    int Fans;

    EstadisticasEquipo EstadisticasLiga;
    
    Estadio EstEquipo;
    
    //AQui las estadisticas de torneo y etc se reiniciaran con cada nuevo inicio de temporada
   
    
    public Equipo(String NombreEquipo, int Dinero, int Fans,EstadisticasEquipo EstadisticasLiga,Estadio EstEquipo) {
        this.NombreEquipo = NombreEquipo;
        this.Dinero = Dinero;
        this.Fans = Fans;
        this.EstadisticasLiga = EstadisticasLiga;
        this.EstEquipo = EstEquipo;
    }
    
    
    
    //Todos estos metodos de retornar promedios solo usan datos de los titulares
    public double calcularAtributes(String Cual){
        int Cuanto = 0;
        for (Futbolista x : OnceInicial){
            Cuanto+=x.Tiro;
        }
        return Math.round(Cuanto/11 * 100)/100D;
    }
    
    
    public boolean liberarJugador(Mundo mund,int IndexJuga){
        String[] Opciones = {"Liberar","Arrepentirse"};
                    
        String Mensaje = "\nSeguro que quieres liberar a "+Reserva.get(IndexJuga).Nombre+" "+Reserva.get(IndexJuga).Apellido+"(Contratado en "+Reserva.get(IndexJuga).ContratoJugador.AgnoContratado+")\nTendrás que pagarle el resto de su contrato:\n"+Reserva.get(IndexJuga).ContratoJugador.SalarioPorTemporada*Reserva.get(IndexJuga).ContratoJugador.TemporadasContrato;
        
        
                    int IndexCambio = JOptionPane.showOptionDialog(null, Mensaje,"Liberar jugador",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,Opciones,
                Opciones[0]);
                    
                    switch (IndexCambio){
                        case 0->{
                            
                            if (this.Dinero<Reserva.get(IndexJuga).ContratoJugador.SalarioPorTemporada*Reserva.get(IndexJuga).ContratoJugador.TemporadasContrato){
                                JOptionPane.showMessageDialog(null, 
                              "No te alcanza para liberarlo.", 
                              "!!!", 
                              JOptionPane.WARNING_MESSAGE);
                            }else{
                            
                            mund.AgentesLibres.add(Reserva.get(IndexJuga));
                            
                            this.Dinero-=Reserva.get(IndexJuga).ContratoJugador.SalarioPorTemporada*Reserva.get(IndexJuga).ContratoJugador.TemporadasContrato;
                            
                            Reserva.remove(IndexJuga);
                            JOptionPane.showMessageDialog(null, 
                              "Jugador liberado correctamente", 
                              "!!!", 
                              JOptionPane.WARNING_MESSAGE);
                            return true;
                            }
                        
                        }
                    }
        return false;
                    
    }
    
    
    public String getFormacion(){
        int Def = 0;
        int Med = 0;
        int Atc = 0;
        for (Futbolista x : OnceInicial){
            switch (x.Posicion){
                case "Defensa" ->{
                    Def++;
                }
                case "Mediocampista" ->{
                    Med++;
                }
                case "Atacante" ->{
                    Atc++;
                }
            }
        }
        return Def+"-"+Med+"-"+Atc;
    }
    
    public double getEdadMedia(){
        int EdadSumada = 0;
        int Cantidades = 0;
        
        if (!OnceInicial.isEmpty()){
            for (Futbolista x : OnceInicial){
                EdadSumada+=x.Edad;
                Cantidades++;
            }
        }
        
        if (!Reserva.isEmpty()){
            for (Futbolista g : Reserva){
                EdadSumada+= g.Edad;
                Cantidades++;
            }
        }
        return EdadSumada/Cantidades;
    }
    
    public int getValorTotalPlantel(){
        int ValorTotal = 0;
        if (!OnceInicial.isEmpty()){
            for (Futbolista x : OnceInicial){
                ValorTotal+=x.Precio;
            }
        }
       
        if (!Reserva.isEmpty()){
            for (Futbolista g : Reserva){
                ValorTotal+=g.Precio;
            }
        }
        return ValorTotal;
    }
    
    public double calcularAtaque(){
        int Total = 0;
        for (Futbolista y : OnceInicial){
            Total+=y.Tiro;
        }
        return Total/11;
    }
    
    public double calcularMedioCampo(){
        int Total = 0;
        for (Futbolista y : OnceInicial){
            Total+=y.Pase;
        }
        return Total/11;
    }
    
    public double calcularDefensa(){
        int Total = 0;
        for (Futbolista y : OnceInicial){
            Total+=y.Defensa;
        }
        return Total/11;
    }
    
    public double calcularPorteria(){
        int Pivot = 0;
        for (Futbolista y : OnceInicial){
            if (y.Porteria > Pivot){
                Pivot = y.Porteria;
            }
        }
        return Pivot;
    }
    
    public double PoderTotal(){
        return calcularAtaque()+calcularMedioCampo()+calcularDefensa()+calcularPorteria();
    }
    
    public double poderTotalNum(ArrayList<Futbolista> x ){
        double ataque = 0, mediocampo = 0, defensa = 0, porteria = 0;

        for (Futbolista j : x) {
            ataque += j.Tiro;
            mediocampo += j.Pase;
            defensa += j.Defensa;
            porteria += j.Porteria;
        }

        ataque /= 11;
        mediocampo /= 11;
        defensa /= 11;
        porteria /= 11;

        return ataque + mediocampo + defensa + porteria;
    }
    
    
    public void CambioJugador(int IndexOnce, int IndexReserva){
        Futbolista Once = OnceInicial.get(IndexOnce);
        Futbolista Reserv = Reserva.get(IndexReserva);
        OnceInicial.remove(IndexOnce);
        Reserva.remove(IndexReserva);
        OnceInicial.add(Reserv);
        Reserva.add(Once);
        JOptionPane.showMessageDialog(null, 
                              "Cambio realizado correctamente!", 
                              "!!!", 
                              JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void AsignarDorsal(int IndexPosicion,int IndexJug){
        switch (IndexPosicion){
            case 0->{
                
                String[] Opciones = {"Asignar dorsal","Arrepentirse"};
                    JComboBox opciones = new JComboBox(Dorsales.toArray(Integer[]::new));
                    int IndexCambio = JOptionPane.showOptionDialog(null, opciones,"Elige nuevo dorsal para "+OnceInicial.get(IndexJug).Nombre+" "+OnceInicial.get(IndexJug).Apellido,JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,Opciones,
                Opciones[0]);
                    switch (IndexCambio){
                        case 0 ->{
                            Dorsales.add(OnceInicial.get(IndexJug).Dorsal);
                            OnceInicial.get(IndexJug).Dorsal = Integer.parseInt(String.valueOf(opciones.getSelectedItem()));
                            
                            JOptionPane.showMessageDialog(null, 
                              OnceInicial.get(IndexJug).Nombre+" "+OnceInicial.get(IndexJug).Apellido+" ahora lleva el numero "+OnceInicial.get(IndexJug).Dorsal, 
                              "Camnio de dorsal!!!", 
                              JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
            }
            case 1->{
                 String[] Opciones = {"Asignar dorsal","Arrepentirse"};
                    JComboBox opciones = new JComboBox(Dorsales.toArray(Integer[]::new));
                    int IndexCambio = JOptionPane.showOptionDialog(null, opciones,"Elige nuevo dorsal para "+Reserva.get(IndexJug).Nombre+" "+Reserva.get(IndexJug).Apellido,JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,Opciones,
                Opciones[0]);
                    switch (IndexCambio){
                        case 0 ->{
                            Dorsales.add(Reserva.get(IndexJug).Dorsal);
                            Reserva.get(IndexJug).Dorsal = Integer.parseInt(String.valueOf(opciones.getSelectedItem()));
                            
                            JOptionPane.showMessageDialog(null, 
                              Reserva.get(IndexJug).Nombre+" "+Reserva.get(IndexJug).Apellido+" ahora lleva el numero "+Reserva.get(IndexJug).Dorsal, 
                              "Camnio de dorsal!!!", 
                              JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
            }
        }
    }
    
    
    public int contarCuantosPos(String Posici){
        int Cuantos = 0;
        for (Futbolista x : OnceInicial){
            if (x.Posicion.equals(Posici)){
                Cuantos++;
            }
        }
        for (Futbolista f : Reserva){
            if (f.Posicion.equals(Posici)){
                Cuantos++;
            }
        }
        return Cuantos;
    }
    
    public int getGastoSueldo(){
        int Sueld = 0;
        for (Futbolista x : OnceInicial){
            Sueld+=x.ContratoJugador.SalarioPorTemporada;
        }
        for (Futbolista y : Reserva){
            Sueld+=y.ContratoJugador.SalarioPorTemporada;
        }
        return Sueld;
    }
    
    
    public int getUtilidadesTotales(){
        return getGastoSueldo() + EstEquipo.GastoMantencion * 12;
    }
    
    
    public void entrenarPlantel(){
        if (EntrenosPorEquipo>0){
            for (Futbolista x : OnceInicial){
            x.Entrenar();
            }
            for (Futbolista y : Reserva){
            y.Entrenar();
            
            }
            EntrenosPorEquipo--;
            JOptionPane.showMessageDialog(null, 
                              "Entrenaste al plantel!!!", 
                              "!!!", 
                              JOptionPane.INFORMATION_MESSAGE);
        }else{
        
        JOptionPane.showMessageDialog(null, 
                              "No quedan entrenos, jugar partido para obtener más.", 
                              "No quedan entrenos.", 
                              JOptionPane.WARNING_MESSAGE);
        }
    }
    
    
    //HAcer alguna custion por si se checkea que no hay suficientes jugadores de todas las posiciones y generar unos por si solos.
    public void checkContratosJugadores(Mundo wok,boolean PLau){
        String Adios = "";
        
        ArrayList<Futbolista> Godbie =new ArrayList<>();
        
        for (Futbolista on : OnceInicial){
            on.ContratoJugador.TemporadasContrato--;
            if (on.ContratoJugador.TemporadasContrato<=0){
                Godbie.add(on);
                Adios+="\n-"+on.Nombre+" "+on.Apellido+"\n";
            }
        }
        for (Futbolista od : Reserva){
            od.ContratoJugador.TemporadasContrato--;
            if (od.ContratoJugador.TemporadasContrato<=0){
                Godbie.add(od);
                Adios+="\n-"+od.Nombre+" "+od.Apellido+"\n";
            }
        }
        
        if (!Godbie.isEmpty()){
            for (Futbolista d : Godbie){
                if (OnceInicial.contains(d)){
                    
                    //Tener ojo con esto porque puede sacar jugadores del once inicial
                    
                    wok.AgentesLibres.add(d);
                    OnceInicial.remove(d);
                }else if (Reserva.contains(d)){
                    wok.AgentesLibres.add(d);
                    Reserva.remove(d);
                }
            }
            
            
            
            //PONER EL CHECK ONCE INICIAL AQUI

            
            
            if (PLau == true){
            JOptionPane.showMessageDialog(null, 
                              "\nLos siguientes jugadores fueron liberados por no renovar sus contratos:\n"+Adios, 
                              "Adios!", 
                              JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
    
    //Cuenta todos los futbolistas de todas posiciones
    public int getCantidadPosiciones(String Dsa){
        int Cuantos = 0;
        switch (Dsa){
            case "Atacante"->{
                for (Futbolista g : OnceInicial){
                    if (g.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
                for (Futbolista y : Reserva){
                    if (y.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
            }
            case "Mediocampista"->{
                for (Futbolista g : OnceInicial){
                    if (g.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
                for (Futbolista y : Reserva){
                    if (y.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
            }
            case "Defensa"->{
                for (Futbolista g : OnceInicial){
                    if (g.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
                for (Futbolista y : Reserva){
                    if (y.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
            }
            case "Arquero"->{
                for (Futbolista g : OnceInicial){
                    if (g.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
                for (Futbolista y : Reserva){
                    if (y.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
            }
        }
        return Cuantos;
    }
    
    //elecion 0 once elecion 1 reserva
    public int getCantidadPosicionesOnceOreserva(int Eleccion,String Dsa){
        int Cuantos = 0;
        switch (Dsa){
            case "Atacante"->{
                
                switch (Eleccion){
                    case 0 ->{
                        for (Futbolista g : OnceInicial){
                    if (g.Posicion.equals(Dsa)){
                        Cuantos++;
                    }}
                    }
                    case 1 ->{
                        for (Futbolista y : Reserva){
                    if (y.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
                    }
                }

            }
            case "Mediocampista"->{
                switch (Eleccion){
                    case 0 ->{
                        for (Futbolista g : OnceInicial){
                    if (g.Posicion.equals(Dsa)){
                        Cuantos++;
                    }}
                    }
                    case 1 ->{
                        for (Futbolista y : Reserva){
                    if (y.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
                    }
                }
            }
            case "Defensa"->{
                switch (Eleccion){
                    case 0 ->{
                        for (Futbolista g : OnceInicial){
                    if (g.Posicion.equals(Dsa)){
                        Cuantos++;
                    }}
                    }
                    case 1 ->{
                        for (Futbolista y : Reserva){
                    if (y.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
                    }
                }
            }
            case "Arquero"->{
                switch (Eleccion){
                    case 0 ->{
                        for (Futbolista g : OnceInicial){
                    if (g.Posicion.equals(Dsa)){
                        Cuantos++;
                    }}
                    }
                    case 1 ->{
                        for (Futbolista y : Reserva){
                    if (y.Posicion.equals(Dsa)){
                        Cuantos++;
                    }
                }
                    }
                }
            }
        }
        return Cuantos;
    }
    
    
    //Esto verá que hayan 11 jugadores y en caso que no hayan que se llene automaticamente
    public void checkOnceInicial(Mundo wir){
       
        if (OnceInicial.size()<11){
            checkReservas(wir);
            combiMejorEquipos();
            
            
        }
    }
    
    
    
    
    
    //Esta esta buena pero es muy lenta poirque probaba como billones de combinaciones
    public void setCombinacionMasPoderosa(){
        ArrayList<Futbolista> MejorOnceInicial = new ArrayList<>();
        
        Reserva.addAll(OnceInicial);
        
        OnceInicial.clear();
        
        double mejorPoderTotal = 0;
        
        
        int[] indices = new int[11];
        for (int i = 0; i<11;i++){
            indices[i] = i;
        }
        
        while(indices[10]<Reserva.size()){
            ArrayList<Futbolista> onceInicialActual = new ArrayList<>();
            
            for (int i : indices){
                onceInicialActual.add(Reserva.get(i));
            }
            
            double poderTotalActual = poderTotalNum(onceInicialActual);
            
            if (poderTotalActual > mejorPoderTotal){
                mejorPoderTotal = poderTotalActual;
                MejorOnceInicial = onceInicialActual;
            }
            
            int t = 10;
            
            while (t!=0 && indices[t] == Reserva.size() - 11 + t ){
                t--;
            }
            indices[t]++;
            for (int i = t+1;i<11;i++){
                indices[i]  = indices[i-1] + 1;
            }
        }
        
        OnceInicial = MejorOnceInicial;
        
        
        for (Futbolista y : OnceInicial){
            if (Reserva.contains(y)){
                Reserva.remove(y);
            }
        }
    }
    
    
    //En caso de que no haya jugador de algo crearlo
    public void checkReservas(Mundo wir){
        DatosYNumeros dat = new DatosYNumeros();
        if (getCantidadPosicionesOnceOreserva(1,"Atacante")<1){
            for (int i = 0; i<2;i++){
                Reserva.add(wir.GenerarRandomPlayer(this, "Atacante",dat.RetornarRandomString(dat.paises)));
            }
        }
        if (getCantidadPosicionesOnceOreserva(1,"Mediocampista")<1){
            for (int i = 0; i<2;i++){
                Reserva.add(wir.GenerarRandomPlayer(this, "Mediocampista",dat.RetornarRandomString(dat.paises)));
            }
        }
        if (getCantidadPosicionesOnceOreserva(1,"Defensa")<1){
            for (int i = 0; i<2;i++){
                Reserva.add(wir.GenerarRandomPlayer(this, "Defensa",dat.RetornarRandomString(dat.paises)));
            }
        }
        if (getCantidadPosicionesOnceOreserva(1,"Arquero")<1){
            for (int i = 0; i<2;i++){
                Reserva.add(wir.GenerarRandomPlayer(this, "Arquero",dat.RetornarRandomString(dat.paises)));
            }
        }
    }
    
    
    
    public void combiMejorEquipos(){
        ArrayList<Futbolista> MejorOnceInicial = new ArrayList<>();
        
        Reserva.addAll(OnceInicial);
        
        OnceInicial.clear();

        // Seleccionamos los mejores 3 delanteros basados en el atributo de tiro
        Reserva.sort(Comparator.comparingDouble(j -> -j.Tiro));
        MejorOnceInicial.addAll(Reserva.subList(0, 3));

        // Seleccionamos los mejores 3 mediocampistas basados en el atributo de pase
        Reserva.sort(Comparator.comparingDouble(j -> -j.Pase));
        MejorOnceInicial.addAll(Reserva.subList(0, 3));

        // Seleccionamos los mejores 3 defensas basados en el atributo de defensa
        Reserva.sort(Comparator.comparingDouble(j -> -j.Defensa));
        MejorOnceInicial.addAll(Reserva.subList(0, 3));

        // Seleccionamos el mejor portero basado en el atributo de porteria
        Reserva.sort(Comparator.comparingDouble(j -> -j.Porteria));
        MejorOnceInicial.add(Reserva.get(0));

        // Llenamos los 11 jugadores con los mejores restantes basados en el valor total

        

        
        Futbolista extra = Reserva.get(0);
        
        for (Futbolista k : Reserva){
            if (!k.Posicion.equals("Arquero")){
                extra = k;
            }
        }
        Reserva.remove(extra);
        MejorOnceInicial.add(extra);
        
        OnceInicial = MejorOnceInicial;
        
        
        Reserva.stream().distinct().collect(Collectors.toList());
        
        if (getCantidadPosicionesOnceOreserva(1,"Arquero")>1){
            for (Futbolista cv : OnceInicial){
                if (cv.Posicion.equals("Arquero") && cv.Porteria<getMejor("Arquero").Porteria){
                    extra = cv;
                }
            }
            OnceInicial.remove(extra);
            Reserva.add(extra);
            for (Futbolista k : Reserva){
            if (!k.Posicion.equals("Arquero") && !OnceInicial.contains(k)){
                extra = k;
            }
             }
            Reserva.remove(extra);
            OnceInicial.add(extra);
            
        }
        
        
        
        for (Futbolista x : OnceInicial){
            if (Reserva.contains(x)){
                Reserva.remove(x);
            }
        }
        

        
    }
    
    
    
    public Futbolista getMejor(String Posicion){
        Futbolista vessel = OnceInicial.get(0);
       
                for (Futbolista y : OnceInicial){
                    switch (Posicion){
                        case "Arquero"->{
                            if (y.Porteria>vessel.Porteria){
                                vessel = y;
                            }
                        }
                        case "Atacante"->{
                            if (y.Tiro>vessel.Tiro){
                                vessel = y;
                            }
                        }
                        case "Mediocampista"->{
                            if (y.Pase>vessel.Pase){
                                vessel = y;
                            }
                        }
                        case "Defensa"->{
                            if (y.Defensa>vessel.Defensa){
                                vessel = y;
                            }
                        }
                    }
                }
        return vessel;
       
    }
    
    
    public void contratorPorTerminarAviso(){
        String Anun = "";
        for (Futbolista y : OnceInicial){
            if (y.ContratoJugador.TemporadasContrato==1){
                Anun+="\n-"+y.Nombre+" "+y.Apellido+" "+y.Edad+" años ("+y.Posicion+")\n";
            }
        }
        for (Futbolista g : Reserva){
            if (g.ContratoJugador.TemporadasContrato==1){
                Anun+="\n-"+g.Nombre+" "+g.Apellido+" "+g.Edad+" años ("+g.Posicion+")\n";
            }
        }
        if (Anun.equals("")){
            JOptionPane.showMessageDialog(null, 
                              "No hay jugadores que les quede solo 1 temporada de contrato.", 
                              "Todo en orden.", 
                              JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, 
                              "Jugador(es) con solo 1 temporada restante en su contrato:"+Anun, 
                              "Contratos", 
                              JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    
    public void terminoTemporada(boolean Player,Mundo world){
        //En este se agregara la edad a todos 
        //En caso de contratos se simulara si es player o no si es player te dira que cierto weon se fue 
        //Si no es player se ira nomas o el equipo lo renovara etc 
        for (Futbolista on : OnceInicial){
            on.Edad++;
            on.Limitar();
            on.PreguntasSobreRetiro = 1;
            on.OfertasSobreContrato = 3;
        }
        for (Futbolista si : Reserva){
            si.Edad++;
            si.Limitar();
            si.PreguntasSobreRetiro = 1;
            si.OfertasSobreContrato = 3;
        }
        for (Futbolista so : Retirados){
            so.Edad++;
        }
        
        
        checkContratosJugadores(world,Player);
        checkOnceInicial(world);
        
        this.Dinero-=getUtilidadesTotales();
        
    }
    
    //Pensando en agregar una clase estadio con el nombre del estadio que por defecto sera estadio (nombre equipo) con capacidad de fans 
    //10 millones de dolares para crear 1000 puestos
    //Agregara gasto de utilidad etc 
    //Poder poner precio de entradas
    //Algoritmo que los fans iran segun precio tambien dependiendo
    public boolean OfrecerContratoJuga(int Eleccion,int IndexJUgador,Contrato Propuesta){
        switch (Eleccion){
            case 0 ->{
                if (OnceInicial.get(IndexJUgador).RespuestaPropuestaContrato(Propuesta)==true){
                    return true;
                }else if (OnceInicial.get(IndexJUgador).RespuestaPropuestaContrato(Propuesta)==false){
                    return false; 
                }
            }
            case 1->{
                if (Reserva.get(IndexJUgador).RespuestaPropuestaContrato(Propuesta)==true){
                    return true;
                }else if (Reserva.get(IndexJUgador).RespuestaPropuestaContrato(Propuesta)==false){
                    return false; 
                }
            }
        }
        return false;
    }
    
    public void retirarJugador(Futbolista Jugador){
        if (Jugador.RetiroListo==true){
            Retirados.add(Jugador);
            Reserva.remove(Jugador);
                JOptionPane.showMessageDialog(null, 
                              Jugador.Nombre+" "+Jugador.Apellido+" se retiró en un partido\nde despedida frente a "+this.Fans+" fans.", 
                              "Adios y gracias por todo!", 
                              JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            JOptionPane.showMessageDialog(null, 
                              Jugador.Nombre+" "+Jugador.Apellido+" no está listo para retirarse!", 
                              "!!!", 
                              JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void ofrecerTransferencia(){
    
    
    }
    
    public void cambiarNombreEstadio(String nuevoNombre){
        this.EstEquipo.NombreEstadio = nuevoNombre;
        
        JOptionPane.showMessageDialog(null, 
                              "Nombre de estadio cambiado correctamente.", 
                              "Exito!", 
                              JOptionPane.INFORMATION_MESSAGE);
    }
    
    public boolean invertirEstadio(){
        if (this.Dinero<10000000){
            JOptionPane.showMessageDialog(null, 
                              "No te alcanza...", 
                              "Ups", 
                              JOptionPane.WARNING_MESSAGE);
            return false;
        }else{
            this.EstEquipo.Capacidad+=1000;
            this.EstEquipo.DineroInvertido+=10000000;
            this.Dinero-=10000000;
            JOptionPane.showMessageDialog(null, 
                              "Inversión realizada correctamente!", 
                              "Yujuu", 
                              JOptionPane.INFORMATION_MESSAGE);
            return true;
        }
    }
    
    
    
    public void venderJugador(Mundo wor,int IndexJug){
        DatosYNumeros dat = new DatosYNumeros();
        Reserva.get(IndexJug).TasarPrecio();
        int Oferta = Reserva.get(IndexJug).Precio;
        int MasMenos = dat.RangeRandint(0, 2);
        int Intentos = dat.RangeRandint(1, 4);
        Equipo Comprador = wor.getRandomEquipoParaVender(Reserva.get(IndexJug));
        switch (MasMenos){
            case 0 ->{
                Oferta+= dat.RangeRandint(0, Oferta * 3);
            }
            case 1 ->{
                Oferta-= dat.RangeRandint(0, Integer.parseInt(String.valueOf(Math.round(Oferta * 0.5))));
            }
        }
        while (Intentos>0){

        String[] Opciones = {"Aceptar oferta","Pedir más","Arrepentirse"};
        
        String Texto =  Comprador.NombreEquipo+" esta interesado en "+Reserva.get(IndexJug).Nombre+" "+Reserva.get(IndexJug).Apellido+"\n están dispuestos a ofrecer $"+Oferta;
                    
        int IndexCambio = JOptionPane.showOptionDialog(null,Texto,"Transferencia",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,Opciones,
        Opciones[0]);
        
        switch (IndexCambio){
            case 0 ->{
                String Anuncio = Reserva.get(IndexJug).Nombre+" "+Reserva.get(IndexJug).Apellido+" a sido transferido con exito a "+Comprador.NombreEquipo;
                Comprador.Reserva.add(Reserva.get(IndexJug));
                Reserva.remove(IndexJug);
                Comprador.Dinero -= Oferta;
                this.Dinero+= Oferta;
                
                Intentos = -1;
                
                JOptionPane.showMessageDialog(null, 
                              Anuncio, 
                              "Mucha suerte!", 
                              JOptionPane.INFORMATION_MESSAGE);
                
                
            }
            case 1 ->{
                int SubirOno = dat.RangeRandint(0, 1);
                
                switch (SubirOno){
                    case 0 ->{
                        Oferta+=dat.RangeRandint(Integer.parseInt(String.valueOf(Math.round(Oferta * 0.2))), Oferta * 2);
                    }
                    case 1 ->{
                        Intentos--;
                    }
                }
            }
        }
        
    }
        if (Intentos==0){
            JOptionPane.showMessageDialog(null, 
                              "El equipo interesado cesó las negociaciones.", 
                              "Ups", 
                              JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    public void campanaPublicidad(){
        JTextField grat = new JTextField();        
        grat.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (!Character.isDigit(e.getKeyChar()) || grat.getText().isEmpty() && e.getKeyChar() == '0'){
                e.consume();
            }
        }});
        String[] Opir = {"Realizar campaña publicitaria","Arrepentirse"};
        int Casiii = JOptionPane.showOptionDialog(null, grat,"¿Realizar campaña publicitaria para conseguir mas fans?",JOptionPane.DEFAULT_OPTION,JOptionPane.PLAIN_MESSAGE,null,Opir,
                Opir[0]);
        switch (Casiii){
            case 0 ->{
                if (Integer.parseInt(grat.getText())<500000){
                    JOptionPane.showMessageDialog(null, 
                              "Inversion minima de $500.000!!!", 
                              "Ups", 
                              JOptionPane.WARNING_MESSAGE);
                }else{
                    if (Integer.parseInt(grat.getText())>this.Dinero){
                        JOptionPane.showMessageDialog(null, 
                              "No te alcanza!!!", 
                              "Ups", 
                              JOptionPane.WARNING_MESSAGE);
                    }else{
                        DatosYNumeros dat = new DatosYNumeros(); 
                        int fansNuevos = dat.RangeRandint(0, Integer.parseInt(grat.getText())/1000);
                        this.Fans+=fansNuevos;
                        JOptionPane.showMessageDialog(null, 
                              "Invertiste "+grat.getText()+" y obtuviste "+fansNuevos+" fans nuevos!!!", 
                              "Campaña publicitaria", 
                              JOptionPane.INFORMATION_MESSAGE);
                    } 
                }
            }
        }
    }
    
    
    
    
    
    
}
