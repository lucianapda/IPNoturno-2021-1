public class Uni5Exe4 {

    /*
    Uni5Exe04.java - Descreva um algoritmo para calcular o valor de S dado por:

    3/2 + 5/6 + 7/12 + 9/20 + 11/30 + ...

    Considere os 20 primeiros termos da série.
    */

   
    
    
    public static void main(String[] args) {
        //Forma 1:
        double soma = 0;
        double numerador = 3;
		double denominador = 2;
		double apoio = 4;
		for (int count = 0; count < 20; count++) { //20 primeiros numeros

			soma = soma + (numerador / denominador);
			
            numerador += 2;
            denominador += apoio;
			apoio += 2;            
		}
		System.out.println("A soma é: "+soma);


        //Forma 2:
        soma = 0;
        numerador = 3;
		denominador = 2;
		apoio = 1;
		for (int count = 0; count < 20; count++) { //20 primeiros numeros

			soma = soma + (numerador / denominador);
			
            denominador += numerador + apoio; //denominador = (numerador + denominador) + apoio;
            numerador += 2;
		}
		System.out.println("A soma é: "+soma);


        //Forma 3:
        soma = 0;
        numerador = 3;
		double denominador1 = 2;
        double denominador2 = 6;
		apoio = 2;
        //6 - 2 = 4 + A(2) = 6
        //6 + 6 = 12
    
        //12 - 6 = 6 + A(2) = 8
        //8 + 12 = 20
       
        soma += (numerador / denominador1);
        numerador += 2;
        soma += (numerador / denominador2);
        
        //Iniciar a partir do 3º termo:
        for (int count = 2; count < 20; count++) { //os próximos 18 numeros
            numerador += 2;
            denominador = (denominador2 - denominador1) + apoio;
            denominador = denominador + denominador2;

			soma = soma + (numerador / denominador);
			
            denominador1 = denominador2;
            denominador2 = denominador;
            
		}
		System.out.println("A soma é: "+soma);


        //Forma 4:
        double s = 0;
        double divisor = 3;
        double dividendo = 2;

        for (int valor=1; valor<=20;valor++){
            s = s + (divisor/dividendo);
            divisor += 2;
            dividendo += 2 + 2*valor;
        }
        System.out.println(s);

    
    }
}
