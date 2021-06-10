import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1002 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		// Entrada
		double raio = teclado.nextDouble();

		// Processo
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2);

		// Saída
		DecimalFormat F = new DecimalFormat("0.0000");
		System.out.println("A=" + F.format(area));
		teclado.close();
	}
}