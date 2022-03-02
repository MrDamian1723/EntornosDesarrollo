/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act14;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre");
        String nombre1 = entrada.next();
        System.out.println("Introduzca su edad");
        int edad1 = entrada.nextInt();
        System.out.println("Introduce el segundo nombre");
        String nombre2 = entrada.next();
        System.out.println("Introduce la segunda edad");
        int edad2 = entrada.nextInt();
        if(nombre1.equals(nombre2)){
            System.out.println("Ambos nombres son iguales");
        }
        else{
            System.out.println("Los nombres no son iguales");
        }
        System.out.println(nombre1.toUpperCase());
        System.out.println(nombre2.toUpperCase());
        System.out.println(nombre1.toLowerCase());
        System.out.println(nombre2.toLowerCase());
        System.out.println(nombre1.charAt(3));
        System.out.println(nombre2.charAt(3));
    }
    
}
