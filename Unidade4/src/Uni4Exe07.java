import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        /**
         * Uni4Exe07.java - O custo do selo de uma carta com até 50 gramas é de R$ 0,45.
         * As cartas com peso superior pagam um adicional de R$ 0,45 por cada 20 gramas,
         * ou fração, em que excedem aquele peso. Escreva um algoritmo que dado o peso
         * da carta, em gramas, determine o custo do selo.
         */

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o peso da carta (g): ");
        int peso = leitor.nextInt(); //90g  | 100g
        float preco = 0f;
        if (peso <= 50) {
            preco = 0.45f;
        } else {
            peso -= 50; //peso = peso - 50 //40g   | 50g
            int pesoExcedente = peso / 20; //2  | 2.... sobra 10g
            
            if (peso % 20 != 0) { //Ex: sobra 10g
                pesoExcedente += 1;  //pesoExcedente = pesoExcente + 1  
            }
            
            float precoExcedente = pesoExcedente * 0.45f; //0,90
            preco = 0.45f + precoExcedente;
        }
        
        System.out.println("Preço a pagar R$" + preco);
        leitor.close();
    }

}
