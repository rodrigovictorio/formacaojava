package formacaojava;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 90;
		int nota4 = 90;
		int media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/*
		 * Operações Lógicas Aninhadas: são operações dentro de operações
		 */

		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("Aluno está aprovado, parabéns!!!");
				}else {
					System.out.println("Aluno está aprovado.");
				}
			} else {
				System.out.println("Aluno está em recuperação.");
			}
		}else {
			System.out.println("Aluno reprovado.");
		}

	}

}
