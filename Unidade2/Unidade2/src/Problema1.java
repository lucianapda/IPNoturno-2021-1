import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        
        /* A fórmula para calcular a área de uma circunferência
        é definida como A = π x R². Considerando este problema
        que π = 3,1415. 
        Calcule a área usando a fórmula fornecida na descrição
        do problema.*/

        //Análise: OK
        //Entradas: raio
        //Saída: área
        //Testes:
        //Teste 1 - raio: 2 área: 12,566 
        //Teste 2 - raio: 5 área: 78,5375
        //....

        //Algoritmo: JAVA
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o raio: ");
        float raio = entrada.nextFloat();
        float pi = 3.1415f;
        
        float area = pi * raio * raio;
        float area2 = 3.1415f * raio * raio;

        System.out.println("Área 1: " + area);
        System.out.print("Área 2: " + area2);
    }
}
