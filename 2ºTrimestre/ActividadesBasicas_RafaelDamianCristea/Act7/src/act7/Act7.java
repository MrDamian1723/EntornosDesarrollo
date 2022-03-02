/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act7;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el primer cateto: ");
        float n1;
        n1 = entrada.nextFloat();
        System.out.println("Introduce el segundo cateto: ");
        float n2;
        n2 = entrada.nextFloat();
        float hipotenusa = (float) Math.sqrt(Math.pow(n1, 2)+Math.pow(n2, 2));
        
        System.out.println("La hipotenusa es: "+hipotenusa);
    }
    
}
