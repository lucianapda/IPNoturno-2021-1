import java.util.Scanner;

public class Uni5Exe33 {

    /*
     * Grupo DO WHILE
     * 
     * Uni5Exe33.java - Em uma eleição para presidência, existem 4 candidatos. Os
     * votos são informados através de código. Os dados utilizados para votação
     * obedecem a seguinte codificação:
     * 
     * 1, 2, 3, 4 = voto para o respectivo candidato 5 = voto nulo 6 = voto em
     * branco Elabore um programa que calcule e escreva:
     * 
     * -- SAÍDAS: total de votos para cada candidato; total de votos nulos; total de
     * votos em branco; percentual dos votos em branco e nulos sobre o total. Se o
     * usuário informar um número de operação incorreto, emitir a mensagem “Opção
     * incorreta” e
     * 
     * persistir solicitando um número de opção correto. Para interromper a
     * operação, o usuário poderá fornecer o número 0.
     * 
     * Análise:
     * 
     * Entrada: o valor do voto (repete enquanto numero != 0)
     * 
     * 
     */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int voto = 0;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int votoNulo = 0;
        int votoBranco = 0;

        do {
            System.out.print("Digite sua opção de voto (1 a 4, 5 - nulo, 6 - branco, 0 - sair): ");
            voto = s.nextInt();

            switch (voto) {
                case 1:
                    voto1++;
                    break;
                case 2:
                    voto2 += 1;
                    break;
                case 3:
                    voto3 = voto3 + 1;
                    break;
                case 4:
                    voto4++;
                    break;
                case 5:
                    votoNulo++;
                    break;
                case 6:
                    votoBranco++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta");
            }
        } while (voto != 0);


       // SAÍDAS: 
       //total de votos para cada candidato; 
       System.out.println("Total para candidato 1: " + voto1);
       System.out.println("Total para candidato 2: " + voto2);
       System.out.println("Total para candidato 3: " + voto3);
       System.out.println("Total para candidato 4: " + voto4);

       //total de votos nulos; 
       System.out.println("Total de votos nulos: " + votoNulo);
       
       //total de votos em branco; 
       System.out.println("Total de votos em branco: " + votoBranco);

       //percentual dos votos em branco sobre o total.     
       int total = voto1 + voto2 + voto3 + voto4 + votoNulo + votoBranco; 

       /* TOTAL --- 100%
        BRANCOS ---- X
        
        X * TOTAL = BRANCOS * 100
        X = ( BRANCOS * 100 ) / TOTAL
        */
       float percentualBranco = (votoBranco * 100f) / total;
       System.out.println("Percentual de votos em branco: " + percentualBranco + "%"); 

       //percentual nulos sobre o total.
       float percentualNulo = (votoNulo * 100f) / total;
       System.out.println("Percentual de votos nulos: " + percentualNulo + "%");

        s.close();
    }
}
