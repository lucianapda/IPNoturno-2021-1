import java.util.Scanner;

public class Problema4 {
    
    public static void main(String[] args) {
        //AQUI VAI O CÓDIGO-FONTE DO EXERCÍCIO


        /* Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao 
        utilizar um automóvel que faz 12 KM/L. Para isso, ele gostaria que você o auxiliasse através de um simples programa.
        Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). 
        Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. */

        //Análise: Ok

        //Não é importante: Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem.
        //Para isso, ele gostaria que você o auxiliasse através de um simples programa.

        //Não é utilizado: não

        //Entradas: tempo (h), velocidadeMedia (km/h)

        //Saídas: quantidade litro

        //Processo:
        //distância percorrida (km) = tempo (h) * velocidadeMedia (km/h)
        //quantidade litros = distancia percorrida / 12 (km/l)


        //Testes:
        //tempo / velocidade média / quantidade litros
        //2 / 60 / 10
        //56 / 40 / 186,6

        //Algoritmo:
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o tempo em horas: ");
        float tempo = entrada.nextFloat();

        System.out.print("Informe a velocidade média: ");
        float velocidadeMedia = entrada.nextFloat();

        float distancia = tempo * velocidadeMedia;
        float litros = distancia / 12;

        System.out.print("Litros: " + litros);

    }
}


