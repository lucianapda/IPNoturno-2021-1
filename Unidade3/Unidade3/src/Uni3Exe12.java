import java.util.Scanner;

public class Uni3Exe12 {
    public static void main(String[] args) {
        /*Uni3Exe12.java - Uma empresa tem para um funcionário os seguintes
        dados: o nome, o número de horas trabalhadas mensais e o número de
        dependentes. 
        
        A empresa paga R$ 10,00 por hora (valor para cálculo do
        salário trabalho) e R$ 60,00 por dependente (valor para cálculo do
        salário família)
        São feitos descontos de 8,5% sobre o salário trabalho para o INSS e de 
        5% sobre o salário trabalho para o imposto de renda.

        Descreva um programa que informe o nome, o salário bruto e o salário
        líquido do funcionário. */

        //Entradas: nome, horas trabalhadas, numero dependentes
    
        //Saídas: nome, salário bruto e salário líquido

        Scanner s = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = s.nextLine();

        System.out.print("Número de horas trabalhadas no mês: ");
        int numeroHoras = s.nextInt();

        System.out.print("Número de dependentes: ");
        int dependentes = s.nextInt();

        //Salario Bruto: salarioFamilia + salarioTrabalho
      /*  float salarioTrabalho = numeroHoras * 10;
        float salarioFamilia = dependentes * 60;
        float salarioBruto = (salarioTrabalho + salarioFamilia);
        

        //SalarioLiquido: salarioBruno - descontos salario trabalho
        float salarioLiquido = salarioBruto - (salarioTrabalho * 0.085f) - (salarioTrabalho * 0.05f);

        //Saídas:
        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: R$ " + salarioBruto);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    */

        
        System.out.println("Nome: " + nome);

        float salario = (numeroHoras * 10) + (dependentes * 60);
        System.out.println("Salário Bruto: R$" + salario);

        salario -= ((numeroHoras * 10) * 0.085f) + ((numeroHoras * 10) * 0.05f);
        System.out.println("Salário Líquido: R$ " + salario);

        s.close();
    }
}
