/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act10;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el numero del mes:");
        int n = entrada.nextInt();
        
        if (n == 1 | n == 3 | n == 5 | n == 7 | n == 8 | n == 10 | n == 12){
            System.out.println("El mes tiene 31 dias");
        }
        if (n == 2){
            System.out.println("El mes tiene 28 dias");
        }
        else{
            System.out.println("El mes tiene 30 dias");
        }
        
        if (n == 1){
            System.out.println("El mes es Enero");
        }
        if (n == 2){
            System.out.println("El mes es Febrero");
        }
        if (n == 3){
            System.out.println("El mes es Marzo");
        }
        if (n == 4){
            System.out.println("El mes es Abril");
        }
        if (n == 5){
            System.out.println("El mes es Mayo");
        }
        if (n == 6){
            System.out.println("El mes es Junio");
        }
        if (n == 7){
            System.out.println("El mes es Julio");
        }
        if (n == 8){
            System.out.println("El mes es Agosto");
        }
        if (n == 9){
            System.out.println("El mes es Septiembre");
        }
        if (n == 10){
            System.out.println("El mes es Octubre");
        }
        if (n == 11){
            System.out.println("El mes es Noviembre");
        }
        if (n == 12){
            System.out.println("El mes es Diciembre");
        }
        if (n > 12){
            System.out.println("Numero incorrecto");
        }
        
    }
   
    
}
