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
        
        System.out.println("FOR:");
        
        for (int i = 1 ; i < 50 ; i++){
            System.out.println(i);
        }
        
        System.out.println("WHILE: ");
        
        int i = 1;
        while (i != 51){
            System.out.println(i);
            i++;
        }
        
        i = 1;
        System.out.println("DOWHILE: ");
        do{
            
            System.out.println(i);
            i++;
            
        }while(i != 51);
    }
    
}
