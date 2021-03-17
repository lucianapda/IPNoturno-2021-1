import java.util.Scanner;

public class Problema1001 {
 
    public static void main(String[] args) {
       //Entradas: A, B
       //Saída: X
       
       Scanner teclado = new Scanner(System.in);

       int a = teclado.nextInt();
       int b = teclado.nextInt();

       int x = a + b;

       System.out.println("X = " + x);

       teclado.close();

    }
    
}
