public class ClassePai {
  private int valor;
  private ClasseFilha classeB;

  private ClassePai() {
    int valor;

    valor = 10;
    System.out.println(" Variável do método: " + valor);
    this.valor = 20;
    System.out.println(" Variável do método: " + this.valor);

    ClasseFilha classeA = new ClasseFilha();
    classeA.imprimir();

    classeB = new ClasseFilha(20);
    classeB.imprimir();

  }

  public static void main(String[] args) {
    new ClassePai();
  }

}
