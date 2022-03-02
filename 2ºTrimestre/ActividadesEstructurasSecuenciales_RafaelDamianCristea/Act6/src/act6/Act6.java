/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act6;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un caracter");
        char caracter1 = entrada.next().charAt(0);
        System.out.println("Introduzca otro caracter");
        char caracter2 = entrada.next().charAt(0);
        
        if (Character.isLowerCase(caracter1) & Character.isLowerCase(caracter2)){
            System.out.println("Ambos caracteres son letras minusculas");
        }
        else{
            System.out.println("No son dos letras minusculas");
        }
    }
    
}
