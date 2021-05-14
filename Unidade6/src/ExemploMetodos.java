/*
Métodos -> Paradigma .. Orientação a Objeto (OO)
explicar um "pouco" -> mais explicação na unidade 7
Nome do arquivo Java define o nome Class
  todo arquivo java só tem uma classe
Métodos Main ->   public static void main(String[] args)
  porta entrada para executar o código
  só pode ter um método main no nosso código a ser executado

Método Construtor _ método "especial"
  se usa muito construtores em OO
  usaremos também para evitar o uso do static
  static: tenta não usar -> fugir :-(
  não tem "void"

Métodos _ os meus métodos
  assinatura -> private void testeAula(parâmetros) { /*...  }
  [x] visibilidade -> private (sem usar private por enquanto)
  [x] retorno void ou tipo -> saída (opcional)
  [x] nome (mesma ideia ao dar nomes das variáveis)
  [ ] parâmetros: 
        Entrada do método (opcional)
          passagem por valor: conteúdo da variável
          passagem por referência: ponteiro (endereço)
  [x] bloco/escopo 
        { todo o meu código} -> processo (opcional)

visibilidade da Classe ou Método: public, protect, privado
  public é o valor default
  .. recomendação usar nesta ordem: privado, protect, public */

public class ExemploMetodos {
   
    //Construtor de classe:
    //new Scanner(...) --> chama o construtor do Scanner
    //new DecimalFormat(...) --> chama o construtor do DecimalFormat
    //é o start da classe
    //o construtor se diferencia do método, pois não possui anotação para o retorno
    //e o nome é exatamente o mesmo nome da classe
    public ExemploMetodos() {
        //Chamada método 1:
        somarSemRetornoSemParametro();

        //Chamada método 2:
        int retornoDoMetodo = somarComRetornoSemParametro();
        System.out.println("A soma é " + retornoDoMetodo);

        //Chamada método 3:
        somarSemRetornoComParametro(5, 2);

        int numero1 = 10;
        int numero2 = 50;
        somarSemRetornoComParametro(numero1, numero2);
        System.out.println("Novo numero 1: " + numero1);

        //Chamada método 4:
        int retorno = somarComRetornoComoParametro(numero1, numero2);
        System.out.println("Saída do método: " + retorno);

        //Chamada método 5:
        int numeros[] = new int[5];
        System.out.println("Valor do vetor posição 0 antes do método: " + numeros[0]);
        exemploParametroReferencia(numeros);
        System.out.println("Valor do vetor posição 0: " + numeros[0]);
    }



    public void somarSemRetornoSemParametro() {
        int num1 = 4;
        int num2 = 5;

        int soma = num1 + num2;

        System.out.println("Soma = " + soma);
    }

    private int somarComRetornoSemParametro() {
        int num1 = 4;
        int num2 = 5;

        int soma = num1 + num2;

        return soma;

        //Não é possível executar linhas depois de executar o return
        //System.out.println("Oi");
    }


    //o parâmetro é a informação necessária para o método funcionar!
    //o tipo desse parâmetro é parâmetro por VALOR
    //Se alterar o valor do parâmetro dentro do método, fora do método o valor continua o mesmo.
    private void somarSemRetornoComParametro(int n1, int n2) {
        int soma = n1 + n2;

        n1++;

        System.out.println("Soma = " + soma + " numero " + n1);
    }
    

    private int somarComRetornoComoParametro(int n1, int n2) {
        int soma = n1 + n2;
        return soma;
    }


    //sem retorno e com parâmetro por REFERÊNCIA
    private void exemploParametroReferencia(int[] vetor) {

        vetor[0] = 10;

        System.out.println("Valor posição 0: " + vetor[0]);
    }

    //public - encapsulamento do método - visibilidade (poderia ser private)
    //static -
    //void - tipo de retorno do método (void não retorna valor | int, float, String, etc)
    //main - nome do método --- inicia com letra minúscula!
    //(...) - indica que essa estrutura é um método e dentro desse () podemos colocar os parâmetros
    //String[] args - é o parâmetro do método --- é a informação que o método precisa para funcionar
    public static void main(String[] args) {
        new ExemploMetodos(); //instância da própria classe
    }

    
}
