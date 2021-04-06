import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        /*Uni4Exe01.java - A jornada de trabalho semanal de um funcionário é de
        40 horas. O funcionário que trabalhar mais de 40 horas receberá hora
        extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%.
        Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o
        valor por hora e escreva o salário total do funcionário, que deverá ser
        acrescido das horas extras, caso tenham sido trabalhadas (considere que
        o mês possua 4 semanas exatas). */

        //Entrada: numero horas no mês e o valor da hora
        //Saída: salário total do funcionário

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Entre com as horas trabalhadas no mês: ");
        int horasMes = entrada.nextInt();

        System.out.println("Entre com o valor pago por hora: ");
        float valorHora = entrada.nextFloat();

        float salario = horasMes * valorHora;
        
        //int horasMensaisFixas = 40 * 4; 
        boolean trabalhouAMais = horasMes > 160;
        //if (trabalhouAMais) {
        if (horasMes > 160) {
            //hora extra           
            float salarioExtra = (horasMes - 160) * (valorHora / 2);

           //float salarioExtra = horasExtras * valorHoraExtra;
            salario += salarioExtra; //salario = salario + salarioExtra;

            //salario += (horasMes - 160) * (valorHora + (valorHora / 2));
        } 

        System.out.println("O salário total é: R$" + salario);
        entrada.close();
    }
}



/*
Horas trabalhadas = 200 horas
Valor hora = 20 reais

200 * 20 = 4000 (salário baseado no valor padrão da hora)
200-160 = 40
40 * 10 = 400 (hora extra)

--------------
160 * 20 = 3200
200-160 = 40
40 * (20 + 10) = 40 * 30 = 1200

3200 + 1200 = 4400



*/