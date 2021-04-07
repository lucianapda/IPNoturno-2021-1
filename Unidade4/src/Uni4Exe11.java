import java.util.Scanner;

public class Uni4Exe11 {

    public static void main(String[] args) {

        /**
         * Uni4Exe11.java - Escreva um algoritmo para ler o ano de nascimento de 3
         * irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS,
         * APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma
         * idade e o outro diferente dos demais, e apenas irmãos se todas as idades
         * forem diferentes.
         */
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento do irmão 1: ");
        int ano1 = entrada.nextInt();

        System.out.print("Digite o ano de nascimento do irmão 2: ");
        int ano2 = entrada.nextInt();

        System.out.print("Digite o ano de nascimento do irmão 3: ");
        int ano3 = entrada.nextInt();

        if (ano1 == ano2 && ano1 == ano3) {
            System.out.println("Trigêmeos");
        } else {
            if (ano1 != ano2 && ano1 != ano3 && ano2 != ano3) {
                System.out.println("Irmãos");
            } else {
                System.out.println("Gêmeos");
            }
        }

        // ---------------

        if (ano1 == ano2) {
            if (ano1 == ano3) {
                System.out.println("Trigêmeos");
            } else {
                System.out.println("Gêmeos");
            }
        } else {
            if (ano1 != ano3) {
                if (ano2 != ano3) {
                    System.out.println("Irmãos");
                } else {
                    System.out.println("Gêmeos");
                }
            } else {
                System.out.println("Gêmeos");
            }

        }
        entrada.close();
    }
}
