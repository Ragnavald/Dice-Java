package controle;

import javax.swing.JOptionPane;

public class ifelse {

	public static void main(String[] args) {
		//Novo método de entrada JOptionPane
		String valor = JOptionPane.showInputDialog("Informe o número:");
		int numero = Integer.parseInt(valor);

		if (numero % 2 == 0) {
			System.out.println("Par");
			
		}else {
			System.out.println("Ímpar");
		}
		
		
	}
	
}
