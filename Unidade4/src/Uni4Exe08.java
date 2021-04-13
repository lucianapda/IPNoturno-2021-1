import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        /*
         * Uni4Exe08.java - Dado uma letra, escreva um algoritmo que informe se ela é ou
         * não uma vogal.
         */

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite uma letra: ");
        //"     A     " ===> "A" (trim())
        String entrada = teclado.next().trim().toUpperCase(); //peguei a string da entrada, removi os espaços das bordas e transformei
                                                              //em letra maiúscula.
        char letra = entrada.charAt(0); //peguei a primeira letra da entrada

        //Primeira resolução: IF-ELSE 
        if (letra == 'A') {
            System.out.println("É vogal");
        } else {
            if (letra == 'E') {
                System.out.println("É vogal");
            } else {
                if (letra == 'I') {
                    System.out.println("É vogal");
                } else {
                    if (letra == 'O') {
                        System.out.println("É vogal");
                    } else {
                        if (letra == 'U') {
                            System.out.println("É vogal");
                        } else {
                            System.out.println("Não é vogal");
                        }
                    }
                }
            }
        }

        //Segunda resolução: IF COMPOSTO
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É vogal");
        } else {
            System.out.println("Não é vogal");
        }

        //ESCOLHA:
        switch(letra) {
            case 'A': 
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println("Switch: É vogal");
                break;
            default: System.out.println("Não é vogal");
        }

        teclado.close();
    }
}
