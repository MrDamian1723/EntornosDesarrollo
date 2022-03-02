/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act7;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el dividendo");
        int n1 = entrada.nextInt();
        System.out.println("Introduzca el divisor");
        int n2 = entrada.nextInt();
        
        if(n2 == 0){
            System.out.println("El divisor no puede ser 0");
        }
        else{
            int resultado = n1/n2;
            System.out.println("El resultado es: "+resultado);
        }
    }
    
}
