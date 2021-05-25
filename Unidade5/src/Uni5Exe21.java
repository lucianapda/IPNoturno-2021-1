public class Uni5Exe21 {
    public static void main(String[] args) {
        /*
         * Uni5Exe21.java - Chico tem 1,50 metro e cresce 2 centímetros por ano,
         * enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano. Construa um
         * algoritmo que calcule e imprima quantos anos serão necessários para que Zé
         * seja maior que Chico.
         */

        int alturaChico = 150;
        int alturaZe = 110;
        int cresceChico = 2;
        int cresceZe = 3;
        int qtdAno = 0;

        while (alturaZe < alturaChico) {
            alturaZe += cresceZe;
            alturaChico += cresceChico;
            qtdAno++;
        }

        System.out.println("Levará " + qtdAno + " para Zé ser maior que Chico.");
    }
}
