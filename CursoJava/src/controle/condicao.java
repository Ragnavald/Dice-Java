package controle;

import java.util.Scanner;

public class condicao {

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a média:");
	double media = sc.nextDouble();
	boolean criterioreprovacao = media <= 4.5 && media >=0; 
	if(criterioreprovacao) {
		System.out.println("Sinto muito, você foi reprovado!");
		
	}else {

		System.out.println("Aprovado\nParabéns");
	}
	 
	sc.close();
	
}
	
}
