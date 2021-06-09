public class Pessoa {
    
    private String nome;
    private int anoNascimento;

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public int idade() {
        return 2021 - anoNascimento;
    }

    public String nome() {
        return nome;
    }
}
