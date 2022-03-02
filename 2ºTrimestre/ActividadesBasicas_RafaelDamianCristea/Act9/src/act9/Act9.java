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
        
        System.out.println("Introduce el lado: ");
        float lado = entrada.nextFloat();
        
        float altura = (float) Math.sqrt(Math.pow(lado, 2)-Math.pow(lado/2, 2));
        float area = lado * altura/2;
        
        System.out.println("Resultado: "+area);
        
    }
    
}
