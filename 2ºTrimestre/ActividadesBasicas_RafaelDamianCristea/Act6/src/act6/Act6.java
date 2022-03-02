/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act6;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la velocidad en Km/h");
        float vel;
        vel = entrada.nextInt();
        float velmetros = (float)(vel/3.6);
        System.out.println("Velocidad en m/s: "+velmetros);
        
    }
    
}
