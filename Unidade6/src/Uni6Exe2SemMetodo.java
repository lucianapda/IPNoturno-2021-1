import java.util.Scanner;

public class Uni6Exe2SemMetodo {

    /*
     * Uni6Exe02.java - Descreva um algoritmo que leia 12 valores reais e os coloque
     * em um vetor de 12 posições do tipo real. Imprima quais valores desses
     * informados são maiores que a média dos valores. Faça um método para ler os
     * valores, outro para calcular a média e outro para informar os valores maiores
     * que a média.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float[] vetorNumeros = new float[12];

        float soma = 0;

        for (int indice = 0; indice < vetorNumeros.length; indice++) {
            System.out.print("Digite um valor real: ");
            vetorNumeros[indice] = teclado.nextFloat();

            soma += vetorNumeros[indice];
        }

        // Média:
        float media = soma / vetorNumeros.length;
        System.out.println("Média " + media);

        String maiores = "";
        for (int indice = 0; indice < vetorNumeros.length; indice++) {
            if (vetorNumeros[indice] > media) {
                maiores += vetorNumeros[indice] + "\n";
            }
        }

        System.out.println(maiores);
        teclado.close();
    }
}
