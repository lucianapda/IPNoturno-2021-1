public class Uni5Exe3 {
    
    /*
    Uni5Exe03.java - Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos: 
    1 / 1 + 1/2 + 1/3 + 1/4 ..... + 1/100
    */

    public static void main(String[] args) {
        
        
        final double divisor = 1;
        double soma = 0;

        for (double dividendo = 1; dividendo <= 100; dividendo++) {
            
            soma += divisor/dividendo;
        }

        System.out.println(soma);

    }
}
