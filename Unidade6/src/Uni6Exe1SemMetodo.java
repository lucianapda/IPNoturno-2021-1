import java.util.Scanner;

public class Uni6Exe1SemMetodo {

    /*
     * Uni6Exe01.java - Descreva um algoritmo que leia 10 números inteiros e os
     * coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa
     * em que foram lidos. Faça um método para ler e outro para escrever.
     */

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = new int[10];

        // for (int indice = 0; indice < 10; indice++) {
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Digite um número: ");
            vetor[indice] = leitor.nextInt();
        }

        for (int indiceInverso = vetor.length; indiceInverso >= 0; indiceInverso--) {
            System.out.println("Vetor[" + indiceInverso + "]: " + vetor[indiceInverso]);
        }

        leitor.close();
    }
}
