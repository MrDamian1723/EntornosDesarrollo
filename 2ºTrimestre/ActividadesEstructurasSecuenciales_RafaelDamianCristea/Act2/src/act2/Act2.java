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
        
        System.out.println("Introduzca un numero");
        int n1 = entrada.nextInt();
        
        if(n1 % 10 == 0){
            System.out.println("El numero es multiplo de 10");
        }
        else{
            System.out.println("El numero no es multiplo de 10");
        }
    }
    
}
