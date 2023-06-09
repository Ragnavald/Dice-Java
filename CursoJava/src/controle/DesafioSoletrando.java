package controle;

import java.util.Scanner;

public class DesafioSoletrando {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = "";
		
		System.out.println("Digite uma palavra: ");
		word = sc.next();
		
		
		for(int i = 0; i<=word.length(); i++) {
			
			System.out.println(word.charAt(i));
			
		}
		
		sc.close();
	
		
	}
	
}
