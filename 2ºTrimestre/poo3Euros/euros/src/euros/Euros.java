/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package euros;
import java.util.Scanner;
/**
 *
 * @author damik
 */
public class Euros {
    
    int eu1;
    int eu2;
    int eu5;
    int eu10;
    int eu20;
    
    public Euros(){
        eu1 = 0;
        eu2 = 0;
        eu5 = 0;
        eu10 = 0;
        eu20 = 0;
    }
    
    public Euros(int eu1, int eu2, int eu5, int eu10, int eu20){
        this.eu1 = eu1;
        this.eu2 = eu2;
        this.eu5 = eu5;
        this.eu10 = eu10;
        this.eu20 = eu20;
    }

    public int getEu1() {
        return eu1;
    }

    public int getEu2() {
        return eu2;
    }

    public int getEu5() {
        return eu5;
    }

    public int getEu10() {
        return eu10;
    }

    public int getEu20() {
        return eu20;
    }

    public void setEu1(int eu1) {
        this.eu1 = eu1;
    }

    public void setEu2(int eu2) {
        this.eu2 = eu2;
    }

    public void setEu5(int eu5) {
        this.eu5 = eu5;
    }

    public void setEu10(int eu10) {
        this.eu10 = eu10;
    }

    public void setEu20(int eu20) {
        this.eu20 = eu20;
    }
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
