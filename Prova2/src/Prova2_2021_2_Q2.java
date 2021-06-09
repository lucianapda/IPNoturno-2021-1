import java.util.Scanner;

public class Prova2_2021_2_Q2 {

  private Prova2_2021_2_Q2() {
    Scanner teclado = new Scanner(System.in);

    final int vetorTamanho = 5;  // A = 5, B = 7, C = 9
    int vetor1[] = new int[vetorTamanho];
    int vetor2[] = new int[vetorTamanho];
    int vetorSoma[] = new int[vetorTamanho];

    vetorLer(vetor1, "Vetor1", teclado);
    vetorLer(vetor2, "Vetor2", teclado);
    vetorSomaCruzada(vetor1, vetor2, vetorSoma);
    vetorEscrever(vetorSoma);

    teclado.close();
  }

  private void vetorLer(int vetor[], String vetorStr, Scanner teclado) {
    System.out.println(" __ Leitura do " + vetorStr + " __");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print(vetorStr + "[" + i + "]: ");
      vetor[i] = teclado.nextInt();
    }
  }


  private void vetorSomaCruzada(int vetor1[], int vetor2[], int vetorSoma[]) {
    for (int i = 0; i < vetorSoma.length; i++) {
      vetorSoma[i] = vetor1[i] + vetor2[vetorSoma.length-1-i];
    }
  }


  private void vetorEscrever(int vetorSoma[]) {
    System.out.println(" __ Resultado da Soma __");
    for (int i = 0; i < vetorSoma.length; i++) {
      System.out.println("VetorSoma[" + i + "]: " + vetorSoma[i]);
    }
  }

  public static void main(String[] args) {
    new Prova2_2021_2_Q2();
  }
}
