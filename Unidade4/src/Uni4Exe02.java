import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        /*
         * Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar
         * Entrada: número inteiro Saída: par ou ímpar
         */

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = leitor.nextInt();

        // boolean ehPar = (numero % 2 == 0);
        // if (ehPar) {
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR");
        } else {
            // if (!ehPar) { //se não é.... se for false
            // if (numero % 2 != 0) {
            System.out.println("O número " + numero + " é ímpar");
        }

        leitor.close();

    }
}
