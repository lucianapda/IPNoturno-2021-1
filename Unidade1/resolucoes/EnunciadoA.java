public class EnunciadoA {
    public static void main(String[] args) throws Exception {
        
        //Entradas: 3 notas, nome
        float nota1;
        float nota2;
        float nota3;
        
        String nomeCompleto;

        //Indicação do valor das variáveis:
        nota1 = 7;
        nota2 = 5;
        nota3 = 1.5f;

        nomeCompleto = "Maria da Silva";

        //Processo: Cálculo
        float media = (nota1 + nota2 + nota3) / 3; 

        //Saída: Média
        System.out.println(nomeCompleto);
        System.out.println(media);

        System.out.println("Aluno(a): " + nomeCompleto + " possui média " + media);
        

    }
}
