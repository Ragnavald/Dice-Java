package controle;

import java.util.Scanner;

public class DOWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "";
		
			do{
			System.out.println("Você precisa dizer a palavra mágica para sair");
			System.out.println("Quer sair?");
			text = sc.nextLine();
			}while(!text.equalsIgnoreCase("por favor"));
			
			System.out.println("Obrigado! :)");
		sc.close();
	}

}
