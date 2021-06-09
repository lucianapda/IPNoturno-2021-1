import java.util.Scanner;

public class Prova2_2021_2_Q1 {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    String hospedeNome;
    int hospedeDiarias;
    double hospedeTotalPagar;
    int totalContasEncerradas = 0;

    // dados para provas diferentes
    // turma A
    double diaria = 25.00;
    int diarias = 10;
    double diariaMenor = 7.50;
    double diariaIgual = 6.50;
    double diariaMaior = 5.00;
    // // turma B
    // double diaria = 45.00;
    // int diarias = 20;
    // double diariaMenor = 9.50;
    // double diariaIgual = 8.50;
    // double diariaMaior = 7.00;
    // // turma C
    // double diaria = 75.00;
    // int diarias = 5;
    // double diariaMenor = 14.50;
    // double diariaIgual = 12.50;
    // double diariaMaior = 10.00;

    int opcao;
    do {
      System.out.println("_________ Controle de Hóspedes _________");
      System.out.println("1. encerrar a conta de um hóspede");
      System.out.println("2. verificar número de contas encerradas");
      System.out.println("3. sair");
      System.out.print(" __ opção: ");
      opcao = teclado.nextInt();
      switch (opcao) {
        case 1:
          System.out.println(" _ Hóspede _");
          System.out.print("nome: ");
          hospedeNome = teclado.next();
          System.out.print("diárias: ");
          hospedeDiarias = teclado.nextInt();
          hospedeTotalPagar = hospedeDiarias * diaria;
          if (hospedeDiarias < diarias) {
            hospedeTotalPagar += diariaMenor;
          } else {
            if (hospedeDiarias == diarias) {
              hospedeTotalPagar += diariaIgual;
            } else {
              hospedeTotalPagar += diariaMaior;
            }
          }
          System.out.println(" -----------");
          System.out.println("Nome: " + hospedeNome);
          System.out.println("Total: " + hospedeTotalPagar);
          totalContasEncerradas++;
          break;
        case 2:
          System.out.println(" _ Número de contas encerradas: " + totalContasEncerradas);
          break;
        case 3: // sair
          break;
        default:
          System.out.println("opção errada!");
          break;
      }
    } while (opcao != 3);
    teclado.close();
  }
}
