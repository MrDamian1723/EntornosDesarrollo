/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act13;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de millas");
        float n = entrada.nextFloat();
        
        float millas = (float) (n * 1.609);
        System.out.println("Distancia en KM: "+millas);
        
    }
    
}
