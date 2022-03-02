/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act5;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un caracter");
        char caracter = entrada.next().charAt(0);
        
        if(Character.isLetter(caracter)){
            System.out.println("No es un numero");
        }
        else{
            System.out.println("Es un numero");
        }
    }
    
    
}
