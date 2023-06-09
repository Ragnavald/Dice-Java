package controle;

import java.util.Scanner;

public class numprimos {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		int resto, vezes = 0;
		
			
		for (int i = 1; i <= 10; i++) {
	
			if(num == i) {
				continue;
			}
			
			resto = num % i;
			
			if(resto == 0) {
			vezes ++;	
			} 
			}
		if(vezes == 1) {
		System.out.println("Número é primo");
			
		}else {
			
		System.out.println("Número não primo");	
			
		}	
		
		sc.close();
	}
	
	
	
}
