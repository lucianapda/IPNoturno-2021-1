import java.util.Scanner;

public class ClasseVetor {
  private int vet[] = new int[50];
  private int posFim = 0; // posição no topo do vetor

  private boolean vetorVazio() {
    if (posFim == 0) {
      System.out.println(" . vetor vazio! ");
      return true;
    }
    return false;
  }

  public void vetorIncluir(Scanner teclado) {
    if (posFim < vet.length) {
      System.out.print(" valor: ");
      vet[posFim] = teclado.nextInt();
      posFim++;
      System.out.println("_ incluído em vet[" + posFim + "].");
    } else {
      System.out.println(" .. não incluído - vetor cheio .. ");
    }
  }

  public int vetorPesquisar(Scanner teclado) {
    if (vetorVazio()) {
      return -1;
    }
    System.out.print(" valor pesquisa: ");
    int valor = teclado.nextInt();
    for (int i = 0; i < posFim; i++) {
      if (valor == vet[i]) {
        System.out.println("_ encontrado vet[" + i + "]");
        return i;
      }
    }
    System.out.println("_ Não encontrado.");
    return -1;
  }

  public void vetorAlterar(Scanner teclado) {
    int valorId = vetorPesquisar(teclado);
    if (valorId != -1) {
      System.out.print(" valor troca: ");
      vet[valorId] = teclado.nextInt();
      System.out.println("_ valor troca vet[" + valorId + "]: " + vet[valorId]);
    }
  }

  public void vetorExcluir(Scanner teclado) {
    int valorId = vetorPesquisar(teclado);
    if (valorId != -1) {
      for (int i = valorId; i < (posFim - 1); i++) {
        vet[i] = vet[i + 1];
      }
      posFim--;
      System.out.println("_ valor excluído.");
    }
  }

  public void valorMostrar() {
    System.out.println(" __ vetor valores __ ");
    if (!vetorVazio()) {
      for (int i = 0; i < posFim; i++) {
        System.out.println("vet[" + i + "] " + vet[i]);
      }
    }
  }

  public void valorOrdenar() {
    if (!vetorVazio()) {
      int bolha;
      for (int i = 0; i < posFim - 1; i++) {
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
