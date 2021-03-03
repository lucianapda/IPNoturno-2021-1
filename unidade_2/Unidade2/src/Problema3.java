import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor A: ");
        //float a = entrada.nextFloat() * 3.5f;
        float a = entrada.nextFloat();
        a = a * 3.5f;

        System.out.print("Digite o valor de B: ");
        float b = entrada.nextFloat() * 7.5f;

        float soma = (b + a) / 11;
        //float soma2 = ((b * 7.5f) + (a * 3.5f))/11;

        System.out.println("MÉDIA = " + soma);

    }
}
