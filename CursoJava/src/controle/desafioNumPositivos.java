package controle;


import java.util.Scanner;

public class desafioNumPositivos {

	public static void main(String[] args) {
	
		double soma = 0, num;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Soma de números\n Para sair digite um número negativo");
		
		do {
		System.out.println("Digite um número: ");
		num = sc.nextDouble();
		soma += num;	
		System.out.println("Montande: "+soma);
		} while (num >=0);
		
		sc.close();
		
	}
}
