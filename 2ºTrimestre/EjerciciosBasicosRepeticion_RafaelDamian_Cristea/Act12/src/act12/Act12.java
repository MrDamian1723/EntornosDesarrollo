/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act12;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero");
        int n = entrada.nextInt();
        
        if (n % 2 == 0){
            if (n >= 0){
                System.out.println("El numero es par y positivo");
            }
            else{
                System.out.println("El numero es par y negativo");
            }
        }
        else{
            if (n >= 0){
                System.out.println("El numero es impar y positivo");
            }
            else{
                System.out.println("El numero es impar y negativo");
            } 
        }
    }
    
}
