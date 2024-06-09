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
public class TorneoCopa {
    
    String NombreTorneo;
    ArrayList<Equipo> EquiposTorneo;
    String Continente;
    
    ArrayList<Equipo> Octavos = new ArrayList<>();
    ArrayList<Equipo> Cuartos = new ArrayList<>();
    ArrayList<Equipo> Semifinal = new ArrayList<>();
    
    String Fase = "";
    DatosYNumeros dat = new DatosYNumeros();
    
    Equipo Campeon = null;
    
    int Etapa = 1;

    
    //El string continente es un adorno nomas para las funciones igual el mundial de clubes tendra como atributo continetne mundial
    
    public TorneoCopa(String NombreTorneo,String Continente) {
        this.NombreTorneo = NombreTorneo;
        this.Continente = Continente;
    }
    
    public void setEquipoTorneo(ArrayList<Equipo> x ){
        this.EquiposTorneo = x;
    }
    
    public void TerminarTorneo(){
        EquiposTorneo.clear();
        Octavos.clear();
        Cuartos.clear();
        Semifinal.clear();
        Fase = "";
        Etapa = 1;
    }
    
    
    
    public void AvanzaCopa(boolean TorneoPlayer,VistaEquipo View,int Agno){
        switch (Etapa){
            case 1 ->{
                Fase = "Octavos de final";
                
                if (TorneoPlayer==true){
                
                View.Results.setText(NombreTorneo+" "+Fase);
                
                for (int i = 0;i<EquiposTorneo.size();i+=2){
                    Octavos.add(JugarPartidoReturn(EquiposTorneo.get(i),EquiposTorneo.get(i+1),View));
                }
                
                }else if (TorneoPlayer==false){
                    for (int i = 0;i<EquiposTorneo.size();i+=2){
                    Octavos.add(JugarPartidoSimulacion(EquiposTorneo.get(i),EquiposTorneo.get(i+1)));
                    }
                }
                normalizarGagrits();
                
                Etapa++;

            }
            case 2 ->{
                Fase = "Cuartos de final";
                
                if (TorneoPlayer==true){
                
                View.Results.setText(NombreTorneo+" "+Fase);
                
                for (int i = 0;i<Octavos.size();i+=2){
                    Cuartos.add(JugarPartidoReturn(Octavos.get(i),Octavos.get(i+1),View));
                }
                
                }else if (TorneoPlayer==false){
                    for (int i = 0;i<Octavos.size();i+=2){
                    Cuartos.add(JugarPartidoSimulacion(Octavos.get(i),Octavos.get(i+1)));
                    }
                }
                normalizarGagrits();
                Etapa++;
            }
            case 3 ->{
                Fase = "Semifinal";
                
                if (TorneoPlayer==true){
                
                View.Results.setText(NombreTorneo+" "+Fase);
                
                for (int i = 0;i<Cuartos.size();i+=2){
                    Semifinal.add(JugarPartidoReturn(Cuartos.get(i),Cuartos.get(i+1),View));
                }
                
                }else if (TorneoPlayer==false){
                    for (int i = 0;i<Cuartos.size();i+=2){
                    Semifinal.add(JugarPartidoSimulacion(Cuartos.get(i),Cuartos.get(i+1)));
                    }
                }
                normalizarGagrits();
            
                Etapa++;
                
            }
            case 4 ->{
                Fase = "Final";
                
                
                
                if (TorneoPlayer == true){
                    int AnioSig = Agno+1;
                    
                    Trofeo Tropie = new Trofeo(NombreTorneo+" "+Agno+"-"+AnioSig);
                    
                    
                    View.Results.setText(NombreTorneo+" "+Fase);
                    int Premio = dat.RangeRandint(8000000, 30000000);
                    Campeon = JugarPartidoReturn(Semifinal.get(0),Semifinal.get(1),View);
                    Campeon.Dinero+=Premio;
                    Campeon.Trofeos.add(Tropie);
                    
                    
                    
                    String Anuncio = "\nTENEMOS CAMPEON DE "+NombreTorneo.toUpperCase()+"!!!\n"+Campeon.NombreEquipo+" ES EL CAMPEON!!!\nSE LLEVARÁ $"+Premio;
                    
                    View.Results.append(Anuncio);
                    
                    JOptionPane.showMessageDialog(null, 
                              Anuncio, 
                              "FIN DE LA "+NombreTorneo.toUpperCase(), 
                              JOptionPane.INFORMATION_MESSAGE); 
                    normalizarGagrits();
                
                }else if (TorneoPlayer == false){
                    int AnioSig = Agno+1;
                    Trofeo Tropie = new Trofeo(NombreTorneo+" "+Agno+"-"+AnioSig);
                    
                    int Premio = dat.RangeRandint(8000000, 30000000);
                    Campeon = JugarPartidoSimulacion(Semifinal.get(0),Semifinal.get(1));
                    Campeon.Dinero+=Premio;
                    
                    Campeon.Trofeos.add(Tropie);
                    
                }
                normalizarGagrits();
            }
           
        }
        
    }
    
    
    public void normalizarGagrits(){
        for (Equipo Eqi : EquiposTorneo){
            for (Equipo Octa : Octavos){
                if (Eqi.NombreEquipo.equals(Octa.NombreEquipo)){
                    Eqi = Octa;
                }
            }
            for (Equipo Octa : Cuartos){
                if (Eqi.NombreEquipo.equals(Octa.NombreEquipo)){
                    Eqi = Octa;
                }
            }
            for (Equipo Octa : Semifinal){
                if (Eqi.NombreEquipo.equals(Octa.NombreEquipo)){
                    Eqi = Octa;
                }
            }
            
            if (Etapa == 4){
            if (Campeon.NombreEquipo.equals(Eqi.NombreEquipo) && Fase.equals("Final")){
                Eqi = Campeon;
            }
            }
        }
    }
    
    
    
    //En este estará el player
    public Equipo JugarPartidoReturn(Equipo x,Equipo y,VistaEquipo View){
        x.EntrenosPorEquipo = 2;
        y.EntrenosPorEquipo = 2;
        int MarcadorX = 0;
        int MarcadorY = 0;
        int PenalesX = 0;
        int PenalesY = 0;
        boolean Penales = false;
        
        for (int i = 0;i<90+dat.RangeRandint(0, 5);i++){
            if (x.PoderTotal() > y.PoderTotal()){
                
                int tun = dat.RangeRandint(0, 100);
                
                if (tun<=5){
                    
                    if (x.calcularAtaque() > y.calcularPorteria() * 0.2){
                        int ggu = dat.RangeRandint(0,100);
                        
                        if (ggu<=70){
                            MarcadorX++;
                         
                        }
                        
                    }else{
                    
                        int gugu = dat.RangeRandint(0, 100);
                        
                        if (gugu<=50){
                            MarcadorX++;
                   
                        }
                    }
                }else{
                    
                    int ba = dat.RangeRandint(0, 100);
                    
                    if (ba<=3){
                        
                        if (y.calcularAtaque() > x.calcularPorteria() * 0.6){
                            int gugu = dat.RangeRandint(0, 100);
                            if (gugu<=50){
                            MarcadorY++;
              
                            
                            }
                        }else{
                            int giu = dat.RangeRandint(0, 100);
                            if (giu<=30){
                                MarcadorY++;
            
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
   
                        }
                        
                    }else{
                    
                        int gugu = dat.RangeRandint(0, 100);
                        
                        if (gugu<=50){
                            MarcadorY++;

                        }
                    }
                }else{
                    
                    int ba = dat.RangeRandint(0, 100);
                    
                    if (ba<=3){
                        
                        if (x.calcularAtaque() > y.calcularPorteria() * 0.6){
                            int gugu = dat.RangeRandint(0, 100);
                            if (gugu<=50){
                            MarcadorY++;

                            
                            }
                        }else{
                            int giu = dat.RangeRandint(0, 100);
                            if (giu<=30){
                                MarcadorY++;

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
                     
                    }

                }else if (tun<=100){
                    MarcadorX++;
                 
                }
            }
        }
        
        String Marcador = "";
        
        if (MarcadorX > MarcadorY){
            

            
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
            
            
                
                View.Results.append("\n"+x.NombreEquipo+" "+MarcadorX+"-"+MarcadorY+" "+y.NombreEquipo+"\n");
          
            
            return x;
            
            
            
            
        }else if (MarcadorY > MarcadorX){
            
            
            
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
           
                
                View.Results.append("\n"+x.NombreEquipo+" "+MarcadorX+"-"+MarcadorY+" "+y.NombreEquipo+"\n");
          
            
            return y;
            
            
        
        }else if (MarcadorX == MarcadorY){
            
            Penales = true;
            
            while (Penales == true){
                
                int Gragle  = dat.RangeRandint(0, 100);
                
                if (Gragle>=0 && Gragle<=40){
                    PenalesX++;
                }else if (Gragle>=41 && Gragle<=80){
                    PenalesY++;
                }
                if (PenalesX-2==PenalesY || PenalesY-2 == PenalesX){
                    Penales = false;
                }
            }
            

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
            
            
            if (PenalesX>PenalesY){
          
                
                View.Results.append("\n"+x.NombreEquipo+" "+MarcadorX+"("+PenalesX+")-("+PenalesY+")"+MarcadorY+" "+y.NombreEquipo+"\n");
                return x;
            }else if (PenalesY>PenalesX){
           
                
                View.Results.append("\n"+x.NombreEquipo+" "+MarcadorX+"("+PenalesX+")-("+PenalesY+")"+MarcadorY+" "+y.NombreEquipo+"\n");
                return y;
            }
        }
        return null;
    }
    
    public Equipo JugarPartidoSimulacion(Equipo x,Equipo y){
        x.EntrenosPorEquipo = 2;
        y.EntrenosPorEquipo = 2;
        int MarcadorX = 0;
        int MarcadorY = 0;
        int PenalesX = 0;
        int PenalesY = 0;
        boolean Penales = false;
        
        for (int i = 0;i<90+dat.RangeRandint(0, 5);i++){
            if (x.PoderTotal() > y.PoderTotal()){
                
                int tun = dat.RangeRandint(0, 100);
                
                if (tun<=5){
                    
                    if (x.calcularAtaque() > y.calcularPorteria() * 0.2){
                        int ggu = dat.RangeRandint(0,100);
                        
                        if (ggu<=70){
                            MarcadorX++;
                         
                        }
                        
                    }else{
                    
                        int gugu = dat.RangeRandint(0, 100);
                        
                        if (gugu<=50){
                            MarcadorX++;
                   
                        }
                    }
                }else{
                    
                    int ba = dat.RangeRandint(0, 100);
                    
                    if (ba<=3){
                        
                        if (y.calcularAtaque() > x.calcularPorteria() * 0.6){
                            int gugu = dat.RangeRandint(0, 100);
                            if (gugu<=50){
                            MarcadorY++;
              
                            
                            }
                        }else{
                            int giu = dat.RangeRandint(0, 100);
                            if (giu<=30){
                                MarcadorY++;
            
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
   
                        }
                        
                    }else{
                    
                        int gugu = dat.RangeRandint(0, 100);
                        
                        if (gugu<=50){
                            MarcadorY++;

                        }
                    }
                }else{
                    
                    int ba = dat.RangeRandint(0, 100);
                    
                    if (ba<=3){
                        
                        if (x.calcularAtaque() > y.calcularPorteria() * 0.6){
                            int gugu = dat.RangeRandint(0, 100);
                            if (gugu<=50){
                            MarcadorY++;

                            
                            }
                        }else{
                            int giu = dat.RangeRandint(0, 100);
                            if (giu<=30){
                                MarcadorY++;

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
                     
                    }

                }else if (tun<=100){
                    MarcadorX++;
                 
                }
            }
        }
        
       
        
        if (MarcadorX > MarcadorY){
            
         
            
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
            
            return x; 
            
            
            
            
            
        }else if (MarcadorY > MarcadorX){
            
     
            
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
            
            return y;
            
          
            
            
            
        
        }else if (MarcadorX == MarcadorY){
            
            Penales = true;
            
            while (Penales == true){
                
                int Gragle  = dat.RangeRandint(0, 100);
                
                if (Gragle>=0 && Gragle<=40){
                    PenalesX++;
                }else if (Gragle>=41 && Gragle<=80){
                    PenalesY++;
                }
                if (PenalesX-2==PenalesY || PenalesY-2 == PenalesX){
                    Penales = false;
                }
            }
            

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
            
            
            if (PenalesX>PenalesY){
       
                
               
                return x;
            }else if (PenalesY>PenalesX){
         
                
                return y;
            }
        }
        return null;
    }
    
    
}
