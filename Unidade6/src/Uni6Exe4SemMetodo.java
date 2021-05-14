import java.util.Scanner;

public class Uni6Exe4SemMetodo {

    /*
     * Uni6Exe04.java - Faça um programa para ler dois vetores de inteiros, cada um
     * contendo 10 elementos. Crie um terceiro vetor onde cada vetor é a soma dos
     * valores contidos nas posições respectivas dos vetores originais. Exiba, ao
     * final, os três vetores na tela. 
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];

      /*  for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o valor " + (i+1) + " para o vetor 1: ");
            vetor1[i] = s.nextInt();
        }
       
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Digite o valor " + (i+1) + " para o vetor 2: ");
            vetor2[i] = s.nextInt();
        }
        */

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o valor " + (i+1) + " para o vetor 1: ");
            vetor1[i] = s.nextInt();

            System.out.print("Digite o valor " + (i+1) + " para o vetor 2: ");
            vetor2[i] = s.nextInt();
        }

        int[] vetorResultante = new int[5];
        for (int indice = 0; indice < vetorResultante.length; indice++) {
            vetorResultante[indice] = vetor1[indice] + vetor2[indice];
        }

        //indice = 0 1 2    
        //vetor1 = 5 2 3
        //vetor2 = 1 5 6
        //vetorR = 6 7 9

        String conteudoVetor1 = "", conteudoVetor2 = "", conteudoVetorResultante = "";

        for (int indice = 0; indice < vetor1.length; indice++) {
            conteudoVetor1 += "[" + vetor1[indice] + "]";
            conteudoVetor2 += "[" + vetor2[indice] + "]";
            conteudoVetorResultante += "[" + vetorResultante[indice] + "]";
        }

        System.out.println("Vetor1 = " + conteudoVetor1 + 
                "\nVetor2 = " + conteudoVetor2 +
                "\nVetor Resultante = " + conteudoVetorResultante);

        s.close();
    }
}
