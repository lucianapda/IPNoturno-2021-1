import java.util.Scanner;

public class Uni4Exe06 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Informe a letra: ");
    char letra = teclado.next().charAt(0);
    letra = Character.toUpperCase(letra);

    // Processo - Saída
    if (letra == 'M') {
      System.out.println("Masculino");
    } else {
      if (letra == 'F') {
        System.out.println("Feminino");
      } else {
        if (letra == 'I') {
          System.out.println("Não Informado");
        } else {
          System.out.println("Entrada Incorreta");
        }
      }
    }

    teclado.close();
  }
}
