/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act9;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca las horas");
        int horas = entrada.nextInt();
        System.out.println("Introduzca los minutos");
        int min = entrada.nextInt();
        System.out.println("Introduzca los segundos");
        int seg = entrada.nextInt();
        
        if (min > 60 | min > 60){
            System.out.println("DATOS INCORRECTOS");
        }
    }
    
}
