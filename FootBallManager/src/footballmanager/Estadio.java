/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;

/**
 *
 * @author wesker
 */
public class Estadio {
    String NombreEstadio;
    int Capacidad;
    int PrecioEntradas;
    
    int GastoMantencion = 0;
    int DineroInvertido = 0;
    

    public Estadio(String NombreEstadio, int Capacidad, int PrecioEntradas) {
        this.NombreEstadio = NombreEstadio;
        this.Capacidad = Capacidad;
        this.PrecioEntradas = PrecioEntradas;
    }
    
    
    public void determinarGastoMantencion(){
        this.GastoMantencion = Capacidad * 3;
    }
    
    
    
    
    
    
}
