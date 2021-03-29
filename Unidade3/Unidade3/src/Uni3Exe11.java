import java.util.Scanner;

public class Uni3Exe11 {

    public static void main(String[] args) {
        /*
         * Descreva um programa que dado uma temperatura em °C informe o seu valor em
         * °F. Fórmula:
         * 
         * °F = (9/5) °C + 32
         */

        // Entrada: temperatura C
        // Saída: temperatura F

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o valor da temperatura em C: ");

        float temperatura = s.nextFloat(); // temperatura C
        temperatura = (9 / 5f) * temperatura + 32; // para F

        System.out.println(temperatura + "F");

        s.close();
    }
}