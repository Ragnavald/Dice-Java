package controle;


import java.util.Scanner;

public class DesafioMaiorNum {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int numE, numM = 0;
		
	for(int i = 0; i < 10; i++) {
		
		System.out.println("Digite um número:");
		numE = sc.nextInt();
		if (numE > numM) {
			numM = numE;
		}
		
	}
		System.out.println("O maior número digitado é: "+numM);
		
		sc.close();
		
	}
	
	
}
