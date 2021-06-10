public class Endereco {

    private String bairro;
    private String rua;
    private int numero;

    public Endereco(String bairro, String rua, int numero) {
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public void mudarEndereco(String bairro, String rua, int numero) {
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public String imprimirEndereco() {
        return "Bairro: " + this.bairro + "\nRua " + this.rua + ", " + this.numero;
    }

    public String imprimirEndereco(String complemento) {
        return "Bairro: " + this.bairro + "\nRua " + this.rua + ", " + this.numero + "\nComplemento: " + complemento;
    }
}
