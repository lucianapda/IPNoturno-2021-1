public class _Exemplo_3_Condicional_Encadeada_Grande {
	public static void main(String[] args) {
		int idade = 19;

		if (idade >= 18) {
			System.out.println("Adulto");
		} else {
			if (idade >= 6) {
				System.out.println("Adolecente");
			} else {
				System.out.println("Infantil");
			}
		}
		System.out.println("..FIM..");
	}
}
