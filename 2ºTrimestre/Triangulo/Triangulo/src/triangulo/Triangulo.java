
package triangulo;
import java.util.Scanner;

public class Triangulo {
    
    int base;
    int altura;
    String tipo;
    
    public Triangulo(){
        base = 0;
        altura = 0;
        tipo = "";
}
    public Triangulo(int base, int altura, String tipo){
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
    }
    
    public void introducir(int base, int altura, String tipo){
        this.base = base;
        this.altura = altura;
        this.tipo = tipo;
    }
    
    public void mostrar(){
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Tipo: "+tipo);
    }
    
    public float area(){
        float aux = (base*altura)/2;
        return aux;
    }


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Triangulo triangulo1 = new Triangulo();
        
        triangulo1.introducir(7, 3, "Rectangulo");
        triangulo1.mostrar();
        System.out.println("Area: "+triangulo1.area());
        
    }
    
}
