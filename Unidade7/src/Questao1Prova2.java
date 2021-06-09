import java.util.Scanner;

public class Questao1Prova2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Definições:
        float valorDiariaMenor = 7.5f;
        float valorDiariaIgual = 6.5f;
        float valorDiariaMaior = 5f;
        float valorDiaria = 25f;

        // Entradas:
        String nome = "";
        int opcao = 0;
        int diarias = 0;
        int diariasEncerradas = 0;
        float totalPagar = 0;

        do {
            System.out.println("_____ Controle de Hóspedes ______");
            System.out.println("1. encerrar a conta de um hóspede");
            System.out.println("2. verificar número de contas encerradas");
            System.out.println("3. sair");
            System.out.print("__opção: ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("__ Hóspede: __");
                    System.out.print("nome: ");
                    nome = teclado.next();
                    System.out.print("diárias: ");
                    diarias = teclado.nextInt();

                    //totalPagar = diarias * 25;
                    totalPagar = diarias * valorDiaria;

                    if (diarias < 10) {
                        totalPagar += 7.5f; //valorDiariaMenor;
                    } else {
                        if (diarias == 10) {
                            totalPagar += valorDiariaIgual; //6.5f;
                        } else {
                            totalPagar += valorDiariaMaior; //5f;
                        }
                    }

                    System.out.println("------------");
                    System.out.println("Nome: " + nome);
                    System.out.println("Total: " + totalPagar);

                    diariasEncerradas++; //diariasEncerradas += 1;
                    break;
                case 2:
                    System.out.println("_Número de contas encerradas: " + diariasEncerradas);
                    break;
                case 3: // sair
                    break;
                default:
                    System.out.println("opção errada!");
                    break;
            }

        } while (opcao != 3);

        teclado.close();
    }
}
