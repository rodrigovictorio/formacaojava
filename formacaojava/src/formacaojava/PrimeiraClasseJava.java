package formacaojava;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* Estrutura de repetição: FOR com break*/
		for(int numero = 1; numero <= 10; numero++) {
			System.out.println("Número atual é " + numero + ".");
			
			if(numero == 7) {
				System.out.println("Obaaa, encontramos o número 7");
				System.out.println("estou parando de executar...");
				break;
			}
		}
	}
}
