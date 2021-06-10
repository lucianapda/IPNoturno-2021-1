import java.util.Scanner;

public class ClasseVetMat {
	private Scanner teclado = new Scanner(System.in);
	private int opcao;
	ClasseVetor classeVetor;

	private ClasseVetMat() {
		System.out.println("\033[H\033[2J"); // limpa console

		classeVetor = new ClasseVetor(5);

		do {
			System.out.println(" ________ MENU Geral ________");
			System.out.println("  1 - Vetor");
			System.out.println("  2 - Matriz");
			System.out.println("  3 – Sair do sistema");
			System.out.print(" Opção: ");
			opcao = teclado.nextInt();

			switch (opcao) {
				case 1:
					menuVetor();
					break;
				case 2:
					menuMatriz();
					break;
				case 3:
					System.out.println(" __ FIM __ ");
					break;
				default:
					System.out.println(" .. opção inválida .. ");
					break;
			}

		} while (opcao != 3);

		teclado.close();
	}

	private void menuVetor() {
		do {
			System.out.println(" ________ MENU Vetor ________");
			System.out.println("  1 – Incluir valor");
			System.out.println("  2 – Pesquisar valor");
			System.out.println("  3 – Alterar valor");
			System.out.println("  4 – Excluir valor");
			System.out.println("  5 – Mostrar valores");
			System.out.println("  6 – Ordenar valores");
			System.out.println("  7 – Sair do MENU Vetor");
			System.out.print(" Opção: ");
			opcao = teclado.nextInt();
			switch (opcao) {
				case 1:
					classeVetor.incluir(teclado);
					break;
				case 2:
					classeVetor.pesquisar(teclado);
					break;
				case 3:
					classeVetor.alterar(teclado);
					break;
				case 4:
					classeVetor.excluir(teclado);
					break;
				case 5:
					classeVetor.mostrar();
					break;
				case 6:
					classeVetor.ordenar();
					break;
				case 7:
					// volta MENU geral
					break;
				default:
					System.out.println(" .. opção inválida .. ");
					break;
			}
		} while (opcao != 7);
	}

	private void menuMatriz() {
		do {
			System.out.println(" ________ MENU Matriz ________");

			// TODO: terminar

			System.out.println("  7 – Sair do MENU Matriz");
			System.out.print(" Opção: ");
			opcao = teclado.nextInt();
			switch (opcao) {
				case 1:

					// TODO: terminar

					break;
				case 7:
					// volta MENU geral
					break;
				default:
					System.out.println(" .. opção inválida .. ");
					break;
			}
		} while (opcao != 7);
	}

	public static void main(String[] args) {
		new ClasseVetMat();
	}

}
