import java.util.Scanner;

public class ClasseVetMat {
	private Scanner teclado = new Scanner(System.in);
	private int opcao;
	ClasseVetor classeVetor;
	ClasseMatriz classeMatriz;

	private ClasseVetMat() {
		System.out.println("\033[H\033[2J"); // limpa console

		classeVetor = new ClasseVetor(5);
		classeMatriz = new ClasseMatriz(2, 2);

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
			System.out.println("  4 – Mostrar valores");
			System.out.println("  5 – Ordenar valores");
			System.out.println("  6 – Sair do MENU Vetor");
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
					classeVetor.mostrar();
					break;
				case 5:
					classeVetor.ordenar();
					break;
				case 6:
					// volta MENU geral
					break;
				default:
					System.out.println(" .. opção inválida .. ");
					break;
			}
		} while (opcao != 6);
	}

	private void menuMatriz() {
		do {
			System.out.println(" ________ MENU Matriz ________");
			System.out.println("  1 – Incluir valor");
			System.out.println("  2 – Pesquisar valor");
			System.out.println("  3 – Alterar valor");
			System.out.println("  4 – Mostrar valores");
			System.out.println("  5 – Ordenar valores");
			System.out.println("  6 – Sair do MENU Matriz");
			System.out.print(" Opção: ");
			opcao = teclado.nextInt();
			switch (opcao) {
				case 1:
					classeMatriz.incluir(teclado);
					break;
				case 2:
					int idLC[] = {-1,-1};
					classeMatriz.pesquisar(teclado, idLC);
					break;
				case 3:
					classeMatriz.alterar(teclado);
					break;
				case 4:
					classeMatriz.mostrar();
					break;
				case 5:
					classeMatriz.ordenar();
					break;
				case 6:
					// volta MENU geral
					break;
				default:
					System.out.println(" .. opção inválida .. ");
					break;
			}
		} while (opcao != 6);
	}

	public static void main(String[] args) {
		new ClasseVetMat();
	}

}
