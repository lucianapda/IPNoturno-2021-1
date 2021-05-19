import java.util.Scanner;

public class Uni6Exe2ComMetodo {
    /*
     * Uni6Exe02.java - Descreva um algoritmo que leia 12 valores reais e os coloque
     * em um vetor de 12 posições do tipo real. Imprima quais valores desses
     * informados são maiores que a média dos valores. Faça um método para ler os
     * valores, outro para calcular a média e outro para informar os valores maiores
     * que a média.
     */

    public Uni6Exe2ComMetodo() {

        float[] vetorNumeros = new float[12];

        float soma = LerValores(vetorNumeros);
        float media = calcularMedia(soma, vetorNumeros.length);

        maioresValores(vetorNumeros, media);
    }

    public float LerValores(float vetorNumeros[]) {
        float soma = 0;
        Scanner teclado = new Scanner(System.in);

        // Ler valores
        for (int indice = 0; indice < vetorNumeros.length; indice++) {
            System.out.print("Digite um valor real: ");
            vetorNumeros[indice] = teclado.nextFloat();
            soma += vetorNumeros[indice];
        }

        teclado.close();
        return soma;
    }

    public float calcularMedia(float soma, int tamanhoVetor) {
        // Média:
        float media = soma / tamanhoVetor;
        System.out.println("Média " + media);

        return media;
    }

    public void maioresValores(float[] vetor, float media) {
        // Maiores valores
        String maiores = "";
        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] > media) {
                maiores += vetor[indice] + "\n";
            }
        }

        System.out.println(maiores);
    }

    public static void main(String[] args) {
      new Uni6Exe2ComMetodo();
    }
}
