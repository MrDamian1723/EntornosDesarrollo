/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act1;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        int n1;
        n1 = entrada.nextInt();
        System.out.println("Introduzca otro numero: ");
        int n2;
        n2 = entrada.nextInt();
        System.out.println("Los numeros introducidos son: "+n1+" y "+n2);
    }
    
}
