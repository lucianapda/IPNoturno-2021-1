import java.util.Scanner;

public class Uni4Exe01 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Entre com as horas trabalhadas no mês: ");
    int horasMes = teclado.nextInt();
    System.out.println("Entre com o valor pago por hora: ");
    float valorHora = teclado.nextInt();
    float salarioTotal = horasMes * valorHora;
    if (horasMes > 160) { // mês c/ 4 semanas, semana 40 horas
      float salarioExtra = (horasMes - 160) * (valorHora / 2);
      salarioTotal = salarioTotal + salarioExtra;
    }
    System.out.println("O salário total é: " + salarioTotal);
    teclado.close();
  }
}
/* Valores Testes
_ Caso 1 ___ não tem hora extra <= 160 horas
horasTrabalhadasMes = 150
horasValores = 10,00
salarioLiquido = horasTrabalhadasMes * horasValores
horasExtra = 0
salarioBruto = salarioLiquido + horasExtra => 1.500,00

horasTrabalhadasMes = 160
horasValores = 10,00
salarioLiquido = horasTrabalhadasMes * horasValores
horasExtra = 0
salarioBruto = salarioLiquido + horasExtra => 1.600,00

_ Caso 2 ___ tem hora extra
horasTrabalhadasMes = 161
horasValores = 10,00
salarioLiquido = horasTrabalhadasMes * horasValores => 1.610,00
horasExtra = 1 => (horasValores * 0.5) * 1
salarioBruto = salarioLiquido + horasExtra => 1.615,00

horasTrabalhadasMes = 350
horasValores = 10,00
salarioLiquido = horasTrabalhadasMes * horasValores => 3.500,00
horasExtra = 190 => 190 * 5,00
salarioBruto = salarioLiquido + horasExtra => 4.450,00

*/
