import java.util.Scanner;

public class ClasseMatriz {
  private int mat[][];
  private int qtdLinha, qtdColuna;
  private boolean matVazia;

  public ClasseMatriz(int qtdLinha, int qtdColuna) {
    mat = new int[qtdLinha][qtdColuna];
    this.qtdLinha = qtdLinha;
    this.qtdColuna = qtdColuna;
    matVazia = true;
  }

  public void incluir(Scanner teclado) {
    for (int l = 0; l < qtdLinha; l++) {
      for (int c = 0; c < qtdColuna; c++) {
        System.out.print(" matriz[" + l + "," + c + "]: ");
        mat[l][c] = teclado.nextInt();
      }
    }
    matVazia = false;
  }

  public boolean pesquisar(Scanner teclado, int idLC[]) {
    if (matVazia) {
      System.out.println("_ Matriz Vazia.");
      return false;
    }
    System.out.print(" valor pesquisa: ");
    int valor = teclado.nextInt();
    for (int l = 0; l < qtdLinha; l++) {
      for (int c = 0; c < qtdColuna; c++) {
        if (valor == mat[l][c]) {
          System.out.println("_ encontrado mat[" + l + "," + c + "]");
          idLC[0] = l;
          idLC[1] = c;
          return true;
        }
      }
    }
    System.out.println("_ Não encontrado.");
    return false;
  }

  public void alterar(Scanner teclado) {
    int idLC[] = new int[2];
    if (pesquisar(teclado, idLC)) {
      System.out.print(" valor troca: ");
      mat[idLC[0]][idLC[1]] = teclado.nextInt();
      System.out.println("_ valor troca mat[" + idLC[0] + "," + idLC[1] + "]: " + mat[idLC[0]][idLC[1]]);
    }
  }

  public void mostrar() {
    if (matVazia) {
      System.out.println("_ Matriz Vazia.");
    } else {
      System.out.println(" __ matriz valores __ ");
      if (!matVazia) {
        for (int l = 0; l < qtdLinha; l++) {
          for (int c = 0; c < qtdColuna; c++) {
            System.out.println("matriz[" + l + "," + c + "] " + mat[l][c]);
          }
        }
      }
    }
  }

  public void ordenar() { // ordenar os valores por linha
    if (matVazia) {
      System.out.println("_ Matriz Vazia.");
    } else {
      int bolha;
      for (int l = 0; l < qtdLinha; l++) {
        for (int c = 0; c < qtdColuna - 1; c++) {
          if (mat[l][c] > mat[l][c + 1]) {
            bolha = mat[l][c];
            mat[l][c] = mat[l][c + 1];
            mat[l][c + 1] = bolha;
            c = -1;
          }
        }
      }
      System.out.println("_ valores ordenados.");
    }
  }

}
