package arrays;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas notas deseja para tirar a média? ");
		int qtd = sc.nextInt();
		double total = 0;
		double[] notas = new double[qtd];
		
		if (qtd != 0) {
			
		for(int i = 0; i < qtd; i++) {
			
			System.out.println("Digite a "+(i+1)+"º nota:");
			notas[i] = sc.nextDouble();
	  
		}
		
		//PERCORRER ARRAY
		for(double nota:notas) {
			
			total+=nota;
		}
		
		System.out.println("Média é: "+(total/qtd));
		}
		sc.close();
		
	}
	
	
}
