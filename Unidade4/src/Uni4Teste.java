import java.text.DecimalFormat;
import java.util.Scanner;


public class Uni4Teste {
    
    public static void main(String[] args) {
        float pesoCarta = 80.7f;
        DecimalFormat df = new DecimalFormat("0,00");
        String numTexto = String.valueOf(pesoCarta);
        int posicaoPonto = numTexto.indexOf(".");
        
        String parteInteira = numTexto.substring(0, posicaoPonto);
        System.out.println(parteInteira);

        int peso = Integer.parseInt(parteInteira)/20;
        
        System.out.println(peso);


        //-----------
        //Comparações

        int n1 = 10;
        int n2 = 10;

        String n3 = "10";
        String n4 = "10";
        
        if (n1 == n2) {
            System.out.println("Inteiros iguais");
        }

        if (n3.equals(n4)) {
            System.out.println("Strings iguais");
        }

        if (n3 == n4) {
            System.out.println("Strings iguais");
        }

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        String s4 = s1.next().toUpperCase();
        String s5 = "A";
        if (s4 == s5) {
            System.out.println("AA");
        }
        if (s1 == s2) {
            System.out.println("Scanner igual");
        }

        String letra1 = "A";
        String letra2 = "a";

        if (letra1.equalsIgnoreCase(letra2)) {
            System.out.println("Letras iguais");
        }

        
    }
}
