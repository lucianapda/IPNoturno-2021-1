import java.util.Scanner;

public class prova1_2021_1_Q2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Digite as três notas: ");
    double nota1 = teclado.nextDouble();
    double nota2 = teclado.nextDouble();
    double nota3 = teclado.nextDouble();

    // Processo - ordenar as notas
    double notaBaixa, notaMedia, notaAlta;
    if (nota1 < nota2 && nota1 < nota3) {
      notaBaixa = nota1;
      if (nota2 < nota3) {
        notaMedia = nota2;
        notaAlta = nota3;
      } else {
        notaMedia = nota3;
        notaAlta = nota2;
      }
    } else {
      if (nota2 < nota1 && nota2 < nota3) {
        notaBaixa = nota2;
        if (nota1 < nota3) {
          notaMedia = nota1;
          notaAlta = nota3;
        } else {
          notaMedia = nota3;
          notaAlta = nota1;
        }
      } else {
        notaBaixa = nota3;
        if (nota1 < nota2) {
          notaMedia = nota1;
          notaAlta = nota2;
        } else {
          notaMedia = nota2;
          notaAlta = nota1;
        }
      }
    }

    // Processo - acréscimo
    notaBaixa += 0.1;
    notaMedia += 0.2;
    notaAlta += 0.3;

    // Processo - Menu
    System.out.println("_Menu:");
    System.out.println("a) média simples");
    System.out.println("b) média ponderada");
    char opcao = teclado.next().charAt(0);
    switch (opcao) {
    case 'a':
      double mediaSimples = (notaBaixa + notaMedia + notaAlta) / 3.0;
      System.out.println("O valor da média simples do aluno: " + mediaSimples);
      break;
    case 'b':
      double mediaPonderada = (notaBaixa * 0.4) + (notaMedia * 0.1) + (notaAlta * 0.5); // provaA
      // double mediaPonderada = (notaBaixa * 0.3) + (notaMedia * 0.1) + (notaAlta * 0.6); // provaB
      // double mediaPonderada = (notaBaixa * 0.7) + (notaMedia * 0.1) + (notaAlta * 0.2); // provaC
      System.out.println("O valor da média ponderada do aluno: " + mediaPonderada);
      break;
    default:
      System.out.println("Valor inválido do Menu");
      break;
    }

    teclado.close();
  }
}
