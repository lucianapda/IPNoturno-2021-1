import java.util.Scanner;

public class Uni6Exe01_ComMetodo {

  private Uni6Exe01_ComMetodo() {
    int vetor[] = new int[10];

    vetorLer(vetor);
    vetorImprimirOrdemInversa(vetor);
  }

  private void vetorLer(int vetor[]) {
    Scanner teclado = new Scanner(System.in);

    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Informe o elemento " + (i + 1) + " vetor[" + i + "]: ");
      vetor[i] = teclado.nextInt();
    }

    teclado.close();
  }

  private void vetorImprimirOrdemInversa(int vetor[]) {
    for (int i = vetor.length - 1; i >= 0; i--) {
      System.out.println("vetor[" + i + "]: " + vetor[i]);
    }
  }

  public static void main(String[] args) {
    new Uni6Exe01_ComMetodo();
  }

}
