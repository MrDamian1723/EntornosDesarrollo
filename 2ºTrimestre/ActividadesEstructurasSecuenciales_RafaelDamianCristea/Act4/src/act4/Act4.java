/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act4;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un letra");
        char caracter = entrada.next().charAt(0);
        System.out.println("Introduzca otra letra");
        char caracter2 = entrada.next().charAt(0);
        
        if(caracter == caracter2){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son diferentes");
        }
    
}
    
}
