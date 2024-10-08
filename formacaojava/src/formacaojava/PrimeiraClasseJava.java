package formacaojava;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
		
		// convertando STRING em NÚMERO
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		
		System.out.println("Divisão para pessoas deu " + divisao + " carros e sobrou " + resto + " carros");
		
	}
}
