import java.util.Scanner;

public class Uni4Exe14A {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Digite o dia: ");
    int dia = teclado.nextInt();
    System.out.println("Digite o mês: ");
    int mes = teclado.nextInt();
    System.out.println("Digite o ano: ");
    int ano = teclado.nextInt();
    
    // Processo __
    // dias
    // abril (4), junho(6), setembro (9), novembro (11)
    boolean diasTrinta   = dia <= 30 && (mes == 4 || mes == 6 || mes == 9 || mes == 11);
    // janeiro (1), março (3), maio (5), julho (7), agosto (8), outubro (10), dezembro (12)
    boolean diasTrintaUm = dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12);

    // meses
    boolean mesOK = mes >= 1 && mes <= 12;

    // ano bissexto
    // Anos bissextos são múltiplos de 4, não múltiplos de 100 (1900 não é bissexto) e múltiplos de 400 (2000 é bissexto).
    // https://www.ponteiro.com.br/bisse.php
    boolean bissextoAno = (ano % 4 == 0) && !(ano % 100 == 0 && ano % 400 != 0);
    boolean bissexto   = mes == 2 && ((dia <= 28) || (dia <= 29 && bissextoAno));

    boolean dataValida = (mesOK && diasTrinta) ||    // para os meses c/ 31 dias
                         (mesOK && diasTrintaUm) ||  // para os meses c/ 30 dias
                         (bissexto);                 // para os meses c/ 28 e 29 dias

    // Saída
    if (dataValida && ano > 0 && dia >= 1) {
      System.out.println("Data válida.");
    } else {
      System.out.println("Data NÃO válida.");
    }

    teclado.close();
  }
}
