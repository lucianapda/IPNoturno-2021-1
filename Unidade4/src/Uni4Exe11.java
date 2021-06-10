import java.util.Scanner;
public class Uni4Exe11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Irmão 1, ano: ");
    int idadeIrmao1 = teclado.nextInt();
    System.out.println("Irmão 2, ano: ");
    int idadeIrmao2 = teclado.nextInt();
    System.out.println("Irmão 3, ano: ");
    int idadeIrmao3 = teclado.nextInt();

    if (idadeIrmao1 == idadeIrmao2 && idadeIrmao1 == idadeIrmao3) {
          System.out.println("TRIGÊMEOS");
    } else {
      if (idadeIrmao1 == idadeIrmao2 || 
          idadeIrmao1 == idadeIrmao3 || 
          idadeIrmao2 == idadeIrmao3) {
            System.out.println("GÊMEOS");
      } else {
        System.out.println("APENAS IRMÃOS");
      }
    }

    teclado.close();
  }
}


/* 
TRIGÊMEOS ___
idadeIrmao1 = 23
idadeIrmao2 = 23
idadeIrmao3 = 23

GÊMEOS ____
idadeIrmao1 = 10  ->
idadeIrmao2 = 45
idadeIrmao3 = 10  -> 

idadeIrmao1 = 10  -> 
idadeIrmao2 = 10  ->
idadeIrmao3 = 45

idadeIrmao1 = 45   
idadeIrmao2 = 10  ->
idadeIrmao3 = 10  ->

APENAS IRMÃOS ___
idadeIrmao1 = 23
idadeIrmao2 = 12
idadeIrmao3 =  5
*/