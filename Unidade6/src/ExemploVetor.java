import java.util.Scanner;

public class ExemploVetor {
    public static void main(String[] args) {
        
      int n1 = 5;
        int n2 = 6;
        int n3 = 10;

        //Formas de declarar vetor:
        Integer vetor1[];
        int[] vetor2;

        //Inicialização do vetor:
        vetor1 = new Integer[3];
        vetor2 = new int[5];

        //Uso do vetor:
        vetor1[0] = 5;
        vetor1[1] = 6;
        vetor1[2] = n3;

        //Ler o vetor:
        System.out.println(vetor1[0] + " - " + vetor1[1] + " - " + vetor1[2]);
        
        for (int indice = 0; indice < 3; indice++) {
            System.out.println(vetor1[indice]);
        }

        for (int indice = 0; indice < vetor1.length; indice++) {
            System.out.println(vetor1[indice]);
        }


        vetor2[0] = 10;
        vetor2[1] = 5;
        System.out.println("Tamanho " + vetor2.length);

        //Popular o vetor em tempo de execução pelo usuário:
        
        Scanner teclado = new Scanner(System.in);

        for (int quantidade = 0; quantidade < vetor2.length; quantidade++) {
            System.out.println("Digite um valor");
            int numero = teclado.nextInt();

            vetor2[quantidade] = numero;
        }

        for (int indice = 0; indice < vetor2.length; indice++) {
            System.out.println(vetor2[indice]);
        }

        teclado.close();

       


        String palavras[] = new String[3];
        palavras[0] = "Nome";
        palavras[1] = "Sobrenome";
        palavras[2] = "Idade";

        String palavrasInvertido[] = new String[3];
        int indice = 0;
        for (int contador = palavras.length-1; contador >= 0; contador--) {
            palavrasInvertido[indice] = palavras[contador];
            indice++;
        }

        for (int contador = 0; contador < palavrasInvertido.length; contador++) {
            System.out.println(palavrasInvertido[contador]);
        }

        //Matriz:
        int[][] matrizInteiro = new int[3][2];
        matrizInteiro[0][0] = 1; 
        matrizInteiro[0][1] = 2;
        matrizInteiro[1][0] = 3;
        matrizInteiro[1][1] = 4;
        matrizInteiro[2][0] = 5;
        matrizInteiro[2][1] = 6;
        
        /*
        1 2
        3 4
        5 6
        */

        for (int linha = 0; linha < matrizInteiro.length; linha++) {
            for (int coluna = 0; coluna < matrizInteiro[linha].length; coluna++) {
                System.out.println(matrizInteiro[linha][coluna]);
            }
        }
     }
}
