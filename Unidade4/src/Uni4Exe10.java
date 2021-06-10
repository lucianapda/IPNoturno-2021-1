import java.util.Scanner;

public class Uni4Exe10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    // Entrada
    System.out.println("Entre com a idade do Marquinhos: ");
    int idadeMarquinhos = teclado.nextInt();
    System.out.println("Entre com a idade do Zezinho: ");
    int idadeZezinho = teclado.nextInt();
    System.out.println("Entre com a idade d Luluzinha: ");
    int idadeLuluzinha = teclado.nextInt();

    // Processo - Saída
    if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) { // Marquinhos
      System.out.println("Marquinhos é o caçula.");
    } else {
      if (idadeZezinho < idadeLuluzinha) { // Zezinho
        System.out.println("Zezinho é o caçula.");
      } else { // Luluzinha
        System.out.println("Luluzinha é o caçula.");
      }
    }

    teclado.close();
  }
}

/*
Marquinhos = 10 -> caçula 
Zezinho = 12 
Luluzinha = 14

Marquinhos = 29
Zezinho = 12 -> caçula
Luluzinha = 35

Marquinhos = 12
Zezinho = 23
Luluzinha = 2 -> caçula
*/