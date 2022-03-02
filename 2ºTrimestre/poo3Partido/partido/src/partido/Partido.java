/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package partido;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Partido {
    
    String equipo1;
    String equipo2;
    int marcador1;
    int marcador2;
    
    public Partido(){
        equipo1="";
        equipo2="";
        marcador1=0;
        marcador2=0;
    }
    
    public Partido(String equipo1, String equipo2, int marcador1, int marcador2){
        this.equipo1=equipo1;
        this.equipo2=equipo2;
        this.marcador1=marcador1;
        this.marcador2=marcador2;
        
    }
    
    public void cambiarnombreayb(String equipo1, String equipo2){
        this.equipo1=equipo1;
        this.equipo2=equipo2;
    }
    
    public void anadirpuntosa(int marcador1){
        this.marcador1=marcador1;
    }
    
    public void restarpuntosb(int marcador2){
        this.marcador2=marcador2;
    }
    
    public void añadirpuntosab(int marcador1, int marcador2){
        this.marcador1=marcador1;
        this.marcador2=marcador2;
    }
    
    public void mostrarmarcadora(int marcador1){
        System.out.println("Marcador del equipo 1: "+marcador1);
    }
    
    public void mostrarmarcadorb(int marcador2){
        System.out.println("Marcador del equipo 2: "+marcador2);
    }
    
    public void mostrardiferencia(){
        int diff;
        if (marcador1 > marcador2){
            diff = marcador1 - marcador2;
        }
        else{
            diff = marcador2 - marcador1;
        }
        System.out.println("Diferencia: "+diff);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
