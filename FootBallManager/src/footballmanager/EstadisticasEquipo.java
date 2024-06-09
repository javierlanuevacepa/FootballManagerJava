/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;

/**
 *
 * @author wesker
 */
public class EstadisticasEquipo {
    
    
    String NombreLigaOTorneo;
    int GolesAnotados = 0;
    int GolesEncontra = 0;
    int Puntos = 0;
    int PartidosGanados = 0;
    int PartidosPerdidos =0;
    int PartidosEmpatados = 0;
    
    
    
    public void ReinicioTorn(){
        GolesAnotados = 0;
        GolesEncontra = 0;
        Puntos = 0;
        PartidosGanados = 0;
        PartidosPerdidos =0;
        PartidosEmpatados = 0;
    }
    
}
