/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footballmanager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author wesker
 */
public class Mundo {
    
    //okey la idea es tener todas las ligas
    //el asunto sera asi, primero pasara la liga, despues copa continental, despues copa mundial de los campeones continentales
    int Agno;

    public Mundo(int Agno) {
        this.Agno = Agno;
    }
    
    int Semana = 1;
    
    public void GenerarPlantelEquipo(Equipo x,String Pais){
        for (int i = 0 ; i<10;i++){
            x.OnceInicial.add(GenerarRandomPlayer(x,"",Pais));
        }
        x.OnceInicial.add(GenerarRandomPlayer(x,"Arquero",Pais));
        
        for (int g = 0 ; g<13;g++){
            x.Reserva.add(GenerarRandomPlayer(x,"",Pais));
        }
        x.Reserva.add(GenerarRandomPlayer(x,"Arquero",Pais));
        for (int s = 0; s<dat.RangeRandint(0, 2);s++){
            x.Reserva.add(GenerarRandomPlayer(x,"",Pais));
        }
    }
    
    public void GenerarDorsalesEquipo(Equipo x){
        for (int i = 0; i<101;i++){
            x.Dorsales.add(i);
        }
    }
    
    public Futbolista GenerarRandomPlayer(Equipo x,String Posicion,String Pais){
        switch (Posicion){
            case "Arquero" ->{
                int Index = dat.RangeRandint(0, x.Dorsales.size()-1);
                int DorsalJugador = x.Dorsales.get(Index);
                x.Dorsales.remove(Index);
                Contrato ContratoJug = new Contrato(x.NombreEquipo,dat.RangeRandint(200000, 800000),dat.RangeRandint(1, 5),dat.RangeRandint(2019, 2023));
                Futbolista Jugador = new Futbolista(dat.getRandomNombrePais(Pais),dat.getRandomAppPais(Pais),dat.RangeRandint(15, 35),DorsalJugador,"Arquero",ContratoJug);
                Jugador.TasarPrecio();
                return Jugador;
            }
            default ->{
                int Index = dat.RangeRandint(0, x.Dorsales.size()-1);
                int DorsalJugador = x.Dorsales.get(Index);
                x.Dorsales.remove(Index);
                Contrato ContratoJug = new Contrato(x.NombreEquipo,dat.RangeRandint(200000, 800000),dat.RangeRandint(1, 5),dat.RangeRandint(2019, 2023));
                Futbolista Jugador = new Futbolista(dat.getRandomNombrePais(Pais),dat.getRandomAppPais(Pais),dat.RangeRandint(15, 35),DorsalJugador,dat.RetornarRandomString(dat.Posiciones),ContratoJug);
                Jugador.TasarPrecio();
                return Jugador;
            }
        } 
    }
    
    
    DatosYNumeros dat = new DatosYNumeros();
    
   
    
    ArrayList<TorneoCopa> CopasContinentales = new ArrayList<>();
    
    TorneoCopa MundialClubes = null;
    
    
    //Esto iniciara liga chilena asta brasileña y europea etc 

    ArrayList<Liga> LigasAmerica = new ArrayList<>();
    ArrayList<Liga> LigasEuropa = new ArrayList<>();
    ArrayList<Liga> LigasAmericanortecentro = new ArrayList<>(); 
    ArrayList<Liga> LigasAsia = new ArrayList<>();
    
    public void IniciarKolin(){
        
        
        LigasAmerica.add(GenerarLiga("Liga Argentina","Argentina"));
        LigasAmerica.add(GenerarLiga("Liga Chilena","Chile"));
        LigasAmerica.add(GenerarLiga("Liga Brasil","Brasil"));
        LigasAmerica.add(GenerarLiga("Liga Peru","Peru"));
        LigasAmerica.add(GenerarLiga("Liga Uruguay","Uruguay"));
        LigasAmerica.add(GenerarLiga("Liga Bolivia","Bolivia"));
        LigasAmerica.add(GenerarLiga("Liga Venezuela","Venezuela"));
        LigasAmerica.add(GenerarLiga("Liga Colombia","Colombia"));

        //---
        LigasEuropa.add(GenerarLiga("Liga Espana","Espana"));
        LigasEuropa.add(GenerarLiga("Liga Escocia", "Escocia"));
        LigasEuropa.add(GenerarLiga("Liga Inglaterra", "Inglaterra"));
        LigasEuropa.add(GenerarLiga("Liga Portugal", "Portugal"));
        LigasEuropa.add(GenerarLiga("Liga Rusia", "Rusia"));
        LigasEuropa.add(GenerarLiga("Liga Alemania", "Alemania"));
        LigasEuropa.add(GenerarLiga("Liga Turquia", "Turquia"));
        LigasEuropa.add(GenerarLiga("Liga Italia", "Italia"));
        //--
        
       LigasAmericanortecentro.add(GenerarLiga("Liga MX", "Mexico"));
       LigasAmericanortecentro.add(GenerarLiga("Liga MLS", "Estados Unidos"));
       LigasAmericanortecentro.add(GenerarLiga("Liga Costa Rica", "Costa Rica"));
       LigasAmericanortecentro.add(GenerarLiga("Liga El Salvador", "El Salvador"));
       LigasAmericanortecentro.add(GenerarLiga("Liga Guatemala", "Guatemala"));
       LigasAmericanortecentro.add(GenerarLiga("Liga Cuba", "Cuba"));
       LigasAmericanortecentro.add(GenerarLiga("Liga Panama", "Panama"));
       LigasAmericanortecentro.add(GenerarLiga("Liga Honduras", "Honduras"));
        
        //--
        LigasAsia.add(GenerarLiga("Liga Japon", "Japon"));
        LigasAsia.add(GenerarLiga("Liga China", "China"));
        LigasAsia.add(GenerarLiga("Liga Corea", "Corea"));
        LigasAsia.add(GenerarLiga("Liga Arabia saudita", "Arabia saudita"));
        LigasAsia.add(GenerarLiga("Liga Australia", "Australia"));
        LigasAsia.add(GenerarLiga("Liga India", "India"));
        LigasAsia.add(GenerarLiga("Liga Indonesia", "Indonesia"));
        LigasAsia.add(GenerarLiga("Liga Tailandia", "Tailandia"));

        
        
        TorneoCopa CopaLiber = new TorneoCopa("Copa Libertadores","America");
        CopasContinentales.add(CopaLiber);
        
        TorneoCopa CopaOro = new TorneoCopa("Copa Oro ConcaChampions","America norte centro");
        CopasContinentales.add(CopaOro);
        
        TorneoCopa CopaUEFA = new TorneoCopa("Copa Champions League","Europa");
        CopasContinentales.add(CopaUEFA);
        
        TorneoCopa CopaAS = new TorneoCopa("Copa Champions League Asiatica","Asia");
        CopasContinentales.add(CopaAS);
        
    };
    
    public Liga GenerarLiga(String nombreLiga,String Pais){
        Liga ligs = new Liga(nombreLiga);
        
        for (String Ekipi : dat.getEquipoPaises(Pais)){
            EstadisticasEquipo LigaARS = new EstadisticasEquipo();
            LigaARS.NombreLigaOTorneo = nombreLiga;
            
            Estadio est = new Estadio("Estadio "+Ekipi,dat.RangeRandint(3000, 100000),dat.RangeRandint(7, 100));
            est.determinarGastoMantencion();
            Equipo Ekip = new Equipo(Ekipi,dat.RangeRandint(5000000, 40000000),dat.RangeRandint(3000, 40000),LigaARS,est);
            GenerarDorsalesEquipo(Ekip);
            GenerarPlantelEquipo(Ekip,Pais);
            Ekip.EntrenosPorEquipo = 2;
            ligs.Equipos.add(Ekip);
        }

        
        return ligs;
    }
    
    
    public void EleccionPlayer(int Cont,int Lig,String NombreEki){
        this.IndexContinentePlayer=Cont;
        this.IndexLigaPlayer=Lig;
        this.NombreEquipoP = NombreEki;
    }
    
    public Equipo getEquipoPlayer(){
        switch (IndexContinentePlayer){
            case 0 -> {
                
                for (Equipo y : LigasAmerica.get(IndexLigaPlayer).Equipos){
                    if (y.NombreEquipo.equals(NombreEquipoP)){
                        return y;
                    }
                }
            }
            case 1 ->{
                for (Equipo y : LigasEuropa.get(IndexLigaPlayer).Equipos){
                    if (y.NombreEquipo.equals(NombreEquipoP)){
                        return y;
                    }
                }
            }
            case 2 ->{
                for (Equipo y : LigasAsia.get(IndexLigaPlayer).Equipos){
                    if (y.NombreEquipo.equals(NombreEquipoP)){
                        return y;
                    }
                }
            }
            case 3 ->{
                for (Equipo y : LigasAmericanortecentro.get(IndexLigaPlayer).Equipos){
                    if (y.NombreEquipo.equals(NombreEquipoP)){
                        return y;
                    }
                }
            }
        }
        return null;
    }
    
    public Liga getLigaPlayer(){
        switch (IndexContinentePlayer){
            case 0 ->{
                return LigasAmerica.get(IndexLigaPlayer);
            }
            case 1 ->{
                return LigasEuropa.get(IndexLigaPlayer);
            }
            case 2 ->{
                return LigasAsia.get(IndexLigaPlayer);
            }
            case 3 ->{
                return LigasAmericanortecentro.get(IndexLigaPlayer);
            }
        }
        return null;
    }

    String NombreEquipoP = "";
    
    //ESto es para los torneos para tener distintos tipos de torneo
    
    public ArrayList<Equipo> getMejoresLigaContinen(String Continente,String NombreTorneo){
        ArrayList<Equipo> EquiposTorneo = new ArrayList<>();
        switch (Continente){
            case "America"->{
                for (Liga x : LigasAmerica){
                    ArrayList<Equipo> MejoresDos = x.getPrimerosDos();
                    for (Equipo S : MejoresDos){
                        EstadisticasEquipo Esta = new EstadisticasEquipo();
                        Esta.NombreLigaOTorneo = NombreTorneo;
                        S.EstadisticasCopas.add(Esta);
                    }
                    EquiposTorneo.add(MejoresDos.get(0));
                    EquiposTorneo.add(MejoresDos.get(1));
                    
                }
                return EquiposTorneo;
            }
            case "America norte centro"->{
                for (Liga x : LigasAmericanortecentro){
                    ArrayList<Equipo> MejoresDos = x.getPrimerosDos();
                    for (Equipo S : MejoresDos){
                        EstadisticasEquipo Esta = new EstadisticasEquipo();
                        Esta.NombreLigaOTorneo = NombreTorneo;
                        S.EstadisticasCopas.add(Esta);
                    }
                    EquiposTorneo.add(MejoresDos.get(0));
                    EquiposTorneo.add(MejoresDos.get(1));
                    
                }
                return EquiposTorneo;
            
            }
            case "Europa"->{
                for (Liga x : LigasEuropa){
                    ArrayList<Equipo> MejoresDos = x.getPrimerosDos();
                    for (Equipo S : MejoresDos){
                        EstadisticasEquipo Esta = new EstadisticasEquipo();
                        Esta.NombreLigaOTorneo = NombreTorneo;
                        S.EstadisticasCopas.add(Esta);
                    }
                    EquiposTorneo.add(MejoresDos.get(0));
                    EquiposTorneo.add(MejoresDos.get(1));
                    
                }
                return EquiposTorneo;
            
            }
            case "Asia"->{
                for (Liga x : LigasAsia){
                    ArrayList<Equipo> MejoresDos = x.getPrimerosDos();
                    for (Equipo S : MejoresDos){
                        EstadisticasEquipo Esta = new EstadisticasEquipo();
                        Esta.NombreLigaOTorneo = NombreTorneo;
                        S.EstadisticasCopas.add(Esta);
                    }
                    EquiposTorneo.add(MejoresDos.get(0));
                    EquiposTorneo.add(MejoresDos.get(1));
                    
                }
                return EquiposTorneo;
            
            }
        }
        return null;
    }
    
    
    
    
    //Habran metodos para los partidos en odnde el jugador se encuentre presente para poder ver toda la accion 
    //Index ocntinente 0 america 1 europa 2 asia 3 ame norte centro
    int IndexContinentePlayer;
    int IndexLigaPlayer;
    
 
    
    
    //CREAR METODO SIMULAR ACCIONES
    //DONDE EL EQUIPO QUE NO SEA EQUIVALENTE A EQUIPO PLAYER SE SIMULARA ACCIONES COMO VENTA DE JUGADORES FICHAJES CAMBIOS EN ALINEACION ENTRENAMIENTOS ETC
    
    
    //Finalemete hacer un metodo universal que pase etapas o 'semanas' aunque sean 50 o 60 jajajaj el jugador tendra que pasar igual aunque no haya ganado liga y clasificado a libert
    // o champion y eventualemtene tendra que ver tyambien el mundia lde clubes 
    
    
    //La idea es que liga americana sean 5: Chile,Brasil,Argentina,MLS,Mexico son 5
    // Y sacamos a los cuatro mejores de cada liga son 16
    //Con eliminacion directa y sin fase de grupos 
    
    public void AvanzarSemana(VistaEquipo View){
    
        
        if (Semana>=1 && Semana<=4){
            //Primer periodo transferencia
            
            //Si la liga es igual a liga del player simular y mostrar, en caso contrario solo simular.
            JOptionPane.showMessageDialog(null, 
                              "Periodo de traspaso disponible", 
                              "Semana "+Semana, 
                              JOptionPane.INFORMATION_MESSAGE);
            Semana++;
        
        }else if (Semana>=5 && Semana<=19){
            //Liga 1er tramo
            
            for (Liga x : LigasAmerica){
                if (x.equals(getLigaPlayer())){
                    x.JugarTorneo(true,View,this.Agno);
                }else{
                    x.JugarTorneo(false,View,this.Agno);
                }
            }
            
            for (Liga x : LigasEuropa){
                if (x.equals(getLigaPlayer())){
                    x.JugarTorneo(true,View,this.Agno);
                }else{
                    x.JugarTorneo(false,View,this.Agno);
                }
            }
            
            for (Liga x : LigasAsia){
                if (x.equals(getLigaPlayer())){
                    x.JugarTorneo(true,View,this.Agno);
                }else{
                    x.JugarTorneo(false,View,this.Agno);
                }
            }
            
            for (Liga x : LigasAmericanortecentro){
                if (x.equals(getLigaPlayer())){
                    x.JugarTorneo(true,View,this.Agno);
                }else{
                    x.JugarTorneo(false,View,this.Agno);
                }
            }
            
            
            
            Semana++;
            
        
        }else if (Semana>=20 && Semana<=24){
            //Segundo periodo transeferencia
            JOptionPane.showMessageDialog(null, 
                              "Periodo de traspaso disponible", 
                              "Semana "+Semana, 
                              JOptionPane.INFORMATION_MESSAGE);
            Semana++;
            
        }else if (Semana>=25 && Semana<=39){
            //Liga 2do Tramo
            for (Liga x : LigasAmerica){
                if (x.equals(getLigaPlayer())){
                    x.JugarTorneo(true,View,this.Agno);
                }else{
                    x.JugarTorneo(false,View,this.Agno);
                }
            }
            
            for (Liga x : LigasEuropa){
                if (x.equals(getLigaPlayer())){
                    x.JugarTorneo(true,View,this.Agno);
                }else{
                    x.JugarTorneo(false,View,this.Agno);
                }
            }
            
            for (Liga x : LigasAsia){
                if (x.equals(getLigaPlayer())){
                    x.JugarTorneo(true,View,this.Agno);
                }else{
                    x.JugarTorneo(false,View,this.Agno);
                }
            }
            
            for (Liga x : LigasAmericanortecentro){
                if (x.equals(getLigaPlayer())){
                    x.JugarTorneo(true,View,this.Agno);
                }else{
                    x.JugarTorneo(false,View,this.Agno);
                }
            }
            
            
            
            Semana++;
        }else if (Semana == 40){
            IniciarCopasContinentales();
            //Poner algo para que la cosa de estadisticas de liga se cambie a de torneo
            Semana++;
        }else if (Semana>=41 && Semana<=44){
            //Aunque el player no participe en los torneos de su continente vera obligado a observarlos igual jajaja
            for (TorneoCopa Copes : CopasContinentales){
                if (Copes.Continente.equals(getContinentePlayer())){
                    Copes.AvanzaCopa(true, View, Agno);
                }else{
                    Copes.AvanzaCopa(false, View, Agno);
                }
            }
            normalizarEquipos();
            
            //Torneo mundial jugaran los campeones de los torneos continentales y se verá si o si
            Semana++;
        }else if (Semana==45){
            //Anuncio copa mundial de clubes
            IniciarMundialClubes();
            Semana++;
        }else if (Semana>=46 && Semana<=47){
            MundialClubes.AvanzaCopa(true, View, Agno);
            normalizarMundialClubes();
            Semana++;
        }else if (Semana == 48){
            //Aqui todos los fines de copas
            terminarLigasTodas();
            int Ai = Agno+1;
            JOptionPane.showMessageDialog(null, 
                              "Termino la temporada "+Agno+"-"+Ai, 
                              "Final de temporada.", 
                              JOptionPane.INFORMATION_MESSAGE);
            
            this.Agno = Ai;
            
            this.Semana = 1;
        }
    }
    
    public void terminarLigasTodas(){
        for (Liga y : LigasAmerica){
            y.terminoLigaEmpezarNueva();
            
            for (Equipo x : y.Equipos){
                
                
                
                if (x.equals(getEquipoPlayer())){
                    x.terminoTemporada(true);
                }else{
                    x.terminoTemporada(false);
                }
            }
        }
        for (Liga x : LigasAsia){
            x.terminoLigaEmpezarNueva();
            for (Equipo s : x.Equipos){
                if (s.equals(getEquipoPlayer())){
                    s.terminoTemporada(true);
                }else{
                   s.terminoTemporada(false);
                }
            }
        }
        for (Liga s : LigasEuropa){
            s.terminoLigaEmpezarNueva();
            for (Equipo x : s.Equipos){
                if (x.equals(getEquipoPlayer())){
                    x.terminoTemporada(true);
                }else{
                    x.terminoTemporada(false);
                }
            }
        }
        for (Liga c : LigasAmericanortecentro){
            c.terminoLigaEmpezarNueva();
            for (Equipo x : c.Equipos){
                if (x.equals(getEquipoPlayer())){
                    x.terminoTemporada(true);
                }else{
                    x.terminoTemporada(false);
                }
            }
        }
        for (TorneoCopa x : CopasContinentales){
            x.TerminarTorneo();
        }
        MundialClubes.TerminarTorneo();
        
    }
    
    public String getContinentePlayer(){
        switch (IndexContinentePlayer){
            case 0 ->{
                return "America";
            }
            case 1 ->{
                return "Europa";
            }
            case 2 ->{
                return "Asia";
            }
            case 3 ->{
                return "America norte centro";
            }
        }
        return null;
    }
    
    public void IniciarCopasContinentales(){
        String Anuncio = "";
            
            for (TorneoCopa y : CopasContinentales){
                switch (y.Continente){
                    case "America"->{
                        for (Liga ligis : LigasAmerica){
                            if (ligis.equals(getLigaPlayer())){
                                Anuncio+="\nEMPEZÓ LA "+y.NombreTorneo.toUpperCase()+"\n";
                            }
                            if (ligis.getPrimerosDos().contains(getEquipoPlayer())){
                                Anuncio+="\nY TU EQUIPO PARTICIPARÁ\n";
                            }
                        }
                        y.EquiposTorneo = getMejoresLigaContinen(y.Continente,y.NombreTorneo);
                        ShufflearEquipos(y.EquiposTorneo);
                    }
                    case "Europa"->{
                        for (Liga ligis : LigasEuropa){
                            if (ligis.equals(getLigaPlayer())){
                                Anuncio+="\nEMPEZÓ LA "+y.NombreTorneo.toUpperCase()+"\n";
                            }
                            if (ligis.getPrimerosDos().contains(getEquipoPlayer())){
                                Anuncio+="\nY TU EQUIPO PARTICIPARÁ\n";
                            }
                        }
                        y.EquiposTorneo = getMejoresLigaContinen(y.Continente,y.NombreTorneo);
                        ShufflearEquipos(y.EquiposTorneo);
                    
                    }
                    case "America norte centro"->{
                        for (Liga ligis : LigasAmericanortecentro){
                            if (ligis.equals(getLigaPlayer())){
                                Anuncio+="\nEMPEZÓ LA "+y.NombreTorneo.toUpperCase()+"\n";
                            }
                            if (ligis.getPrimerosDos().contains(getEquipoPlayer())){
                                Anuncio+="\nY TU EQUIPO PARTICIPARÁ\n";
                            }
                        }
                        y.EquiposTorneo = getMejoresLigaContinen(y.Continente,y.NombreTorneo);
                        ShufflearEquipos(y.EquiposTorneo);
                    
                    }
                    case "Asia"->{
                        for (Liga ligis : LigasAsia){
                            if (ligis.equals(getLigaPlayer())){
                                Anuncio+="\nEMPEZÓ LA "+y.NombreTorneo.toUpperCase()+"\n";
                            }
                            if (ligis.getPrimerosDos().contains(getEquipoPlayer())){
                                Anuncio+="\nY TU EQUIPO PARTICIPARÁ\n";
                            }
                        }
                        y.EquiposTorneo = getMejoresLigaContinen(y.Continente,y.NombreTorneo);
                        ShufflearEquipos(y.EquiposTorneo);
                    
                    }
                }
            }
            
           JOptionPane.showMessageDialog(null, 
                              Anuncio, 
                              "COMIENZO DE COPAS CONTINENTALES", 
                              JOptionPane.INFORMATION_MESSAGE); 
    }
    
    public void ShufflearEquipos(ArrayList<Equipo> x){
        Random rand = new Random();
        for (int i = 0;i<x.size();i++){
            int randomIndexToSwap = rand.nextInt(x.size());
            Equipo temp = x.get(randomIndexToSwap);
            x.set(randomIndexToSwap,x.get(i)) ;
            x.set(i, temp);
        }
    }
    
    public void normalizarEquipos(){
        for (TorneoCopa x : CopasContinentales){
            switch (x.Continente){
                case "America" ->{
                    for (Equipo y : x.EquiposTorneo){
                        for (Liga lig : LigasAmerica){
                            for (Equipo Su : lig.Equipos){
                                if (y.NombreEquipo.equals(Su.NombreEquipo)){
                                    Su = y;
                                }
                            }
                        }
                    }
                }
                case "Europa"->{
                    for (Equipo y : x.EquiposTorneo){
                        for (Liga lig : LigasEuropa){
                            for (Equipo Su : lig.Equipos){
                                if (y.NombreEquipo.equals(Su.NombreEquipo)){
                                    Su = y;
                                }
                            }
                        }
                    }
                }
                case "Asia"->{
                    for (Equipo y : x.EquiposTorneo){
                        for (Liga lig : LigasAsia){
                            for (Equipo Su : lig.Equipos){
                                if (y.NombreEquipo.equals(Su.NombreEquipo)){
                                    Su = y;
                                }
                            }
                        }
                    }
                }
                case "America norte centro"->{
                    for (Equipo y : x.EquiposTorneo){
                        for (Liga lig : LigasAmericanortecentro){
                            for (Equipo Su : lig.Equipos){
                                if (y.NombreEquipo.equals(Su.NombreEquipo)){
                                    Su = y;
                                }
                            }
                        }
                    }
                }            
            }
        }
    }
    
    public void normalizarMundialClubes(){
        for (Equipo x : MundialClubes.EquiposTorneo){
            for (TorneoCopa su : CopasContinentales){
                if (x.equals(su.Campeon) && x.NombreEquipo.equals(su.Campeon.NombreEquipo)){
                    su.Campeon = x;
                }
            }
        }
        normalizarEquipos();
    }
    
    public void IniciarMundialClubes(){
        ArrayList<Equipo> CampeonesContinent = new ArrayList<>();
        String Anuncio = "\nEMPEZÓ EL MUNDIAL DE CLUBES\n";
        for (TorneoCopa x : CopasContinentales){
            
            
            
            CampeonesContinent.add(x.Campeon);
            if (x.Campeon.equals(getEquipoPlayer()) && x.Campeon.NombreEquipo.equals(getEquipoPlayer().NombreEquipo)){
                Anuncio+="\nY TU EQUIPO DISPUTARÁ EL TORNEO\n";
            }
        }
        
        
        TorneoCopa MundiClu = new TorneoCopa("Mundial de clubes","Mundo");
        MundiClu.EquiposTorneo = CampeonesContinent;
        
        
        ShufflearEquipos(MundiClu.EquiposTorneo);
        
        MundiClu.Cuartos.addAll(MundiClu.EquiposTorneo);
        MundiClu.Etapa = 3;
        
        MundialClubes = MundiClu;
        
        JOptionPane.showMessageDialog(null, 
                              Anuncio, 
                              "COMIENZO MUNDIAL DE CLUBES", 
                              JOptionPane.INFORMATION_MESSAGE); 
        
    }
    
    
    
    
    
    
    
}
