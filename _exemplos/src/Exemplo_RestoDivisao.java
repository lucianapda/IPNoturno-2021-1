/**
 * Exemplo de utilização do operador do resto da divisão.
 */

public class Exemplo_RestoDivisao {
	public static void main(String[] args) {
		double resposta;
		double numerador;
		double denominador;

		// conta sem resto na divisão
		System.out.println("_ Conta sem resto na divisão ___");
		numerador = 10;
		denominador = 2;
		resposta = numerador / denominador;
		System.out.println("Resultado da divisão: " + resposta);
		resposta = numerador % denominador;
		System.out.println("Resultado do resto da divisão: " + resposta);

		System.out.println(); // linha em branco

		// conta com resto na divisão
		System.out.println("_ Conta com resto na divisão ___");
		numerador = 10;
		denominador = 3;
		resposta = numerador / denominador;
		System.out.println("Resultado da divisão: " + resposta);
		resposta = numerador % denominador;
		System.out.println("Resultado do resto da divisão: " + resposta);

		System.out.println("..FIM..");
	}
}
