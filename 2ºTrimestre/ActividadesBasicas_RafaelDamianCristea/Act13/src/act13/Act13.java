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
        System.out.println("Introduzca su dia de nacimiento");
        int dia1 = entrada.nextInt();
        System.out.println("Introduzca su mes de nacimiento");
        int mes1 = entrada.nextInt();
        System.out.println("Introduzca su año de nacimiento");
        int año1 = entrada.nextInt();
        int cifra1 = año1/1000;
        int cifra2 = año1/100%10;
        int cifra3 = año1/10%10;
        int cifra4 = año1%10;
        int numero = dia1+mes1+cifra1+cifra2+cifra3+cifra4;
        System.out.println("Tu numero de la suerte es: "+numero);
        
    }
    
}
