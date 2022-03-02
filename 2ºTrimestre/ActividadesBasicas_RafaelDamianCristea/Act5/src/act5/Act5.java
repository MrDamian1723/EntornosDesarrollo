/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package act5;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el radio: ");
        float radio;
        radio = entrada.nextInt();
        float longitud = (float)Math.PI*2*radio;
        System.out.println("La longitud es: "+longitud);
        float area = (float)Math.PI*((float)Math.pow(radio, 2));
        System.out.println("El area es: "+area);
    }
    
}
