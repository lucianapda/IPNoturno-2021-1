public class ExemploWhile {
    
    public static void main(String[] args) {
        
        int contador = 1;
        while (contador > 5) {
            System.out.println(contador);
            contador += 1;
        }

        System.out.println("Fim");

        contador = 1;
        do {
            System.out.println(contador);
            contador += 1;
        } while(contador > 5);

    }


}
