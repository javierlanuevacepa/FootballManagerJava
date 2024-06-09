/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;
import java.util.ArrayList;
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
    
    public void terminoTemporada(boolean Player){
        //En este se agregara la edad a todos 
        //En caso de contratos se simulara si es player o no si es player te dira que cierto weon se fue 
        //Si no es player se ira nomas o el equipo lo renovara etc 
        for (Futbolista on : OnceInicial){
            on.Edad++;
            on.Limitar();
        }
        for (Futbolista si : Reserva){
            si.Edad++;
            si.Limitar();
        }
        
    }
    
    //Pensando en agregar una clase estadio con el nombre del estadio que por defecto sera estadio (nombre equipo) con capacidad de fans 
    //10 millones de dolares para crear 1000 puestos
    //Agregara gasto de utilidad etc 
    //Poder poner precio de entradas
    //Algoritmo que los fans iran segun precio tambien dependiendo
    
    
}
