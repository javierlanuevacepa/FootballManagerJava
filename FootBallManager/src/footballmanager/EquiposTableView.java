/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;

/**
 *
 * @author wesker
 */
public class EquiposTableView {
     String Equipo;
    int PG;
    int PE;
    int PP;
    int GA;
    int GC;
    int Puntos;

    public EquiposTableView(String Equipo, int PG,int PP, int PE, int GA, int GC, int Puntos) {
        this.Equipo = Equipo;
        this.PG = PG;
        this.PP = PP;
        this.PE = PE;
        this.GA = GA;
        this.GC = GC;
        this.Puntos = Puntos;
    }
}
