import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe2 {
    public static void main(String[] args) {
        /*Uni3Exe02.java - Uma loja de calçados está concedendo 12% de desconto
        nos produtos. Escreva um programa para calcular e exibir o valor de desconto a
        ser dado num par de sapatos e quanto deve custar o produto com o desconto. O
        preço do par de sapatos deve ser informado pelo usuário. Como resultado, o
        programa deverá exibir as seguintes mensagens:

        O valor do desconto é de R$ xxx O preço do par de sapatos com desconto é R$ xxx
        */

        //Entradas: o preço do par de sapatos
        
        //Saídas: desconto e o valor com desconto aplicado
        //O valor do desconto é de R$ xxx 
        //O preço do par de sapatos com desconto é R$ xxx

        Scanner leitor = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o valor do par de sapatos: R$");
        double precoSapato = leitor.nextDouble();

        double desconto = precoSapato * (12.0/100); //precoSapato * 0,12 OU (precoSapato * 12)/100
        System.out.println("O valor do desconto é de R$ " + df.format(desconto));

        precoSapato -= desconto; //precoSapato = precoSapato - desconto;
        System.out.println("O preço do par de sapatos com desconto é R$ " + df.format(precoSapato));

        leitor.close();

    }
}
