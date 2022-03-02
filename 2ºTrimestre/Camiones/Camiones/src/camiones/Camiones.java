/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camiones;
import java.util.Scanner;

/**
 *
 * @author damik
 */
public class Camiones {
    
    String marca;
    String estado;
    int tara;
    int mma;
    int km;
    
    public Camiones(){
        marca = "";
        estado = "";
        tara = 0;
        mma = 0;
        km = 0;
    }
    
    public Camiones(String marca, String estado, int tara, int mma, int km){
        this.marca = marca;
        this.estado = estado;
        this.tara = tara;
        this.mma = mma;
        this.km = km;
    }
    
    public void introducir(String marca, String estado, int tara, int mma, int km){
        this.marca = marca;
        this.estado = estado;
        this.tara = tara;
        this.mma = mma;
        this.km = km;
    }
    
    public void mostrar(){
        System.out.println("Marca: "+marca);
        System.out.println("Estado: "+estado);
        System.out.println("Tara: "+tara);
        System.out.println("MMA: "+mma);
        System.out.println("KM: "+km);
    }
    
    public int peso(){
        return tara;
    }
    
    public float libras(){
        float aux = (float) (tara * 2.205);
        return aux;
    }
    
    public float revision(){
        float aux = 0;
        while (km > 1000){
            km = km - 1000;
        }
        aux = 1000 - km;
        return aux;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Camiones camion1 = new Camiones();
        
        camion1.introducir("Hyunday", "Nuevo", 2300, 7200, 7200);
        camion1.mostrar();
        System.out.println("Peso: "+camion1.peso());
        System.out.println("Libras: "+camion1.libras());
        System.out.println("KM para la proxima revision: "+camion1.revision());
        
        
        
    }
    
}
