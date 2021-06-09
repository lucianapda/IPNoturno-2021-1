import java.util.Scanner;

public class ClasseVetMat {
	private Scanner teclado = new Scanner(System.in);
	private ClasseVetor classeVetor;
	private ClasseMatriz classeMatriz;
	
	private ClasseVetMat() {
		System.out.println("\033[H\033[2J"); // limpa console

		classeVetor = new ClasseVetor();
		classeMatriz = new ClasseMatriz();

		int opcao;
		do {
			System.out.println(" ________ MENU Vetor ________");
			System.out.println("  1 – Incluir valor");
			System.out.println("  2 – Pesquisar valor");
			System.out.println("  3 – Alterar valor");
			System.out.println("  4 – Excluir valor");
			System.out.println("  5 – Mostrar valores");
			System.out.println("  6 – Ordenar valores");
			System.out.println("  7 – Sair do sistema");
			System.out.print(" Opção: ");
			opcao = teclado.nextInt();
			switch (opcao) {
				case 1:
					classeVetor.vetorIncluir(teclado);
					break;
				case 2:
					classeVetor.vetorPesquisar(teclado);
					break;
				case 3:
					classeVetor.vetorAlterar(teclado);
					break;
				case 4:
					classeVetor.vetorExcluir(teclado);
					break;
				case 5:
					classeVetor.valorMostrar();
					break;
				case 6:
					classeVetor.valorOrdenar();
					break;
				case 7:
					System.out.println(" __ FIM __ ");
					break;
				default:
					System.out.println(" .. opção inválida .. ");
					break;
			}
		} while (opcao != 7);
		
		teclado.close();
	}

	public static void main(String[] args) {
		new ClasseVetMat();
	}

}
