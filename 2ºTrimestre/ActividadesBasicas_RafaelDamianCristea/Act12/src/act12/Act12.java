/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act12;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un numero de cinco cifras: ");
        int n1 = entrada.nextInt();
        String n2 = Integer.toString(n1);
        System.out.println(n2.charAt(4));
        System.out.println(n2.charAt(3));
        System.out.println(n2.charAt(2));
        System.out.println(n2.charAt(1));
        System.out.println(n2.charAt(0));
        
    }
    
}
