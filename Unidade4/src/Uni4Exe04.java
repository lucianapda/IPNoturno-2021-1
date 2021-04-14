import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        /**
         * Uni4Exe04.java - Dado um número de ponto flutuante maior do que 0, informe se
         * foram digitadas ou não casas decimais no número.
         */

         Scanner teclado = new Scanner(System.in);

         System.out.print("Digite um número de ponto flutuante maior que 0: ");
         float numero = teclado.nextFloat();

         //float valorDec = numero % 1;

         String numeroS = String.valueOf(numero);
         int posicaoPonto = numeroS.indexOf(".");
         String parteDecimal = numeroS.substring(posicaoPonto, numeroS.length());
         if (!parteDecimal.equals(".0")) {
             System.out.println("Possui casas decimais");
         }  else {
             System.out.println("Não possui casas decimais");
         }


         teclado.close();
    }
}
