import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe6 {
    public static void main(String[] args) {
        /*
         * Uni3Exe06.java - Um restaurante cobra R$ 25,00 por cada quilo de refeição.
         * Escreva um programa que leia o peso do prato montado pelo cliente (em quilos)
         * e imprima o valor a pagar. O peso do prato é de 750 gramas.
         */

         //Entrada: peso prato kg
         //Saída: valor a pagar

         Scanner s = new Scanner(System.in);
         DecimalFormat df = new DecimalFormat("0.00");

         System.out.println("Informe o peso em kg: ");
         double peso = s.nextDouble();
         double valor = (peso - 0.75) * 25f;

         System.out.println("Valor: R$" + df.format(valor));
         s.close();
    }
}
