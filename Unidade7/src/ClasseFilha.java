public class ClasseFilha {
  private int valor;
  private int valorIniciado = 10;

  public ClasseFilha() {
    System.out.println(" Classe A __");
    System.out.println(" valor: " + valor);
    System.out.println(" valor: " + valorIniciado);
  }

  public ClasseFilha(int valor) {
    System.out.println(" Classe A __");
    System.out.println(" valor: " + valor);
    System.out.println(" valor: " + valorIniciado);
    this.valor = valor;
  }

  public void imprimir() {
    System.out.println(" Classe A __");
    System.out.println(" valor: " + valor);
    System.out.println(" valor: " + valorIniciado);
  }

}
