public class Uni5Exe02 {

  public static void main(String[] args) {
    // pares 2,4,6 .. 96,98,100
    int somaPar = 0;
    for (int i = 2; i <= 100; i += 2) {
      somaPar += i;
    }
    System.out.println("Soma par: " + somaPar);

    // ímpares 1,3,5 .. 95,97,99
    int somaImpar = 0;
    for (int i = 1; i <= 100; i += 2) {
      somaImpar += i;
    }
    System.out.println("Soma ímpar: " + somaImpar);
  }
  
}
