import java.util.Scanner;

public class _CaixaAreia_4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println(" Entre com 1a termo: ");
		double numero1 = teclado.nextInt();

		System.out.println(" _ Entre com a opção: ");
		System.out.println(" ___ Soma 	       [+]");
		System.out.println(" ___ Subtração     [-]");
		System.out.println(" ___ Multiplicação [*]");
		System.out.println(" ___ Divisão       [/]");
		char operador = teclado.next().charAt(0);

		System.out.println(" Entre com 2a termo: ");
		double numero2 = teclado.nextInt();

		double resultado;

		switch (operador) {
			case '+': // soma
				resultado = numero1 + numero2;
				System.out.println(" Resultado: " + resultado);
				break;
			case '-': // subtração
				resultado = numero1 - numero2;
				System.out.println(" Resultado: " + resultado);
				break;
			case '*': // multiplicação
				resultado = numero1 * numero2;
				System.out.println(" Resultado: " + resultado);
				break;
			case '/': // divisão
				resultado = numero1 / numero2;
				System.out.println(" Resultado: " + resultado);
				break;
			default:
				System.out.println("operação inválida");
		}

		teclado.close();

	}
}

/*

		if (operador == '+') {
			resultado = numero1 + numero2;
			System.out.println(" Resultado: " + resultado);
		} else {
			if (operador == '-') {
				resultado = numero1 - numero2;
				System.out.println(" Resultado: " + resultado);
			}
			else {
				if (operador == '/') {
					resultado = numero1 / numero2;
					System.out.println(" Resultado: " + resultado);
				}
				else {
					if (operador == '*') {
						resultado = numero1 * numero2;
						System.out.println(" Resultado: " + resultado);
					}
					else {
						System.out.println("operação inválida");
					}
				}
			}
		}

		*/