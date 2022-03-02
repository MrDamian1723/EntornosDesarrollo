package apuntes;
import java.util.Scanner;

public class Triangulo {
    
    int base;
    int altura;
    String nombre;
    
    public Triangulo(){
        base = 5; altura = 5; nombre ="MPAPE";
    }
    
    public Triangulo(int base, int altura, String nombre){
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
        
    }
    
    public void introducir(int base, int altura, String nombre){
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
        
    }
    
    public void mostrar(){
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Nombre: "+nombre);
        
        
    }
    
    public float calcular(){
        float area = base*altura/2;
        
        return area;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Triangulo triangulo1 = new Triangulo(23, 56, "dembele");
        triangulo1.mostrar();
        

    }
    
}
