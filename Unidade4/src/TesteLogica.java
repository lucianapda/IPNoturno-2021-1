public class TesteLogica {
  public static void main(String[] args) {
    // variável boleana
    boolean teste1 = true;

    // Operadores relacionais
    teste1 = 3 < 4;

    // Operadores lógicos
    // teste = !teste;
    boolean teste2 = true;
    boolean teste3 = teste1 && teste2;   // V e  V = V
    boolean teste4 = teste1 || teste2;   // V ou V = V
    boolean teste5 = teste3 && !teste4;  // V e  F = V

    System.out.println("..1..");
    if (teste5) {
      System.out.println("..2..");
    }
    System.out.println("..3..");

  }
}
