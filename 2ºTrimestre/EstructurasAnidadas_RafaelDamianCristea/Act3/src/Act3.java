import java.util.Scanner;

public class Act3 {

    public static void main(String[] args) {
        int N;
        double factorial;
        Scanner sc = new Scanner(System.in);
       
        do{
            System.out.print("Introduce un número: ");
            N = sc.nextInt();
            
        }while(N<0);

        for(int i = 0; i <= N ; i++){                                             
           
            factorial = 1;
            for(int j = 1; j <= i; j++){
                factorial = factorial * j;
            }

            System.out.printf("%2d! = %.0f %n", i, factorial);

        }
    }
   
}