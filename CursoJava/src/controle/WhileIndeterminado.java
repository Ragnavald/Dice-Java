package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("anotações: ");
		String text = " ";
		
		while(!text.equalsIgnoreCase("sair")) {
		
		text = sc.nextLine();
		
		}
		
		
		sc.close();
		
		
	}
	
	
}
