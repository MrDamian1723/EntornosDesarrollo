/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act11;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero");
        int n1 = entrada.nextInt();

        for (int i = 0 ; i < 1000 ; i++){
            if (i % n1 == 0){
                System.out.println(i);
            }
        }
    }
    
}
