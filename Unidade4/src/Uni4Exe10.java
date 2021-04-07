import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        /**
         * Uni4Exe10.java - Um casal possui três filhos: Marquinhos, Zezinho e
         * Luluzinha. Faça um algoritmo para ler as idades dos filhos e exibir quem é o
         * caçula da família; suponha que não haja empates
         */

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a idade de Marquinhos: ");
        int idadeMarquinhos = teclado.nextInt();
        System.out.print("Informe a idade de Zezinho: ");
        int idadeZezinho = teclado.nextInt();
        System.out.print("Informe a idade de Luluzinha: ");
        int idadeLuluzinha = teclado.nextInt();

        //-------------- usando if composto sem operador lógico:
        if (idadeMarquinhos < idadeZezinho) {
            if (idadeMarquinhos < idadeLuluzinha) {
                System.out.println("Marquinho é caçula");
            } else {
                if (idadeLuluzinha < idadeMarquinhos) {
                    System.out.println("Luluzinha é caçula");
                }
            }
        } else {
            if (idadeZezinho < idadeLuluzinha) {
                System.out.println("Zezinho é caçula");
            } else {
                System.out.println("Luluzinha é caçula");
            }
        }

        //----------- usando if com operador lógico:
        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("Marquinhos é o caçula");
        } else {
            if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
                System.out.println("Zezinho é o caçula");
            } else {
                System.out.println("Luluzinha é a caçula");
            }
        }

        teclado.close();
    }
}
