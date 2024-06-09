/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author wesker
 */
public class Liga {
    
    
    EstadisticasEquipo Esta;
    
    Estadio fake = new Estadio("Nadie",0,0);
    
    Equipo NocampeonAun = new Equipo("Nadie aún",0,0,Esta,fake);
    
    
    
    DatosYNumeros dat = new DatosYNumeros();
    
    String NombreLiga;
    ArrayList<Equipo> Equipos = new ArrayList<>();
    int Fecha = 1;
    String Etapa = "1ra";
    Equipo Campeon = NocampeonAun;

    public Liga(String NombreLiga) {
        this.NombreLiga = NombreLiga;
    }
    
    
    //Hacer un get 4 primeros el 1 va a ser el campeon y a los 4 en total iran al torneo continental
    
    //---
    //- Simul 0 es pl simul 1 es simulacion
    public String[] IteratorReturn(int[][] Fechs){
        ArrayList<String> Resultados = new ArrayList<>();
        for (int i = 0;i<Fechs.length;i++){
            Resultados.add(JugarPartidoReturn(Equipos.get(Fechs[i][0]),Equipos.get(Fechs[i][1])));
        }
        return Arrays.stream(Resultados.toArray()).toArray(String[]::new);
    }
    
    public void IteratorSimulator(int[][] Fechs){
        ArrayList<String> Resultados = new ArrayList<>();
        for (int i = 0;i<Fechs.length;i++){
            JugarPartidoSimlar(Equipos.get(Fechs[i][0]),Equipos.get(Fechs[i][1]));
        }
    }
    
    public void AcortadorTorne(int[][] Felsi,boolean LigaPlayer,JTextArea Testis){
        
                
        if (LigaPlayer==true){
            //--AQUI PONER TODO ESO DONDE TE MADNA A OTRA PANTALLA CON LOS RESULTADOS.
            String[] Results = IteratorReturn(Felsi);
            //--
            String Resultis = "\nResultados fecha "+Fecha+"\n";
            
            for (String Sun : Results){
                Resultis+="\n"+Sun+"\n";
            }
                        
            Testis.setText(Resultis);
                        
            }else if (LigaPlayer==false){
                IteratorSimulator(Felsi);
            }
            Fecha++;
    }
    
   
    
    //Tengo que este será para mostrar al player y habra otro igual que no mostrará nada solo hara la simulación
    public void JugarTorneo(boolean LigaPlayer,VistaEquipo View,int Agno){
        
        int Maga = 0;
        int Ohig = 1;
        int UnionEsp = 2;
        int Nublense = 3;
        int Palest = 4;
        int Audax = 5;
        int Cobre = 6;
        int Unioon = 7;
        int Evert = 8;
        int Ucato = 9;
        int Deportesco = 10;
        int Colo = 11;
        int CuricoUnido = 12;
        int Cokimunido = 13;
        int Uchile = 14;
        int Huachi = 15;
        
        
        if (Etapa.equals("1ra")){
            
            switch (Fecha){
                case 1->{

                    int[][] Fechas = {{Maga, Ohig},{UnionEsp, Nublense},{Palest, Audax},{Cobre, Unioon},{Evert, Ucato},{Deportesco, Colo},{CuricoUnido, Cokimunido},{Uchile, Huachi}};
                    AcortadorTorne(Fechas,LigaPlayer,View.Results);
                }
                case 2->{
                    int[][] Fechas = {
            {Nublense, Maga},      
            {Unioon, Evert},        
            {Cokimunido, Palest},   
            {Uchile, UnionEsp},    
            {Ucato, CuricoUnido},   
            {Huachi, Cobre},       
            {Ohig, Colo},           
            {Audax, Deportesco}};
                    AcortadorTorne(Fechas,LigaPlayer,View.Results);
                
                }
                case 3->{
                    int[][] fechas = {
            {Cokimunido, Ucato},       // Cokimunido, Ucato
            {CuricoUnido, Audax},      // Curicounido, Audax
            {Maga, Unioon},            // Maga, Unioon
            {UnionEsp, Evert},         // Unionesp, Evert
            {Palest, Uchile},          // Palest, Uchile
            {Cobre, Deportesco},       // Cobre, Deportesco
            {Ohig, Huachi},            // Ohig, Huachi
            {Colo, Nublense}           // Colo, Nublense
             };
                    AcortadorTorne(fechas,LigaPlayer,View.Results);

                }
                
                case 4 ->{
                    int[][] fechas = {
            {Audax, UnionEsp},       // Audax, Unionesp
            {Deportesco, Palest},    // Deportesco, Palest
            {UnionEsp, CuricoUnido}, // Unionesp, Curicounido
            {Uchile, Maga},          // Uchile, Maga
            {Evert, Cokimunido},     // Evert, Cokimunido
            {Ucato, Cobre},          // Ucato, Cobre
            {Nublense, Ohig},        // Nublense, Ohig
            {Huachi, Colo}           // Huachi, Colo
                  };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);

                }
                
                case 5 ->{
                    
                    int[][] fechas = {
            {CuricoUnido, Deportesco}, // Curicounido, Deportesco
            {UnionEsp, Maga},          // Unionesp, Maga
            {Cokimunido, Huachi},      // Cokimunido, Huachi
            {Cobre, Nublense},         // Cobre, Nublense
            {Audax, Ucato},            // Audax, Ucato
            {Ohig, Uchile},            // Ohig, Uchile
            {Colo, Evert},             // Colo, Evert
            {Palest, Unioon}           // Palest, Unioon
                   };
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                    
                }
                case 6 ->{
                    int[][] fechas = {
            {CuricoUnido, Uchile},   // Curicounido, Uchile
            {Ucato, Palest},         // Ucato, Palest
            {Maga, Cobre},           // Maga, Cobre
            {Unioon, Nublense},      // Unioon, Nublense
            {Colo, Cokimunido},      // Colo, Cokimunido
            {Evert, Audax},          // Evert, Audax
            {Deportesco, Ohig},      // Deportesco, Ohig
            {Huachi, UnionEsp}       // Huachi, Unionesp
                    };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                    
                    
                }
                case 7 ->{
                    int[][] fechas = {
            {Uchile, Unioon},        // Uchile, Unioon
            {Palest, Huachi},        // Palest, Huachi
            {Cokimunido, Audax},     // Cokimunido, Audax
            {Nublense, Ucato},       // Nublense, Ucato
            {Ohig, CuricoUnido},     // Ohig, Curicounido
            {UnionEsp, Deportesco},  // Unionesp, Deportesco
            {Colo, Maga},            // Colo, Maga
            {Cobre, Evert}           // Cobre, Evert
                   };
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 8->{
                    
                    int[][] fechas = {
            {Deportesco, Unioon},   // Deportesco, Unioon
            {Evert, Nublense},      // Evert, Nublense
            {CuricoUnido, Huachi},  // Curicounido, Huachi
            {Ucato, UnionEsp},      // Ucato, Unionesp
            {Colo, Uchile},         // Colo, Uchile
            {Audax, Ohig},          // Audax, Ohig
            {Cokimunido, Cobre},    // Cokimunido, Cobre
            {Palest, Maga}          // Palest, Maga
                 };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 9->{
                    
                    int[][] fechas = {
            {Nublense, CuricoUnido},  // Nublense, Curicounido
            {Huachi, Evert},          // Huachi, Evert
            {Cobre, Colo},            // Cobre, Colo
            {Ohig, Cokimunido},       // Ohig, Cokimunido
            {Unioon, Audax},          // Unioon, Audax
            {Uchile, Deportesco},     // Uchile, Deportesco
            {UnionEsp, Palest},       // Unionesp, Palest
            {Maga, Ucato}             // Maga, Ucato
                   };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 10->{
                    
                    int[][] fechas = {
            {Palest, Cobre},          // Palest, Cobre
            {Nublense, Cokimunido},   // Nublense, Cokimunido
            {Evert, Maga},            // Evert, Maga
            {Ucato, Colo},            // Ucato, Colo
            {Deportesco, Huachi},     // Deportesco, Huachi
            {Audax, Uchile},          // Audax, Uchile
            {Unioon, Ohig},           // Unioon, Ohig
            {CuricoUnido, UnionEsp}   // Curicounido, Unionesp
                      };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 11->{
                    
                    int[][] fechas = {
            {Huachi, Unioon},       // Huachi, Unioon
            {Evert, Uchile},        // Evert, Uchile
            {Ucato, Ohig},          // Ucato, Ohig
            {Maga, Deportesco},     // Maga, Deportesco
            {Cobre, CuricoUnido},   // Cobre, Curicounido
            {Colo, Palest},         // Colo, Palest
            {UnionEsp, Cokimunido}, // Unionesp, Cokimunido
            {Nublense, Audax}       // Nublense, Audax
                     };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                    
                }
                case 12->{
                    int[][] fechas = {
            {Unioon, Colo},         // Unioon, Colo
            {Palest, Nublense},     // Palest, Nublense
            {CuricoUnido, Evert},   // Curicounido, Evert
            {Audax, Cobre},         // Audax, Cobre
            {Ohig, UnionEsp},       // Ohig, Unionesp
            {Deportesco, Cokimunido}, // Deportesco, Cokimunido
            {Uchile, Ucato},        // Uchile, Ucato
            {Huachi, Maga}          // Huachi, Maga
                       };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 13->{
                    
                    int[][] fechas = {
            {Maga, CuricoUnido},     // Maga, Curicounido
            {Nublense, Deportesco},  // Nublense, Deportesco
            {UnionEsp, Unioon},      // Unionesp, Unioon
            {Colo, Audax},           // Colo, Audax
            {Cokimunido, Uchile},    // Cokimunido, Uchile
            {Cobre, Ohig},           // Cobre, Ohig
            {Ucato, Huachi},         // Ucato, Huachi
            {Evert, Palest}          // Evert, Palest
                     };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 14->{
                    int[][] fechas = {
            {Maga, Audax},           // Maga, Audax
            {UnionEsp, Colo},        // Unionesp, Colo
            {Huachi, Nublense},      // Huachi, Nublense
            {Unioon, Cokimunido},    // Unioon, Cokimunido
            {Deportesco, Ucato},     // Deportesco, Ucato
            {CuricoUnido, Palest},   // Curicounido, Palest
            {Uchile, Cobre},         // Uchile, Cobre
            {Ohig, Evert}            // Ohig, Evert
                     };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 15->{
                    int[][] fechas = {
            {Colo, CuricoUnido},     // Colo, Curicounido
            {Palest, Ohig},          // Palest, Ohig
            {Audax, Huachi},         // Audax, Huachi
            {Cokimunido, Maga},      // Cokimunido, Maga
            {Nublense, Uchile},      // Nublense, Uchile
            {Evert, Deportesco},     // Evert, Deportesco
            {Ucato, Unioon},         // Ucato, Unioon
            {Cobre, UnionEsp}        // Cobre, Unionesp
                     };
                    AcortadorTorne(fechas,LigaPlayer,View.Results);

                    Etapa = "2da";
                    Fecha = 1;
                }
            }
        }else if (Etapa.equals("2da")){
            
            switch (Fecha){
                case 1->{

                    int[][] Fechas = {{Maga, Ohig},{UnionEsp, Nublense},{Palest, Audax},{Cobre, Unioon},{Evert, Ucato},{Deportesco, Colo},{CuricoUnido, Cokimunido},{Uchile, Huachi}};
                    AcortadorTorne(Fechas,LigaPlayer,View.Results);
                }
                case 2->{
                    int[][] Fechas = {
            {Nublense, Maga},      
            {Unioon, Evert},        
            {Cokimunido, Palest},   
            {Uchile, UnionEsp},    
            {Ucato, CuricoUnido},   
            {Huachi, Cobre},       
            {Ohig, Colo},           
            {Audax, Deportesco}};
                    AcortadorTorne(Fechas,LigaPlayer,View.Results);
                
                }
                case 3->{
                    int[][] fechas = {
            {Cokimunido, Ucato},       // Cokimunido, Ucato
            {CuricoUnido, Audax},      // Curicounido, Audax
            {Maga, Unioon},            // Maga, Unioon
            {UnionEsp, Evert},         // Unionesp, Evert
            {Palest, Uchile},          // Palest, Uchile
            {Cobre, Deportesco},       // Cobre, Deportesco
            {Ohig, Huachi},            // Ohig, Huachi
            {Colo, Nublense}           // Colo, Nublense
             };
                    AcortadorTorne(fechas,LigaPlayer,View.Results);

                }
                
                case 4 ->{
                    int[][] fechas = {
            {Audax, UnionEsp},       // Audax, Unionesp
            {Deportesco, Palest},    // Deportesco, Palest
            {UnionEsp, CuricoUnido}, // Unionesp, Curicounido
            {Uchile, Maga},          // Uchile, Maga
            {Evert, Cokimunido},     // Evert, Cokimunido
            {Ucato, Cobre},          // Ucato, Cobre
            {Nublense, Ohig},        // Nublense, Ohig
            {Huachi, Colo}           // Huachi, Colo
                  };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);

                }
                
                case 5 ->{
                    
                    int[][] fechas = {
            {CuricoUnido, Deportesco}, // Curicounido, Deportesco
            {UnionEsp, Maga},          // Unionesp, Maga
            {Cokimunido, Huachi},      // Cokimunido, Huachi
            {Cobre, Nublense},         // Cobre, Nublense
            {Audax, Ucato},            // Audax, Ucato
            {Ohig, Uchile},            // Ohig, Uchile
            {Colo, Evert},             // Colo, Evert
            {Palest, Unioon}           // Palest, Unioon
                   };
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                    
                }
                case 6 ->{
                    int[][] fechas = {
            {CuricoUnido, Uchile},   // Curicounido, Uchile
            {Ucato, Palest},         // Ucato, Palest
            {Maga, Cobre},           // Maga, Cobre
            {Unioon, Nublense},      // Unioon, Nublense
            {Colo, Cokimunido},      // Colo, Cokimunido
            {Evert, Audax},          // Evert, Audax
            {Deportesco, Ohig},      // Deportesco, Ohig
            {Huachi, UnionEsp}       // Huachi, Unionesp
                    };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                    
                    
                }
                case 7 ->{
                    int[][] fechas = {
            {Uchile, Unioon},        // Uchile, Unioon
            {Palest, Huachi},        // Palest, Huachi
            {Cokimunido, Audax},     // Cokimunido, Audax
            {Nublense, Ucato},       // Nublense, Ucato
            {Ohig, CuricoUnido},     // Ohig, Curicounido
            {UnionEsp, Deportesco},  // Unionesp, Deportesco
            {Colo, Maga},            // Colo, Maga
            {Cobre, Evert}           // Cobre, Evert
                   };
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 8->{
                    
                    int[][] fechas = {
            {Deportesco, Unioon},   // Deportesco, Unioon
            {Evert, Nublense},      // Evert, Nublense
            {CuricoUnido, Huachi},  // Curicounido, Huachi
            {Ucato, UnionEsp},      // Ucato, Unionesp
            {Colo, Uchile},         // Colo, Uchile
            {Audax, Ohig},          // Audax, Ohig
            {Cokimunido, Cobre},    // Cokimunido, Cobre
            {Palest, Maga}          // Palest, Maga
                 };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 9->{
                    
                    int[][] fechas = {
            {Nublense, CuricoUnido},  // Nublense, Curicounido
            {Huachi, Evert},          // Huachi, Evert
            {Cobre, Colo},            // Cobre, Colo
            {Ohig, Cokimunido},       // Ohig, Cokimunido
            {Unioon, Audax},          // Unioon, Audax
            {Uchile, Deportesco},     // Uchile, Deportesco
            {UnionEsp, Palest},       // Unionesp, Palest
            {Maga, Ucato}             // Maga, Ucato
                   };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 10->{
                    
                    int[][] fechas = {
            {Palest, Cobre},          // Palest, Cobre
            {Nublense, Cokimunido},   // Nublense, Cokimunido
            {Evert, Maga},            // Evert, Maga
            {Ucato, Colo},            // Ucato, Colo
            {Deportesco, Huachi},     // Deportesco, Huachi
            {Audax, Uchile},          // Audax, Uchile
            {Unioon, Ohig},           // Unioon, Ohig
            {CuricoUnido, UnionEsp}   // Curicounido, Unionesp
                      };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 11->{
                    
                    int[][] fechas = {
            {Huachi, Unioon},       // Huachi, Unioon
            {Evert, Uchile},        // Evert, Uchile
            {Ucato, Ohig},          // Ucato, Ohig
            {Maga, Deportesco},     // Maga, Deportesco
            {Cobre, CuricoUnido},   // Cobre, Curicounido
            {Colo, Palest},         // Colo, Palest
            {UnionEsp, Cokimunido}, // Unionesp, Cokimunido
            {Nublense, Audax}       // Nublense, Audax
                     };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                    
                }
                case 12->{
                    int[][] fechas = {
            {Unioon, Colo},         // Unioon, Colo
            {Palest, Nublense},     // Palest, Nublense
            {CuricoUnido, Evert},   // Curicounido, Evert
            {Audax, Cobre},         // Audax, Cobre
            {Ohig, UnionEsp},       // Ohig, Unionesp
            {Deportesco, Cokimunido}, // Deportesco, Cokimunido
            {Uchile, Ucato},        // Uchile, Ucato
            {Huachi, Maga}          // Huachi, Maga
                       };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 13->{
                    
                    int[][] fechas = {
            {Maga, CuricoUnido},     // Maga, Curicounido
            {Nublense, Deportesco},  // Nublense, Deportesco
            {UnionEsp, Unioon},      // Unionesp, Unioon
            {Colo, Audax},           // Colo, Audax
            {Cokimunido, Uchile},    // Cokimunido, Uchile
            {Cobre, Ohig},           // Cobre, Ohig
            {Ucato, Huachi},         // Ucato, Huachi
            {Evert, Palest}          // Evert, Palest
                     };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 14->{
                    int[][] fechas = {
            {Maga, Audax},           // Maga, Audax
            {UnionEsp, Colo},        // Unionesp, Colo
            {Huachi, Nublense},      // Huachi, Nublense
            {Unioon, Cokimunido},    // Unioon, Cokimunido
            {Deportesco, Ucato},     // Deportesco, Ucato
            {CuricoUnido, Palest},   // Curicounido, Palest
            {Uchile, Cobre},         // Uchile, Cobre
            {Ohig, Evert}            // Ohig, Evert
                     };
                    
                    AcortadorTorne(fechas,LigaPlayer,View.Results);
                }
                case 15->{
                    int[][] fechas = {
            {Colo, CuricoUnido},     // Colo, Curicounido
            {Palest, Ohig},          // Palest, Ohig
            {Audax, Huachi},         // Audax, Huachi
            {Cokimunido, Maga},      // Cokimunido, Maga
            {Nublense, Uchile},      // Nublense, Uchile
            {Evert, Deportesco},     // Evert, Deportesco
            {Ucato, Unioon},         // Ucato, Unioon
            {Cobre, UnionEsp}        // Cobre, Unionesp
                     };
                    AcortadorTorne(fechas,LigaPlayer,View.Results);

                    int Anio = Agno +1;
                    
                    Campeon = getCampeon();
                    
                    int Premio = dat.RangeRandint(3000000, 15000000);
                    
                    Campeon.Dinero += Premio;
                                      
                    
                    Campeon.Trofeos.add(new Trofeo(NombreLiga.toUpperCase()+" "+Agno+"-"+Anio));
                    
                    if (LigaPlayer==true){
                        
                        String Resultff = "\nFIN DE LA "+NombreLiga.toUpperCase()+"\nTENEMOS CAMPEON DE "+NombreLiga.toUpperCase()+" "+Agno+"-"+Anio+"!!!!!\nFelicidades "+Campeon.NombreEquipo+"!!!\n"+"El campeón se llevará $"+Premio;
                        View.Results.append(Resultff);
                        
                        JOptionPane.showMessageDialog(null, 
                              "\nTENEMOS CAMPEON DE "+NombreLiga.toUpperCase()+" "+Agno+"-"+Anio+"!!!!!\nFelicidades "+Campeon.NombreEquipo+"!!!\n"+"El campeón se llevará $"+Premio, 
                              "FIN DE LA LIGA "+NombreLiga.toUpperCase()+" "+Agno+"-"+Anio, 
                              JOptionPane.INFORMATION_MESSAGE);
                    
                    }
                    
                    //for (Equipo Sulin : Equipos){
                    //    Sulin.EstadisticasLiga.ReinicioTorn();
                    //}
                    
                    //Etapa = "1ra";
                    //Fecha = 1;
                }
            }
        
        
        }
    }
    
    public void terminoLigaEmpezarNueva(){
        for (Equipo Sulin : Equipos){
                     Sulin.EstadisticasLiga.ReinicioTorn();
        }
        Etapa = "1ra";
        Fecha = 1;

    }
    
    
    public Equipo getCampeon(){
        Equipo Campion = Equipos.get(0);
        
        for (Equipo y : Equipos){
            if (y.EstadisticasLiga.Puntos > Campion.EstadisticasLiga.Puntos && y.EstadisticasLiga.PartidosGanados > Campion.EstadisticasLiga.PartidosGanados){
                Campion = y;
            }
        }
        return Campion;
    }
    
    public ArrayList<Equipo> getPrimerosDos(){
        Equipo Campi = getCampeon();
        Equipo Second = Equipos.get(0);
        Equipos.remove(Campi);
        
        
        for (Equipo y : Equipos){
        if (y.EstadisticasLiga.Puntos > Second.EstadisticasLiga.Puntos && y.EstadisticasLiga.PartidosGanados > Second.EstadisticasLiga.PartidosGanados){
                Second = y;
          }
        }
        
        ArrayList<Equipo> MejoresDos = new ArrayList<>();
        MejoresDos.add(Campi);
        MejoresDos.add(Second);
        Equipos.add(Campi);

        return MejoresDos;
    }
    
    
    public String JugarPartidoReturn(Equipo x,Equipo y){
        x.EntrenosPorEquipo = 2;
        y.EntrenosPorEquipo = 2;
        int MarcadorX = 0;
        int MarcadorY = 0;
        
        
        for (int i = 0;i<90+dat.RangeRandint(0, 5);i++){
            if (x.PoderTotal() > y.PoderTotal()){
                
                int tun = dat.RangeRandint(0, 100);
                
                if (tun<=5){
                    
                    if (x.calcularAtaque() > y.calcularPorteria() * 0.2){
                        int ggu = dat.RangeRandint(0,100);
                        
                        if (ggu<=70){
                            MarcadorX++;
                            x.EstadisticasLiga.GolesAnotados++;
                            y.EstadisticasLiga.GolesEncontra++;
                        }
                        
                    }else{
                    
                        int gugu = dat.RangeRandint(0, 100);
                        
                        if (gugu<=50){
                            MarcadorX++;
                            x.EstadisticasLiga.GolesAnotados++;
                            y.EstadisticasLiga.GolesEncontra++;
                        }
                    }
                }else{
                    
                    int ba = dat.RangeRandint(0, 100);
                    
                    if (ba<=3){
                        
                        if (y.calcularAtaque() > x.calcularPorteria() * 0.6){
                            int gugu = dat.RangeRandint(0, 100);
                            if (gugu<=50){
                            MarcadorY++;
                            y.EstadisticasLiga.GolesAnotados++;
                            x.EstadisticasLiga.GolesEncontra++;
                            
                            }
                        }else{
                            int giu = dat.RangeRandint(0, 100);
                            if (giu<=30){
                                MarcadorY++;
                                y.EstadisticasLiga.GolesAnotados++;
                                x.EstadisticasLiga.GolesEncontra++; 
                            }
                        }
                    }
                }
            }else if (y.PoderTotal() > x.PoderTotal()){
                int tun = dat.RangeRandint(0, 100);
                
                if (tun<=5){
                    
                    if (y.calcularAtaque() > x.calcularPorteria() * 0.2){
                        int ggu = dat.RangeRandint(0,100);
                        
                        if (ggu<=70){
                            MarcadorY++;
                            y.EstadisticasLiga.GolesAnotados++;
                            x.EstadisticasLiga.GolesEncontra++;
                        }
                        
                    }else{
                    
                        int gugu = dat.RangeRandint(0, 100);
                        
                        if (gugu<=50){
                            MarcadorY++;
                            y.EstadisticasLiga.GolesAnotados++;
                            x.EstadisticasLiga.GolesEncontra++;
                        }
                    }
                }else{
                    
                    int ba = dat.RangeRandint(0, 100);
                    
                    if (ba<=3){
                        
                        if (x.calcularAtaque() > y.calcularPorteria() * 0.6){
                            int gugu = dat.RangeRandint(0, 100);
                            if (gugu<=50){
                            MarcadorY++;
                            x.EstadisticasLiga.GolesAnotados++;
                            y.EstadisticasLiga.GolesEncontra++;
                            
                            }
                        }else{
                            int giu = dat.RangeRandint(0, 100);
                            if (giu<=30){
                                MarcadorY++;
                                x.EstadisticasLiga.GolesAnotados++;
                                y.EstadisticasLiga.GolesEncontra++; 
                            }
                        }
                    }
                }
            }else if (x.PoderTotal() == y.PoderTotal()){
                int tun = dat.RangeRandint(0, 100);
                if (tun<=50){
                    int boi = dat.RangeRandint(0, 100);
                    if (boi<=3){
                        MarcadorY++;
                        y.EstadisticasLiga.GolesAnotados++;
                        x.EstadisticasLiga.GolesEncontra++;
                    }

                }else if (tun<=100){
                    MarcadorX++;
                    x.EstadisticasLiga.GolesAnotados++;
                    y.EstadisticasLiga.GolesEncontra++;
                }
            }
        }
        
        String Marcador = "";
        
        if (MarcadorX > MarcadorY){
            
            x.EstadisticasLiga.PartidosGanados++;
            y.EstadisticasLiga.PartidosPerdidos++;
            
            if (x.Fans<x.EstEquipo.Capacidad){
                x.Dinero+=x.Fans * x.EstEquipo.PrecioEntradas;
            }else{
                x.Dinero+=x.EstEquipo.Capacidad * x.EstEquipo.PrecioEntradas;
            }
            if (y.Fans<y.EstEquipo.Capacidad){
                y.Dinero+=y.Fans * y.EstEquipo.PrecioEntradas;
            }else{
                y.Dinero+=y.EstEquipo.Capacidad * y.EstEquipo.PrecioEntradas;
            }
            
            x.Fans+=dat.RangeRandint(0, 300);
            y.Fans-=dat.RangeRandint(0, 300);
            
            if (y.Fans<0){
                y.Fans = 0;
            }
            
            x.EstadisticasLiga.Puntos += 3;
            
            Marcador = x.NombreEquipo+" "+MarcadorX+"-"+MarcadorY+" "+y.NombreEquipo;
            
            
        }else if (MarcadorY > MarcadorX){
            
            y.EstadisticasLiga.PartidosGanados++;
            x.EstadisticasLiga.PartidosPerdidos++;
            
            if (x.Fans<x.EstEquipo.Capacidad){
                x.Dinero+=x.Fans * x.EstEquipo.PrecioEntradas;
            }else{
                x.Dinero+=x.EstEquipo.Capacidad * x.EstEquipo.PrecioEntradas;
            }
            if (y.Fans<y.EstEquipo.Capacidad){
                y.Dinero+=y.Fans * y.EstEquipo.PrecioEntradas;
            }else{
                y.Dinero+=y.EstEquipo.Capacidad * y.EstEquipo.PrecioEntradas;
            }
            
            y.Fans+=dat.RangeRandint(0, 300);
            x.Fans-=dat.RangeRandint(0, 300);
            
            if (x.Fans<0){
                x.Fans = 0;
            }
            
            y.EstadisticasLiga.Puntos += 3;
            
            Marcador = x.NombreEquipo+" "+MarcadorX+"-"+MarcadorY+" "+y.NombreEquipo;
            
            
            
        
        }else if (MarcadorX == MarcadorY){
            
            x.EstadisticasLiga.PartidosEmpatados++;
            y.EstadisticasLiga.PartidosEmpatados++;
            x.EstadisticasLiga.Puntos++;
            y.EstadisticasLiga.Puntos++;
            
            if (x.Fans<x.EstEquipo.Capacidad){
                x.Dinero+=x.Fans * x.EstEquipo.PrecioEntradas;
            }else{
                x.Dinero+=x.EstEquipo.Capacidad * x.EstEquipo.PrecioEntradas;
            }
            if (y.Fans<y.EstEquipo.Capacidad){
                y.Dinero+=y.Fans * y.EstEquipo.PrecioEntradas;
            }else{
                y.Dinero+=y.EstEquipo.Capacidad * y.EstEquipo.PrecioEntradas;
            }
            Marcador = x.NombreEquipo+" "+MarcadorX+"-"+MarcadorY+" "+y.NombreEquipo;
        }
        return Marcador;
    }
    
     
    
    
    public void JugarPartidoSimlar(Equipo x,Equipo y){
        x.EntrenosPorEquipo = 2;
        y.EntrenosPorEquipo = 2;
        int MarcadorX = 0;
        int MarcadorY = 0;
        
        
        for (int i = 0;i<90+dat.RangeRandint(0, 5);i++){
            if (x.PoderTotal() > y.PoderTotal()){
                
                int tun = dat.RangeRandint(0, 100);
                
                if (tun<=5){
                    
                    if (x.calcularAtaque() > y.calcularPorteria() * 0.2){
                        int ggu = dat.RangeRandint(0,100);
                        
                        if (ggu<=70){
                            MarcadorX++;
                            x.EstadisticasLiga.GolesAnotados++;
                            y.EstadisticasLiga.GolesEncontra++;
                        }
                        
                    }else{
                    
                        int gugu = dat.RangeRandint(0, 100);
                        
                        if (gugu<=50){
                            MarcadorX++;
                            x.EstadisticasLiga.GolesAnotados++;
                            y.EstadisticasLiga.GolesEncontra++;
                        }
                    }
                }else{
                    
                    int ba = dat.RangeRandint(0, 100);
                    
                    if (ba<=3){
                        
                        if (y.calcularAtaque() > x.calcularPorteria() * 0.6){
                            int gugu = dat.RangeRandint(0, 100);
                            if (gugu<=50){
                            MarcadorY++;
                            y.EstadisticasLiga.GolesAnotados++;
                            x.EstadisticasLiga.GolesEncontra++;
                            
                            }
                        }else{
                            int giu = dat.RangeRandint(0, 100);
                            if (giu<=30){
                                MarcadorY++;
                                y.EstadisticasLiga.GolesAnotados++;
                                x.EstadisticasLiga.GolesEncontra++; 
                            }
                        }
                    }
                }
            }else if (y.PoderTotal() > x.PoderTotal()){
                int tun = dat.RangeRandint(0, 100);
                
                if (tun<=5){
                    
                    if (y.calcularAtaque() > x.calcularPorteria() * 0.2){
                        int ggu = dat.RangeRandint(0,100);
                        
                        if (ggu<=70){
                            MarcadorY++;
                            y.EstadisticasLiga.GolesAnotados++;
                            x.EstadisticasLiga.GolesEncontra++;
                        }
                        
                    }else{
                    
                        int gugu = dat.RangeRandint(0, 100);
                        
                        if (gugu<=50){
                            MarcadorY++;
                            y.EstadisticasLiga.GolesAnotados++;
                            x.EstadisticasLiga.GolesEncontra++;
                        }
                    }
                }else{
                    
                    int ba = dat.RangeRandint(0, 100);
                    
                    if (ba<=3){
                        
                        if (x.calcularAtaque() > y.calcularPorteria() * 0.6){
                            int gugu = dat.RangeRandint(0, 100);
                            if (gugu<=50){
                            MarcadorY++;
                            x.EstadisticasLiga.GolesAnotados++;
                            y.EstadisticasLiga.GolesEncontra++;
                            
                            }
                        }else{
                            int giu = dat.RangeRandint(0, 100);
                            if (giu<=30){
                                MarcadorY++;
                                x.EstadisticasLiga.GolesAnotados++;
                                y.EstadisticasLiga.GolesEncontra++; 
                            }
                        }
                    }
                }
            }else if (x.PoderTotal() == y.PoderTotal()){
                int tun = dat.RangeRandint(0, 100);
                if (tun<=50){
                    int boi = dat.RangeRandint(0, 100);
                    if (boi<=3){
                        MarcadorY++;
                        y.EstadisticasLiga.GolesAnotados++;
                        x.EstadisticasLiga.GolesEncontra++;
                    }

                }else if (tun<=100){
                    MarcadorX++;
                    x.EstadisticasLiga.GolesAnotados++;
                    y.EstadisticasLiga.GolesEncontra++;
                }
            }
        }
        
       
        
        if (MarcadorX > MarcadorY){
            
            x.EstadisticasLiga.PartidosGanados++;
            y.EstadisticasLiga.PartidosPerdidos++;
            
            if (x.Fans<x.EstEquipo.Capacidad){
                x.Dinero+=x.Fans * x.EstEquipo.PrecioEntradas;
            }else{
                x.Dinero+=x.EstEquipo.Capacidad * x.EstEquipo.PrecioEntradas;
            }
            if (y.Fans<y.EstEquipo.Capacidad){
                y.Dinero+=y.Fans * y.EstEquipo.PrecioEntradas;
            }else{
                y.Dinero+=y.EstEquipo.Capacidad * y.EstEquipo.PrecioEntradas;
            }
            
            x.Fans+=dat.RangeRandint(0, 300);
            y.Fans-=dat.RangeRandint(0, 300);
            
            if (y.Fans<0){
                y.Fans = 0;
            }
            
            x.EstadisticasLiga.Puntos += 3;
            
            
            
            
        }else if (MarcadorY > MarcadorX){
            
            y.EstadisticasLiga.PartidosGanados++;
            x.EstadisticasLiga.PartidosPerdidos++;
            
            if (x.Fans<x.EstEquipo.Capacidad){
                x.Dinero+=x.Fans * x.EstEquipo.PrecioEntradas;
            }else{
                x.Dinero+=x.EstEquipo.Capacidad * x.EstEquipo.PrecioEntradas;
            }
            if (y.Fans<y.EstEquipo.Capacidad){
                y.Dinero+=y.Fans * y.EstEquipo.PrecioEntradas;
            }else{
                y.Dinero+=y.EstEquipo.Capacidad * y.EstEquipo.PrecioEntradas;
            }
            
            y.Fans+=dat.RangeRandint(0, 300);
            x.Fans-=dat.RangeRandint(0, 300);
            
            if (x.Fans<0){
                x.Fans = 0;
            }
            
            y.EstadisticasLiga.Puntos += 3;
            
           
            
            
            
        
        }else if (MarcadorX == MarcadorY){
            
            x.EstadisticasLiga.PartidosEmpatados++;
            y.EstadisticasLiga.PartidosEmpatados++;
            x.EstadisticasLiga.Puntos++;
            y.EstadisticasLiga.Puntos++;
            
            if (x.Fans<x.EstEquipo.Capacidad){
                x.Dinero+=x.Fans * x.EstEquipo.PrecioEntradas;
            }else{
                x.Dinero+=x.EstEquipo.Capacidad * x.EstEquipo.PrecioEntradas;
            }
            if (y.Fans<y.EstEquipo.Capacidad){
                y.Dinero+=y.Fans * y.EstEquipo.PrecioEntradas;
            }else{
                y.Dinero+=y.EstEquipo.Capacidad * y.EstEquipo.PrecioEntradas;
            }
            
        }
        
    }
    
    
    
}
