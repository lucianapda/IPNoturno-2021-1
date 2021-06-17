import java.util.Scanner;

public class Pessoa {

    private Endereco endereco;
    private String nome;

    public Pessoa() {
        System.out.println("\033[H\033[2J"); // limpa console
        Scanner teclado = new Scanner(System.in);

        informarEndereco(teclado);

        System.out.print("Nome: ");
        this.nome = teclado.next();

        System.out.println("--- Endereço ---");
        System.out.println(this.nome + " mora no " + this.endereco.imprimirEndereco());

        mudarEndereco(teclado);
        System.out.print("Complemento do endereço: ");
        String complemento = teclado.next();
        System.out.println("--- Novo Endereço ---");
        System.out.println(this.nome + " mora no " + this.endereco.imprimirEndereco(complemento));

        teclado.close();
    }

    public void informarEndereco(Scanner teclado) {
        System.out.print("Bairro: ");
        String bairro = teclado.next();

        System.out.print("Rua: ");
        String rua = teclado.next();

        System.out.print("Número: ");
        int numero = teclado.nextInt();

        endereco = new Endereco(bairro, rua, numero);
    }

    public void mudarEndereco(Scanner teclado) {
        System.out.print("Bairro: ");
        String bairro = teclado.next();
        System.out.print("Rua: ");
        String rua = teclado.next();
        System.out.print("Número: ");
        int numero = teclado.nextInt();

        endereco.mudarEndereco(bairro, rua, numero);
    }

    public static void main(String[] args) {
        new Pessoa();
    }
}
