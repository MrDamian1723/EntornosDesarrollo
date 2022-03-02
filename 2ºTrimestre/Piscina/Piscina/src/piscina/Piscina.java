
package piscina;
import java.util.Scanner;

public class Piscina {
    
    int ancho;
    int largo;
    int alto;
    
    public Piscina(){
        ancho = 0;
        largo = 0;
        alto = 0;
    }
    
    public Piscina(int ancho, int largo, int alto){
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    public void introducir(int ancho, int largo, int alto){
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    
    public void mostrar(){
        System.out.println("Ancho: "+ancho);
        System.out.println("Largo: "+largo);
        System.out.println("Alto: "+alto);
    }
    
    public float area(){
        float aux = ancho*largo*alto;
        
        return aux;
    }
    
    public void mostrarAncho(){
        System.out.println("Ancho: "+ancho);
    }
    
    public void mostrarLargo(){
        System.out.println("Largo: "+largo);
    }
    
    public void mostrarAlto(){
        System.out.println("Alto: "+alto);
    }
    
    public float convertir(){
        float yardas = (float) (area() * 1.094);
        
        return yardas;
    }


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Piscina piscina1 = new Piscina();
        piscina1.introducir(7, 4, 12);
        piscina1.mostrar();
        System.out.println("Area: "+piscina1.area());
        System.out.println("Yardas: "+piscina1.convertir());
    }
    
}
