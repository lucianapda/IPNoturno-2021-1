import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {
        /*Escreva um programa que leia o número do 
        funcionário, o número de horas trabalhadas em
         um mês e o valor que ele recebeu por hora. 
         Este valor sempre será um valor inteiro. 
         Imprima o número do funcionário e o salário 
         que ele receberá no final do mês. */

         //Análise: OK
         
         //Entradas: Numero funcionário, número de horas 
         //trabalhadas, valor recebido por hora

         //Saídas: número e o salário

         //Testes:
         //numero funcionario | numero horas | valor
         //1 | 10 | 50 -> 1 - 500
         //2 | 40 | 25 -> 2 - 1000
         //3 | 120 | 30 -> 3 - 3600

         //Algoritmo JAVA:
         Scanner entradas = new Scanner(System.in);
         
         System.out.print("Digite o número do funcionário: ");
         int numeroFuncionario = entradas.nextInt();
         
         System.out.print("Digite a quantidade de horas trabalhadas no mês: ");
         int horasTrabalhadas = entradas.nextInt();
         
         System.out.print("Digite o valor da hora: ");
         int valorHora = entradas.nextInt();

         int salario = horasTrabalhadas * valorHora;

         System.out.print("Número: " + numeroFuncionario + 
            " Salário: R$" + salario);
    }
}
