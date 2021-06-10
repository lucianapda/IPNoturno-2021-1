import java.util.Scanner;

public class Uni4Exe05 {
	public static void main(String[] args) {
		System.out.println("A cor é azul?");
		Scanner teclado = new Scanner(System.in);
		boolean resposta = teclado.nextBoolean();
		if (resposta) {
			System.out.println("Sim");
		} else {
			System.out.println("Não");
		}
		teclado.close();
	}
}
