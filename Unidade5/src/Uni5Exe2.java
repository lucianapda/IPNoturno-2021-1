public class Uni5Exe2 {

    /*Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100. */
    public static void main(String[] args) {
        
        int somaPar = 0;
        int somaImpar = 0;
        //1 2 3 4 5 6
        //2 4 6 = 12
        //1 3 5 = 9
        for (int num = 1; num <= 100; num += 1) {
            
            if (num % 2 == 0 ) {
               somaPar = somaPar + num;  
            } else {
               somaImpar = somaImpar + num;
            }

        }

        System.out.println(somaPar);
        System.out.println(somaImpar);
    }
}
