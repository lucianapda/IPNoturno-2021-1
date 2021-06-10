import java.util.Scanner;

public class Uni6Exe02_SemMetodo {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double vetorSoma = 0;

    // Ler vetor
    double vetor[] = new double[12];
    for (int i = 0; i < vetor.length; i++) {
      System.out.println("vetor[" + i + "]: ");
      vetor[i] = teclado.nextDouble();
      vetorSoma += vetor[i];
    }

    // Calcula a média
    double vetorMedia = vetorSoma / vetor.length;

    // Verifica se valores do vetor são maiores que a média
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > vetorMedia) {
        System.out.println("Vetor[" + i + "]: " + vetor[i]);
      }
    }

    teclado.close();
  }

}
