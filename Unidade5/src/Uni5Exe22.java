public class Uni5Exe22 {
    public static void main(String[] args) {
        /*
         * Uni5Exe22.java - Um funcionário recebe aumento anual. Em 1995 foi contratado
         * por 2000 reais. Em 1996 recebeu aumento de 1.5%. A partir de 1997, os
         * aumentos sempre correspondem ao dobro do ano anterior. Faça programa que
         * determine o salário atual do funcionário.
         */

         int ano = 1995;
         float salario = 2000;

         ano = 1996;
         float aumento = 0.015f;
         salario += 2000 * aumento;

         //considerando o dobro do aumento:
         //Para funcionar mudei o ano, senão ficava infinito.
         while (ano != 2005) {
             ano++;
             aumento = aumento * 2;
             salario += salario * aumento;
         }   
         System.out.println("Salário atual: " + salario);

    }
}
