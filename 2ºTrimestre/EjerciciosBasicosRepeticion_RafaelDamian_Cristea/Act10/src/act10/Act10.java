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
        
        System.out.println("Introduzca un numero");
        int n1 = entrada.nextInt();
        System.out.println("Introduce otro numero");
        int n2 = entrada.nextInt();
        
        if (n1 > n2){
            while(n2 != n1+1){
                if (n2 % 2 == 0){
                    System.out.println(n2);
                }
                n2++;
            }
        }
        if (n2 > n1){
            while(n1 != n2+1){
                if(n1 % 2 == 0){
                    System.out.println(n1);
                }
                n1++;
            }
        }
    }
    
}
