/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author wesker
 */
public class Futbolista {
    String Nombre;
    String Apellido;
    int Edad;
    int Dorsal;
    String Posicion;
    int Tiro;
    int Pase;
    int Defensa;
    int Porteria;
    double Media;
    int Precio;
    
    int PreguntasSobreRetiro = 1;
    int OfertasSobreContrato = 3; 
    
    boolean Lesionado = false;
    String IntensidadEntrenamiento = "Normal";
    Contrato ContratoJugador;
    
    DatosYNumeros dat = new DatosYNumeros();
    
    public Futbolista(String Nombre, String Apellido,int Edad,int Dorsal,String Posicion,Contrato ContratoJugador) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Dorsal = Dorsal;
        this.Posicion = Posicion;
        switch (this.Posicion) {
            case "Defensa" -> {
                this.Tiro = dat.RangeRandint(0, 50);
                this.Pase = dat.RangeRandint(20, 60);
                this.Defensa = dat.RangeRandint(40, 100);
                this.Porteria = dat.RangeRandint(0, 15);
            }
            case "Mediocampista" -> {
                this.Tiro = dat.RangeRandint(40, 80);
                this.Pase = dat.RangeRandint(60, 100);
                this.Defensa = dat.RangeRandint(20, 60);
                this.Porteria = dat.RangeRandint(0, 15);
            }
            case "Atacante" -> {
                this.Tiro = dat.RangeRandint(60, 100);
                this.Pase = dat.RangeRandint(40, 80);
                this.Defensa = dat.RangeRandint(0, 40);
                this.Porteria = dat.RangeRandint(0, 15);
            }
            case "Arquero" -> {
                this.Tiro = dat.RangeRandint(0, 50);
                this.Pase = dat.RangeRandint(0, 60);
                this.Defensa = dat.RangeRandint(0, 60);
                this.Porteria = dat.RangeRandint(30, 100);
            }
        }
        this.ContratoJugador = ContratoJugador;
       
        this.Media = (this.Tiro + this.Pase + this.Defensa + this.Porteria) / 4;
        this.Precio = 0;
    }

   

    

    public void Entrenar(){ 
        switch (this.Posicion){
            case "Defensa" ->{
               if (this.Edad<27){
                   if (this.Defensa<75){
                       this.Pase+=dat.RangeRandint(0, 1);
                       this.Defensa+=dat.RangeRandint(0, 2);
                       this.Tiro+=dat.RangeRandint(0, 1);
                   }else{
                       this.Pase+=dat.RangeRandint(0, 1);
                       this.Defensa+=dat.RangeRandint(0, 1);
                       this.Tiro+=dat.RangeRandint(0, 1);
                   }
               }else{
                   this.Pase+=dat.RangeRandint(0, 1);
                   this.Defensa+=dat.RangeRandint(0, 1);
                   this.Tiro+=dat.RangeRandint(0, 1);
               }      
            }
            case "Mediocampista" ->{
                if (this.Edad<27){
                   if (this.Pase<75){
                       this.Pase+=dat.RangeRandint(0, 2);
                       this.Defensa+=dat.RangeRandint(0, 1);
                       this.Tiro+=dat.RangeRandint(0, 1);
                   }else{
                       this.Pase+=dat.RangeRandint(0, 1);
                       this.Defensa+=dat.RangeRandint(0, 1);
                       this.Tiro+=dat.RangeRandint(0, 1);
                   }
               }else{
                   this.Pase+=dat.RangeRandint(0, 1);
                   this.Defensa+=dat.RangeRandint(0, 1);
                   this.Tiro+=dat.RangeRandint(0, 1);
               } 
            }
            case "Atacante" ->{
                if (this.Edad<27){
                   if (this.Defensa<75){
                       this.Pase+=dat.RangeRandint(0, 1);
                       this.Defensa+=dat.RangeRandint(0, 1);
                       this.Tiro+=dat.RangeRandint(0, 2);
                   }else{
                       this.Pase+=dat.RangeRandint(0, 1);
                       this.Defensa+=dat.RangeRandint(0, 1);
                       this.Tiro+=dat.RangeRandint(0, 1);
                   }
               }else{
                   this.Pase+=dat.RangeRandint(0, 1);
                   this.Defensa+=dat.RangeRandint(0, 1);
                   this.Tiro+=dat.RangeRandint(0, 1);
               } 
            }
            case "Arquero" ->{
                if (this.Edad<34){
                   if (this.Defensa<75){
                       this.Pase+=dat.RangeRandint(0, 1);
                       this.Defensa+=dat.RangeRandint(0, 1);
                       this.Porteria+=dat.RangeRandint(0, 2);
                  
                   }else{
                       this.Pase+=dat.RangeRandint(0, 1);
                       this.Defensa+=dat.RangeRandint(0, 1);
                       this.Porteria+=dat.RangeRandint(0, 2);
                   }
               }else{
                   this.Pase+=dat.RangeRandint(0, 1);
                   this.Defensa+=dat.RangeRandint(0, 1);
                   this.Porteria+=dat.RangeRandint(0, 2);
               } 
            }
            default ->{
            } 
        }
        LimitarTodosAtributos();
        TasarPrecio();

    }
    
    public int LimitadorAtris(int CurrentStat){
        if (CurrentStat<=0){
            return 0;
        }else if (CurrentStat>=100){
            return 100;
        }else{
            return CurrentStat;
        }
        
    }

    public void LimitarTodosAtributos() {
        this.Porteria = LimitadorAtris(this.Porteria);
        this.Tiro = LimitadorAtris(this.Tiro);
        this.Pase = LimitadorAtris(this.Pase);
        this.Defensa = LimitadorAtris(this.Defensa);
        this.Media = (this.Pase+this.Tiro+this.Porteria+this.Defensa)/4;
    }

    public void TasarPrecio() {
        int[] Atributos = {this.Tiro,this.Defensa,this.Porteria,this.Pase};
        
        if (this.Edad>32){
            
            int n = 42;
            double r = 1.1;
            double Atris = 0;
            
            for (int X : Atributos){
                Atris+=X;
            }
            Atris = Atris * 4;
            
            Atris = Atris * dat.getMean(Atributos);
            
            Atris = Atris * dat.getMax(Atributos)/6;
            
            this.Precio = (int) (Atris * (Math.pow(r, (n-this.Edad))));
        }else{
            double r = 1.1;
            
            double Atris = 0;
            
            for (int k : Atributos){
                Atris+=k;
            }
            
            Atris = Atris * 4;
            
            Atris = Atris * dat.getMean(Atributos);
            
            Atris = Atris * dat.getMax(Atributos)/6;
            
            this.Precio = (int) (Atris * (Math.pow(r, (this.Edad-1))));
        } 
    }
    
    public void Limitar(){
        
        if (this.Edad>32){
            
            switch (this.Posicion){
                case "Defensa" ->{
                    this.Pase-=dat.RangeRandint(0,3);
                    this.Defensa-=dat.RangeRandint(0, 5);
                    this.Tiro-=dat.RangeRandint(0, 2);
                }
                case "Mediocampista"->{
                    this.Pase-=dat.RangeRandint(0,5);
                    this.Defensa-=dat.RangeRandint(0, 2);
                    this.Tiro-=dat.RangeRandint(0, 3);
                
                }
                case "Atacante"->{
                    this.Pase-=dat.RangeRandint(0,2);
                    this.Defensa-=dat.RangeRandint(0, 3);
                    this.Tiro-=dat.RangeRandint(0, 5);
                
                }          
            }
        }else if (this.Edad>35){
            switch (this.Posicion){
                case "Defensa" ->{
                    this.Pase-=dat.RangeRandint(0,3);
                    this.Defensa-=dat.RangeRandint(0, 5);
                    this.Tiro-=dat.RangeRandint(0, 2);
                }
                case "Mediocampista"->{
                    this.Pase-=dat.RangeRandint(0,5);
                    this.Defensa-=dat.RangeRandint(0, 2);
                    this.Tiro-=dat.RangeRandint(0, 3);
                
                }
                case "Atacante"->{
                    this.Pase-=dat.RangeRandint(0,2);
                    this.Defensa-=dat.RangeRandint(0, 3);
                    this.Tiro-=dat.RangeRandint(0, 5);
                
                }
                case "Arquero"->{
                    this.Pase-=dat.RangeRandint(0, 3);
                    this.Defensa=dat.RangeRandint(0, 2);
                    this.Porteria=dat.RangeRandint(0, 5);
                }
            }
        }else if (this.Lesionado==true){
            if (this.Edad>32){
            switch (this.Posicion){
                case "Defensa" ->{
                    this.Pase-=dat.RangeRandint(0,9);
                    this.Defensa-=dat.RangeRandint(0, 8);
                    this.Tiro-=dat.RangeRandint(0, 9);
                }
                case "Mediocampista"->{
                    this.Pase-=dat.RangeRandint(0,8);
                    this.Defensa-=dat.RangeRandint(0, 9);
                    this.Tiro-=dat.RangeRandint(0, 9);
                }
                case "Atacante"->{
                    this.Pase-=dat.RangeRandint(0,9);
                    this.Defensa-=dat.RangeRandint(0, 9);
                    this.Tiro-=dat.RangeRandint(0, 8);
                }
                case "Arquero"->{
                    this.Pase-=dat.RangeRandint(0, 10);
                    this.Defensa=dat.RangeRandint(0, 11);
                    this.Porteria=dat.RangeRandint(0, 7);
                }
            }
            }else{
                switch (this.Posicion){
                case "Defensa" ->{
                    this.Pase-=dat.RangeRandint(0,1);
                    this.Defensa-=dat.RangeRandint(0, 2);
                    this.Tiro-=dat.RangeRandint(0, 1);
                }
                case "Mediocampista"->{
                    this.Pase-=dat.RangeRandint(0,2);
                    this.Defensa-=dat.RangeRandint(0, 1);
                    this.Tiro-=dat.RangeRandint(0, 1);
                
                }
                case "Atacante"->{
                    this.Pase-=dat.RangeRandint(0,1);
                    this.Defensa-=dat.RangeRandint(0, 1);
                    this.Tiro-=dat.RangeRandint(0, 2);
                }
                case "Arquero"->{
                    this.Pase-=dat.RangeRandint(0, 1);
                    this.Defensa=dat.RangeRandint(0, 1);
                    this.Porteria=dat.RangeRandint(0, 2);
                }
            }
            }
            
        }
        
        this.TasarPrecio();
        this.LimitarTodosAtributos();
    }
    
    
    public void respuestaSobreRetiro(){
        
        HashMap<Integer,String> Suler = new HashMap<>();
        
        if (this.PreguntasSobreRetiro!=0){
        
        
        
        String[] NoRetirar = {
    "Aún siento una gran pasión por el fútbol y creo que tengo mucho más\n para dar en el campo. No estoy listo para retirarme todavía.",
    "Mi amor por el juego sigue siendo fuerte y me encuentro en\nexcelente forma física. Quiero seguir compitiendo y disfrutando del fútbol por varios años más.",
    "El fútbol es mi vida y no puedo imaginarme sin jugar. Estoy decidido\n a seguir adelante y continuar mi carrera por todo el tiempo que pueda.",
    "Siento que todavía tengo objetivos por alcanzar y experiencias\n por vivir en el fútbol. Retirarme\n ahora no es una opción para mí; quiero seguir persiguiendo mis sueños en el campo."
};
        String[] Quiza =  {
    "Todavía siento que tengo mucho que ofrecer en el campo\n. Voy a seguir jugando un par de años más y ver cómo me siento\n físicamente y mentalmente.",
    "Estoy en un punto de mi carrera\n donde debo considerar mi salud\n a largo plazo. Aunque amo el fútbol, podría ser momento\n de colgar las botas para evitar futuras lesiones.",
    "Voy a tomarme un tiempo para evaluar mi situación\n con mi familia y mi equipo. No descarto la posibilidad de retirarme, pero también\n podría seguir jugando si encuentro una motivación renovada."
        };
        String[] SiRetirarme = {
    "Después de una carrera llena de momentos inolvidables\n y logros con mi equipo, siento que es el momento\n adecuado para retirarme y dejar paso a la próxima generación.",
    "He dado todo lo que tenía en el campo y me siento\n orgulloso de lo que he conseguido. Es hora de despedirme como\n ídolo de este equipo y comenzar una nueva etapa en mi vida.",
    "La decisión no ha sido fácil, pero creo que es el momento\n correcto para colgar las botas. Me retiro con la satisfacción\n de haberlo dado todo por mi equipo y por nuestros increíbles aficionados.",
    "He vivido mis sueños como futbolista y he alcanzado más\n de lo que imaginé. Ahora, es el momento de retirarme y disfrutar\n de esta etapa final de mi carrera como un verdadero ídolo del club."
        };
        
        
        if (this.Edad<33){
            int Retiro = dat.RangeRandint(0, 100);
            if (Retiro>=97 && Retiro<=100){
                JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(NoRetirar), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
        switch (this.Posicion){
            case "Atacante" ->{
                if (this.Tiro>=90 && this.Tiro<=100){
                    int Retiro = dat.RangeRandint(0, 100);
                    
                    if (Retiro>=75 && Retiro<=100){
                         JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }else if (this.Tiro>=70 && this.Tiro<=89){
                    
                    int Retiro = dat.RangeRandint(0, 100);
                    
                    if (Retiro>=55 && Retiro<=100){
                         JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }
                }else if (this.Tiro<69){
                    int Retiro = dat.RangeRandint(0, 100);
                    if (Retiro>=25 && Retiro<=100){
                        JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            case "Mediocampista" ->{
                if (this.Pase>=90 && this.Pase<=100){
                    int Retiro = dat.RangeRandint(0, 100);
                    
                    if (Retiro>=75 && Retiro<=100){
                         JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }else if (this.Pase>=70 && this.Pase<=89){
                    
                    int Retiro = dat.RangeRandint(0, 100);
                    
                    if (Retiro>=55 && Retiro<=100){
                         JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }
                }else if (this.Pase<69){
                    int Retiro = dat.RangeRandint(0, 100);
                    if (Retiro>=25 && Retiro<=100){
                        JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            case "Defensa"->{
                if (this.Defensa>=90 && this.Defensa<=100){
                    int Retiro = dat.RangeRandint(0, 100);
                    
                    if (Retiro>=75 && Retiro<=100){
                         JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }
                    
                }else if (this.Defensa>=70 && this.Defensa<=89){
                    
                    int Retiro = dat.RangeRandint(0, 100);
                    
                    if (Retiro>=55 && Retiro<=100){
                         JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }
                }else if (this.Defensa<69){
                    int Retiro = dat.RangeRandint(0, 100);
                    if (Retiro>=25 && Retiro<=100){
                        JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            case "Arquero"->{
                if (this.Edad<38){
                    if (this.Porteria<80){
                        int Dati = dat.RangeRandint(0,100);
                        if (Dati>=50 && Dati<=100){
                            JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                        }
                    }else if (this.Porteria<70){
                        int Dati = dat.RangeRandint(0,100);
                        if (Dati>=20 && Dati<=100){
                            JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                        }
                    }
                    
                    
                }else{
                    int Dati = dat.RangeRandint(0, 100);
                    
                    if (Dati>=15 && Dati<=100){
                        JOptionPane.showMessageDialog(null, 
                              dat.RetornarRandomString(SiRetirarme), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Suler.put(0, dat.RetornarRandomString(Quiza));
                        Suler.put(1,dat.RetornarRandomString(NoRetirar));
                        JOptionPane.showMessageDialog(null, 
                              Suler.get(dat.RangeRandint(0, 1)), 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        }
        }
        
        this.PreguntasSobreRetiro--;
        
    }else{
            JOptionPane.showMessageDialog(null, 
                              "Ya me preguntaste sobre eso.", 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    
    //Esto retorna el atributo principal de la posicion
    public int getAtributoPrincipal(){
        switch (this.Posicion){
            case "Atacante"->{
                return this.Tiro;
            }
            case "Mediocampista"->{
                return this.Pase;
            }
            case "Defensa"->{
                return this.Defensa;
            }
            case "Arquero"->{
                return this.Porteria;
            }
        }
        return 0;
    }
    
    
    
    //Para todo este tipo de acciones tengo que hacer alguna cosa
    //En esto se generara un contrato la vista etc
    public boolean RespuestaPropuestaContrato(Contrato Propuesta){
        
        if (OfertasSobreContrato==0){
            JOptionPane.showMessageDialog(null, 
                              "No quiero tener esta discusión.", 
                              this.Nombre+" "+this.Apellido, 
                              JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
        
        
        if (this.Edad>=15 && this.Edad<=21){
            if (Propuesta.SalarioPorTemporada>this.ContratoJugador.SalarioPorTemporada){
                return AcortarCodigPropuestaContr(Propuesta,0,85);
            }else if (Propuesta.SalarioPorTemporada<this.ContratoJugador.SalarioPorTemporada){
                if (Propuesta.SalarioPorTemporada<this.ContratoJugador.SalarioPorTemporada * 0.7){
                    return AcortarCodigPropuestaContr(Propuesta,0,30);
                }else{
                    return AcortarCodigPropuestaContr(Propuesta,0,50);
                }
                
            }else if (Propuesta.SalarioPorTemporada==this.ContratoJugador.SalarioPorTemporada){

                return AcortarCodigPropuestaContr(Propuesta,0,70);
            }
            
        }else if (this.Edad>=22 && this.Edad<=30){
            
            if (Propuesta.SalarioPorTemporada>this.ContratoJugador.SalarioPorTemporada){
                
                if (Propuesta.SalarioPorTemporada>this.ContratoJugador.SalarioPorTemporada + this.ContratoJugador.SalarioPorTemporada * 0.3){
                    return AcortarCodigPropuestaContr(Propuesta,0,90);
                }else{
                    return AcortarCodigPropuestaContr(Propuesta,0,75);
                }
            }else if (Propuesta.SalarioPorTemporada<this.ContratoJugador.SalarioPorTemporada){
            
                if (Propuesta.SalarioPorTemporada<this.ContratoJugador.SalarioPorTemporada * 0.7){
                    return AcortarCodigPropuestaContr(Propuesta,0,15);
                }else{
                    return AcortarCodigPropuestaContr(Propuesta,0,20);
                }
                
            }else if (Propuesta.SalarioPorTemporada==this.ContratoJugador.SalarioPorTemporada){
                return AcortarCodigPropuestaContr(Propuesta,0,50);
            }
        }else if (this.Edad>=31 && this.Edad<=35){
            
            if (Propuesta.SalarioPorTemporada>this.ContratoJugador.SalarioPorTemporada){
                return AcortarCodigPropuestaContr(Propuesta,0,80);
            }else if (Propuesta.SalarioPorTemporada<this.ContratoJugador.SalarioPorTemporada){
                if (Propuesta.SalarioPorTemporada<this.ContratoJugador.SalarioPorTemporada * 0.7){
                    return AcortarCodigPropuestaContr(Propuesta,0,50);
                }else{
                    return AcortarCodigPropuestaContr(Propuesta,0,65);
                }
            }else if (Propuesta.SalarioPorTemporada==this.ContratoJugador.SalarioPorTemporada){
                return AcortarCodigPropuestaContr(Propuesta,0,95);
            }
        }else if (this.Edad>=36){
            if (Propuesta.SalarioPorTemporada>this.ContratoJugador.SalarioPorTemporada){
                return AcortarCodigPropuestaContr(Propuesta,0,95);
            }else if (Propuesta.SalarioPorTemporada<this.ContratoJugador.SalarioPorTemporada){
                if (Propuesta.SalarioPorTemporada<this.ContratoJugador.SalarioPorTemporada * 0.7){
                    return AcortarCodigPropuestaContr(Propuesta,0,70);
                }else{
                    return AcortarCodigPropuestaContr(Propuesta,0,80);
                }
            }else if (Propuesta.SalarioPorTemporada==this.ContratoJugador.SalarioPorTemporada){
                return AcortarCodigPropuestaContr(Propuesta,0,95);
            }
        }
        }
        return false;
    }
    
    
    
    
    public boolean AcortarCodigPropuestaContr(Contrato Propus,int Minimo,int Maximo){
        int Probabiliti = dat.RangeRandint(0, 100);
        if (Probabiliti>=Minimo && Probabiliti<=Maximo){
                        this.ContratoJugador.Equipo = Propus.Equipo;
                        this.ContratoJugador.TemporadasContrato+=Propus.TemporadasContrato;
                        this.ContratoJugador.SalarioPorTemporada= Propus.SalarioPorTemporada;
                        JOptionPane.showMessageDialog(null, 
                              this.Nombre+" "+this.Apellido+" a aceptado el contrato!", 
                              "Exito!!!", 
                              JOptionPane.INFORMATION_MESSAGE);
                        OfertasSobreContrato = 0;
                        return true;
                    }else{
                        JOptionPane.showMessageDialog(null, 
                              this.Nombre+" "+this.Apellido+" a rechazado el contrato.", 
                              "Fracaso", 
                              JOptionPane.WARNING_MESSAGE);
                    OfertasSobreContrato--;
                    return false;
                    }
    }

    
    
}
