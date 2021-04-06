import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        /**
         * Uni4Exe06.java - Faça um algoritmo que leia um caractere. Caso seja digitada
         * a letra 'M' escreva “Masculino”. Se for digitada a letra 'F' escreva
         * “Feminino”. Se for informado 'I' escreva “Não Informado”. Qualquer outra
         * letra digitada escreva “Entrada Incorreta”. Atenção: antes de testar a letra,
         * converta-a para maiúscula.
         */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma letra (M, F ou I): ");
        String letra = teclado.next();
        letra = letra.toUpperCase();
        letra = letra.trim(); //remove o espaço das bordas da String. Ex: "    m   " ---> "m"

        //Primeira resolução: utilizando char
        
        char primeiraLetra = letra.charAt(0);

        if (primeiraLetra == 'M') {
            System.out.println("Masculino");
        } else {
            if (primeiraLetra == 'F') {
                System.out.println("Feminino");
            } else {
                if (primeiraLetra == 'I') {
                    System.out.println("Não informado");
                } else {
                    System.out.println("Entrada incorreta");
                }
            }
        }

        //Segunda resolução: utilizando String
        letra = letra.substring(0, 1);
        if (letra.equals("M")) {
            System.out.println("Masculino");
        } else {
            if (letra.equalsIgnoreCase("f")) {
                System.out.println("Feminino");
            } else {
                if (letra.equals("I")) {
                    System.out.println("Não informado");
                } else {
                    System.out.println("Entrada incorreta");
                }
            }
        }

        teclado.close();
    }
}
