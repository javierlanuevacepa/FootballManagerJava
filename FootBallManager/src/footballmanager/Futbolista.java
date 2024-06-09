/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;

import java.util.ArrayList;

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
    
    
    
    
    
    
}
