import java.util.Scanner;

public class Uni6Exe6 {

    /*
     * Uni6Exe06.java - Faça um programa que leia um valor N inteiro. Com base neste
     * valor, crie um vetor do tipo real. Em seguida, solicite ao usuário informar
     * essa quantidade N de valores reais para popular o vetor. Após ter o vetor
     * preenchido, solicite que o usuário informe um outro valor real. Informe para
     * o usuário se este valor informado se encontra cadastrado no vetor. Faça um
     * método para ler o vetor e outro, que retorne verdadeiro ou falso, para
     * encontrar o valor.
     */

    // Atributo:
    private Scanner s;

    // Construtor:
    public Uni6Exe6() {

        s = new Scanner(System.in);

        float numeros[] = lerVetor();
        boolean encontrou = pesquisar(numeros);

        if (encontrou) {
            System.out.println("Número existe no vetor");
        } else {
            System.out.println("Número não existe no vetor");
        }

        s.close();
    }

    public float[] lerVetor() {

        System.out.print("Informe o tamanho do vetor desejado: "); // Valor "N"
        int tamanho = s.nextInt();

        float[] vetor = new float[tamanho];

        for (int indice = 0; indice < tamanho; indice++) {
            System.out.print("Digite um valor real: ");
            vetor[indice] = s.nextFloat();
        }

        return vetor;
    }

    public boolean pesquisar(float[] vetor) {
        System.out.print("Digite um número para consulta: ");
        float numero = s.nextFloat();

        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] == numero) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        new Uni6Exe6();
    }
}
