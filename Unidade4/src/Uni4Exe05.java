import java.util.Scanner;

public class Uni4Exe05 {

    public static void main(String[] args) {
        /**
         * Uni4Exe05.java - Dada uma pergunta, “a cor é azul?”, faça um programa que
         * leia uma variável lógica com a resposta e responda “Sim”, caso a resposta
         * seja true, ou “Não”, caso seja false.
         */

        Scanner teclado = new Scanner(System.in);

        System.out.print("a cor é azul?");
        boolean resposta = teclado.nextBoolean();

        /*
         * if (resposta) { 
         *      System.out.println("Sim"); 
         * } else {
         *      System.out.println("Não"); 
         * }
         */

        if (!resposta) { // resposta == false
            System.out.println("Não");
        } else {
            System.out.println("Sim");
        }

        teclado.close();
    }

}
