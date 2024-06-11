/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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
    
    
    ArrayList<EstadisticasEquipo> EstadisticasCopas = new ArrayList<>();
    
    int EntrenosPorEquipo = 2;
    
    
    int Dinero;
    
    ArrayList<Trofeo> Trofeos = new ArrayList<>();
    
    
    
    int Fans;

    EstadisticasEquipo EstadisticasLiga;
    
    Estadio EstEquipo;
    
    //AQui las estadisticas de torneo y etc se reiniciaran con cada nuevo inicio de temporada
    ArrayList<EstadisticasEquipo> TorneoParticipacion = new ArrayList<>();
    
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
        return getGastoSueldo() + EstEquipo.GastoMantencion;
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
            if (on.ContratoJugador.TemporadasContrato==0){
                Godbie.add(on);
                Adios+="\n-"+on.Nombre+" "+on.Apellido+"\n";
            }
        }
        for (Futbolista od : Reserva){
            od.ContratoJugador.TemporadasContrato--;
            if (od.ContratoJugador.TemporadasContrato==0){
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
            while (OnceInicial.size()!=11){
                
                if (getCantidadPosicionesOnceOreserva(0,"Atacante")<1){
                    if (getCantidadPosicionesOnceOreserva(1,"Atacante")<1){
                        //Generar algun weon random
                    }else{
                        
                        
                    }
                }
                
                if (getCantidadPosicionesOnceOreserva(0,"Mediocampista")<1){
                    if (getCantidadPosicionesOnceOreserva(1,"Mediocampista")<1){
                        //Generar algun weon random
                    }else{
                        
                        
                    }
                }
                
                if (getCantidadPosicionesOnceOreserva(0,"Defensa")<1){
                    if (getCantidadPosicionesOnceOreserva(1,"Defensa")<1){
                        //Generar algun weon random
                    }else{
                        
                    }
                }
                
                if (getCantidadPosicionesOnceOreserva(0,"Arquero")!=1){
                    if (getCantidadPosicionesOnceOreserva(1,"Atacante")<1){
                        //Generar algun weon random
                    }else{
                        
                        
                    }
                }
            }
        }
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
        checkContratosJugadores(world,Player);
        
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
    
}
