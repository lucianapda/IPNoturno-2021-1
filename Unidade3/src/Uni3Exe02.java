import java.util.Scanner;

public class Uni3Exe02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // Entrada
    System.out.print("Informe o preço do par de sapatos: ");
    double produtoPreco = teclado.nextDouble();

    //  Processo
    double produtoDesconto = produtoPreco * 0.12;     // desconto de 12%
    double produtoValorFinal = produtoPreco - produtoDesconto;
    
    // Saída
    System.out.print("O valor do desconto é de R$ "+produtoDesconto);
    System.out.println();
    System.out.print("O preço do par de sapatos com desconto é R$ "+produtoValorFinal);

    teclado.close();
  }

}
