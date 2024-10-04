package formacaojava;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* Estrutura de repetição: WHILE */
		int numero = 1;

		while (numero <= 3) {
			System.out.println("O número atual é " + numero + ".");
			numero++;
		}
		
		/* Estrutura de repetição: DO WHILE */
		int numero2 = 1;
		
		do {
			System.out.println("O número atual " + numero2 + ".");
			numero2++;
		}while(numero2 <= 10);
	}

}
