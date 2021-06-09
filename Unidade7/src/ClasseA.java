import java.util.Scanner;

public class ClasseA {
    

    public ClasseA() {
        Scanner teclado = new Scanner(System.in);
        
        ClasseB objetoB = new ClasseB(10);
        ClasseB objetoB2 = new ClasseB(15);

        ClasseB obj = new ClasseB();
        
        objetoB.imprimir();
        objetoB2.imprimir();

    }

    public static void main(String[] args) {
        new ClasseA();
    }
}
