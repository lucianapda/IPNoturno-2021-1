import java.util.Scanner;

public class Uni5Exe1 {
    
    /*Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.*/
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        for (int quantidade = 0; quantidade < 20; quantidade++) { //repete 20x
            System.out.print("Digite um número");
            int num = leitor.nextInt();

            if (num % 2 == 0 ) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }

        }

        leitor.close();
    }
}
