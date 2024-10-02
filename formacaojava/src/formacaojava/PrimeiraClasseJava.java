package formacaojava;

public class PrimeiraClasseJava {
	
	/*Variável Global é acessível a todos*/
	static int maiorIdadeGlobal = 30;
	
	/*
	 * Main é um método auto executável em Java
	 * OBS: tudo que eu precisar executar, tenho que chamar dentro do Main
	 * */
	public static void main(String[] args) {
		/*Variável local porque pertence somente a um método*/
		int maiorIdade = 18;
		System.out.println("valor da variável LOCAL: " + maiorIdade);
		
		metodo2();
	}
	
	public static void metodo2() {
		System.out.println("Valor da variável GLOBAL: " + maiorIdadeGlobal);
	}
	
}	
