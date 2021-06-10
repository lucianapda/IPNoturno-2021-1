import java.util.Scanner;

public class ClasseVetor {
  private int vet[];
  private boolean vetVazio;

  public ClasseVetor(int tamanho) {
    vet = new int[tamanho];
    vetVazio = true;
  }

  public void incluir(Scanner teclado) {
    for (int i = 0; i < vet.length; i++) {
      System.out.print(" vetor[" + i + "]: ");
      vet[i] = teclado.nextInt();
    }
    vetVazio = false;
  }

  public int pesquisar(Scanner teclado) {
    if (vetVazio) {
      System.out.println("_ Vetor Vazio.");
      return -1;
    }
    System.out.print(" valor pesquisa: ");
    int valor = teclado.nextInt();
    for (int i = 0; i < vet.length; i++) {
      if (valor == vet[i]) {
        System.out.println("_ encontrado vet[" + i + "]");
        return i;
      }
    }
    System.out.println("_ Não encontrado.");
    return -1;
  }

  public void alterar(Scanner teclado) {
    int valorId = pesquisar(teclado);
    if (valorId != -1) {
      System.out.print(" valor troca: ");
      vet[valorId] = teclado.nextInt();
      System.out.println("_ valor troca vetor[" + valorId + "]: " + vet[valorId]);
    }
  }

  public void mostrar() {
    if (vetVazio) {
      System.out.println("_ Vetor Vazio.");
    } else {
      System.out.println(" __ vetor valores __ ");
      for (int i = 0; i < vet.length; i++) {
        System.out.println("vetor[" + i + "] " + vet[i]);
      }
    }
  }

  public void ordenar() {
    if (vetVazio) {
      System.out.println("_ Vetor Vazio.");
    } else {
      int bolha;
      for (int i = 0; i < vet.length - 1; i++) {
        if (vet[i] > vet[i + 1]) {
          bolha = vet[i];
          vet[i] = vet[i + 1];
          vet[i + 1] = bolha;
          i = -1;
        }
      }
      System.out.println("_ valores ordenados.");
    }
  }

}
