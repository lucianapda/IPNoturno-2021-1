import java.util.Scanner;

public class Uni3Exe13 {
    public static void main(String[] args) {
        /*
         * Uni3Exe13.java - Numa loja de materiais de construção, um azulejo estampado
         * custa R$ 12,50. Faça um programa para ler o comprimento e altura de uma
         * parede (em metros), e depois escrever o valor gasto com a compra de azulejos.
         * Considere que um metro quadrado é formado por 9 azulejos.
         */

        // Entradas: comprimento e a altura M

        // Saídas: valor gasto com a compra

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o comprimento da parede (M): ");
        float comprimento = entrada.nextFloat();
        System.out.print("Digite a altura da parede (M): ");
        float altura = entrada.nextFloat();

        float areaParede = comprimento * altura;
        float totalAzulejos = areaParede * 9f;
        float valor = totalAzulejos * 12.5f;

        System.out.println("Valor gasto em material: R$" + valor);

        entrada.close();
    }
}
