package controle;

import java.util.Scanner;

public class exemploSwitch {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		int nota = sc.nextInt(); 
		String conceito = "";
		
		
		switch(nota) {
		case 10:
			conceito ="A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;
		default:
			conceito = "não informado!";

		}
		
		System.out.println("Conceito é: "+conceito);
		sc.close();
		
		
	}
	
	
	
}
