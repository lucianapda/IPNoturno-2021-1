import java.util.Scanner;

public class Uni6Exe1ComMetodo {
     /*
     * Uni6Exe01.java - Descreva um algoritmo que leia 10 números inteiros e os
     * coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa
     * em que foram lidos. Faça um método para ler e outro para escrever.
     */


    public Uni6Exe1ComMetodo() {
        int[] vetor = new int[10];

        lerValoresVetor(vetor);
        escreverValoresVetor(vetor);
    }

    public void lerValoresVetor(int[] vetor) {
        Scanner leitor = new Scanner(System.in);

        // for (int indice = 0; indice < 10; indice++) {
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print("Digite um número: ");
            vetor[indice] = leitor.nextInt();
        }

        leitor.close();
    }

    public void escreverValoresVetor(int[] vetor) {
        for (int indiceInverso = vetor.length-1; indiceInverso >= 0; indiceInverso--) {
            System.out.println("Vetor[" + indiceInverso + "]: " + vetor[indiceInverso]);
        }
    }

     public static void main(String[] args) {
        new Uni6Exe1ComMetodo();
    }
}
