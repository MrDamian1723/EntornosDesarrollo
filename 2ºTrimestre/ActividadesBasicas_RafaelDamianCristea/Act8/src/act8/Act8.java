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
        
        System.out.println("Introduzca el radio: ");
        float radio = entrada.nextFloat();
        float pi = (float) Math.PI;
        float volumen=(float)((Math.pow(radio, 3))*pi*4/3);
        System.out.println("Resultado: "+volumen);
    }
    
}
