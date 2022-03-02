/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act8;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int mayor = 0;
        for (int i = 0 ; i < 3 ; i++){
            System.out.println("Introduzca un numero");
            int numero = entrada.nextInt();
            if(mayor < numero){
                mayor = numero;
            }
        }
        System.out.println("El mayor es: "+mayor);
    }
    
}
