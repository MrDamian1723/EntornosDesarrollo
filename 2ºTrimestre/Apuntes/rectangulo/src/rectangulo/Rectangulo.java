
package rectangulo;
import java.util.Scanner;

public class Rectangulo {
    
    int base;
    int altura;
    int profundidad;
    
    public Rectangulo(){
        base = 0;
        altura = 0;
        profundidad = 0;
    }
    
    public Rectangulo(int base, int altura, int profundidad){
        this.base = base;
        this.altura = altura;
        this.profundidad = profundidad;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + ", profundidad=" + profundidad + '}';
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Rectangulo rectangulo1 = new Rectangulo();
        rectangulo1.setBase(5);
        rectangulo1.setAltura(2);
        rectangulo1.setProfundidad(3);
        System.out.println(rectangulo1.toString());
        
        System.out.println("Volumen: "+rectangulo1.getBase()*rectangulo1.getAltura()*rectangulo1.getProfundidad());
        
    }
    
}
