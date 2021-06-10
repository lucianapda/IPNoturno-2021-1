import java.util.Scanner;

public class Uni4Exe14B {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int dia, mes, ano;
		System.out.println("Digite o dia: ");
		dia = teclado.nextInt();
		System.out.println("Digite o mes: ");
		mes = teclado.nextInt();
		System.out.println("Digite o ano: ");
		ano = teclado.nextInt();
		// Verifica se o dia mes e ano são plausiveis
		if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
			// meses com 31 dias
			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				System.out.println("data válida");
			}
			// meses com 30 dias
			else {
				if (mes != 2 && dia < 31) {
					System.out.println("data válida");
				}
				// verificaçao especial para fevereiro
				else {
					if (mes == 2 && dia < 29) {
						System.out.println("data válida");
					} // dia 29 bissexto
					else {
						if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
							System.out.println("data válida");
						} else {
							System.out.println("data não válida");
						}
					}
				}
			}
		} else {
			System.out.println("Nao valida");
		}
		teclado.close();
	}
}
