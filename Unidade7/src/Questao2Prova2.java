import java.util.Scanner;

public class Questao2Prova2 {
    
    private Questao2Prova2() {
        Scanner teclado = new Scanner(System.in);

        final int vetorTamanho = 5;
        int vetor1[] = new int[5];
        int vetor2[] = new int[vetorTamanho];
        int vetorSoma[] = new int[vetorTamanho];

        vetorLer(vetor1, "Vetor1", teclado);
        vetorLer(vetor2, "Vetor2", teclado);
        vetorSomaCruzada(vetor1, vetor2, vetorSoma);
        vetorEscrever(vetorSoma);


        teclado.close();
    }

    private void vetorLer(int[] vetor, String texto, Scanner s) {
        System.out.println("__ Leitura do " + texto + "__");
        
        for (int indice = 0; indice < vetor.length; indice++) {
            System.out.print(texto + "[" + indice + "]: ");
            vetor[indice] = s.nextInt();
        }

    }

    private void vetorSomaCruzada(int[] v1, int[] v2, int[] somaCruzada){
        for (int i = 0; i < somaCruzada.length; i++) {
            int posicao = v2.length - 1 - i;
            somaCruzada[i] = v1[i] + v2[posicao];
        }
    }

    private void vetorEscrever(int[] vetor){
        System.out.println("__ Resultado da Soma __");
        for (int i = 0; i < vetor.length; i++){
            System.out.println("VetorSoma[" + i + "]" + vetor[i]);
        }
    }

    public static void main(String[] args) {
        new Questao2Prova2();
    }
}
