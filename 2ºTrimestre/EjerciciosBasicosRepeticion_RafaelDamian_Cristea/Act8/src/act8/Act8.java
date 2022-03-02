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
        
        System.out.println("FOR:");
        
        for (int i = 50 ; i > 0 ; i--){
            System.out.println(i);
        }
        
        System.out.println("WHILE: ");
        
        int i = 50;
        while (i != 0){
            System.out.println(i);
            i--;
        }
        
        i = 50;
        System.out.println("DOWHILE: ");
        do{
            
            System.out.println(i);
            i--;
            
        }while(i != 0);
    }
    
}