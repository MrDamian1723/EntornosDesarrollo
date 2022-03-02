/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Libro {
    
    String titulo;
    String autor;
    String isbn;
    int paginas;
    int edicion;
    String editorial;
    String ciudad;
    String pais;
    
    public Libro(){
        
    titulo = "";
    autor = "";
    isbn = "";
    paginas = 0;
    edicion = 0;
    editorial = "";
    ciudad = "";
    pais = "";
    }
    
    public Libro(String titulo, String autor, String isbn, String editorial, int paginas, int edicion, String pais, String ciudad){
        
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
    this.paginas = paginas;
    this.edicion = edicion;
    this.editorial = editorial;
    this.ciudad = ciudad;
    this.pais = pais;
    }
    
    public void introducir(String titulo, String autor, String isbn, String editorial, int paginas, int edicion, String pais, String ciudad){
    
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
    this.paginas = paginas;
    this.edicion = edicion;
    this.editorial = editorial;
    this.ciudad = ciudad;
    this.pais = pais;
    }
    
    public void mostrar(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("ISBN: "+isbn);
        System.out.println("Paginas: "+paginas);
        System.out.println("Edicion: "+edicion);
        System.out.println("Editorial: "+editorial);
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Pais: "+pais);
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Libro libro1 = new Libro();
        
        libro1.introducir("Introduction to Java Programming", "Liang, Y. Daniel", "0-13-031997-X", "Editorial desconocida", 784, 3, "USA", "Prentice-Hall, New Jersey");
        libro1.mostrar();
        
    }
    
}
