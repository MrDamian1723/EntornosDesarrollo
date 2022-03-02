/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cilindro;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Cilindro {
    
    int radio;
    int altura;
    
    public Cilindro(){
    radio = 0; altura = 0;
}
    
    public Cilindro(int radio, int altura){
    this.radio = radio;
    this.altura = altura;
}
    
    public void introducir(int radio, int altura){
    this.radio = radio;
    this.altura = altura;
}
    
    public void introducirradio(int radio){
        this.radio = radio;
    }
    
    public void introduciraltura(int altura){
        this.altura = altura;
    }
    
    public void mostrar(){
        System.out.println("Radio: "+radio);
        System.out.println("Altura: "+altura);

    }
    
    public float calcular(int radio, int altura){
        float pi = (float) Math.PI;
        float cuadrado = radio*radio;
        float area = cuadrado * pi * 2;
        
        return area;
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        Cilindro cilindro1 = new Cilindro();
        System.out.println("Introduce el radio: ");
        int radio1 = entrada.nextInt();
        System.out.println("Introduce la altura: ");
        int altura1 = entrada.nextInt();
        
        cilindro1.introducir(radio1, altura1);
        cilindro1.mostrar();
        
        
        
    }
    
}
