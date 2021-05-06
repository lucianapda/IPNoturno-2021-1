// contador++
// contador+=1
//contador = contador + 1
// contador-=1
//* / 
public class _Exemplo_1_FOR {
	public static void main(String[] args) {
		
		/*int contador = 1;
		if (contador <= 5) {
			System.out.println(contador);
			contador++; //contador = contador + 1;
		}
		System.out.println(contador);
		*/

		//int contador = 0;
		/*for (int contador = 1; contador <= 5; contador++) {
			System.out.println(contador);
		}
		*/
		//System.out.println("Fora do contador: " + contador);


		/*int valor = 0;
		int n = 0;
		for (n = 1; n <= 5; n--) {
			valor = n;
		}
		System.out.println(valor);
		System.out.println(n);*/

		for (int cont = 0; cont < 5; cont++){
			System.out.println(cont);
		}
		System.out.println("..FIM..");

		for (int num = 5; (num > 0 && num < 6); num--) {
			System.out.println(num);
		}
	}
}
