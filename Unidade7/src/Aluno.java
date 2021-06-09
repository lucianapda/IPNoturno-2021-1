import java.util.Scanner;

public class Aluno {
    
    private Pessoa pessoa;
    private int codigo;

    public Aluno() {
        Scanner s = new Scanner(System.in);

        System.out.print("Nome da pessoa: " );
        String nome = s.next();
        System.out.print("Ano nascimento: ");    
        int ano = s.nextInt();
        System.out.println("Código: ");
        this.codigo = s.nextInt();

        pessoa = new Pessoa(nome, ano);
        int idade = pessoa.idade();

        System.out.println("A idade da " + pessoa.nome() + 
            "(" + this.codigo + ") é " +
            idade);

        s.close();
    }

    public static void main(String[] args) {
        new Aluno();
    }
}
