/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act2;
import java.util.Scanner;

/**
 *
 * @author damik
 */
public class Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        int numero = entrada.nextInt();
        
        int fact = 1;
        for( int i = 1; i <= numero; i++ ) {
        fact *= i;
        }
        System.out.println("Resultado: "+fact);
      
      }
        
}
    

