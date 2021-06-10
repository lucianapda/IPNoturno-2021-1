import java.util.Scanner;

public class URI_1001 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    int A = teclado.nextInt();
    int B = teclado.nextInt();

    // Processo
    int X = A + B;

    // Saída
    System.out.println("X = " + X);

    teclado.close();
  }
}
