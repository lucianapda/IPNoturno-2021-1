import java.util.Scanner;

public class Exemplo_String {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe 1a String: ");
		String valorStr1 = teclado.next();

		System.out.println("Informe 2a String: ");
		String valorStr2 = teclado.next();

		if (valorStr1.contentEquals(valorStr2)) {
			System.out.println("Duas strings tem o mesmo valor: " + valorStr1);
		} else {
			System.out.println("Duas strings tem valor diferentes: " + valorStr1 + " - " + valorStr2);

		}

		System.out.println("Informe 1a número inteiro: ");
		int valorInt1 = teclado.nextInt();

		System.out.println("Informe 2a número inteiro: ");
		int valorInt2 = teclado.nextInt();

		String stringInteiro = valorStr1 + valorInt1;
		System.out.println(" String com número: " + stringInteiro);
		String strNumeros = valorInt1 + "" + valorInt2;
		System.out.println(" Número com número numa string: " + strNumeros);

		teclado.close();
		System.out.println("..FIM..");

	}

}
