import java.util.Scanner;

public class Matriz {
    
    //Atributo:
    private int[][] matriz;
    private Scanner s;

    private Matriz() {
        s = new Scanner(System.in);
        matriz = new int[3][3];
        
        int[] vetor = new int[3];
        int tamanho =  vetor.length;

        adicionar();
        imprimir();

        boolean encontrou = buscar(10);

        if (encontrou) {
            System.out.println("Encontrou o valor");
        } else {
            System.out.println("Valor não encontrado");
        }

        s.close();
    }

    private void adicionar() {
        
       for (int coluna = 0; coluna < matriz.length; coluna++) {
           for (int linha = 0; linha < matriz[coluna].length; linha++) {
               System.out.print("Valor da matriz [" + coluna + "][" + linha + "]: ");
               matriz[coluna][linha] = s.nextInt();
           }
       }
       
    }

    private void imprimir() {
       for (int coluna = 0; coluna < matriz.length; coluna++) {
           for (int linha = 0; linha < matriz[coluna].length; linha++) {
               System.out.println("Valor da matriz [" + coluna + "][" + linha + "]: " + matriz[coluna][linha]);
           }
       }
    }

    private void excluir(int valor) {
       for (int coluna = 0; coluna < matriz.length; coluna++) {
            for (int linha = 0; linha < matriz[coluna].length; linha++){
                if (matriz[coluna][linha] == valor) {
                    matriz[coluna][linha] = 0;
                }
            }
        }
    }

    private boolean buscar(int valor) {
        for (int coluna = 0; coluna < matriz.length; coluna++) {
            for (int linha = 0; linha < matriz[coluna].length; linha++){
                if (matriz[coluna][linha] == valor) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Matriz();
    }

}
