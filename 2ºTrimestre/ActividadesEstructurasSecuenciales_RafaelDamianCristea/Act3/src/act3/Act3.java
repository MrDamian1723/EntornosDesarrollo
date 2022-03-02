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
        
        System.out.println("Introduzca un letra");
        char caracter = entrada.next().charAt(0);
        
        if (Character.isUpperCase(caracter)){
            System.out.println("Es mayuscula");
        }
        else{
            System.out.println("Es minuscula");
        }
    }
    
}
