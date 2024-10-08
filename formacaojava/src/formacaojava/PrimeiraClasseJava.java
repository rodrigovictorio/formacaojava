package formacaojava;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		/* Estrutura de repetição: FOR e Continue*/
		for(int numero = 1; numero <= 10; numero++) {
			if(numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Oba, encontrei o número " + numero);
				continue;
			}
			
			System.out.println("Processando laço de repetição");
		}
	}
}
