/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act4;
import java.util.Scanner;

/**
 *
 * @author damik
 */
public class Act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca la temperatura en ºC");
        float n1;
        n1 = entrada.nextFloat();
        float grados = ((n1 * 9)/5)+32;
        System.out.println("Hacen: "+grados+" ºF");
    }
    
}
