/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act3;
import java.util.Scanner;

/**
 *
 * @author damik
 */
public class Act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Hola buenas, digame un numero: ");
        int n1;
        n1 = entrada.nextInt();
        int doble = n1*2;
        int triple = n1*3;
        
        System.out.println("Doble: "+doble);
        System.out.println("Triple: "+triple);
    }
    
}
