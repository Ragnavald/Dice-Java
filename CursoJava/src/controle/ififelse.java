package controle;

import java.util.Scanner;

public class ififelse {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a nota: ");
		double nota = sc.nextDouble();
		if(nota < 4.5) {
			System.out.println("Conceito: F");			
		}else if (nota >= 4.5 && nota <= 5) {
			System.out.println("Conceito: D");
		}else if(nota > 5 && nota <=7) {
			System.out.println("Conceito: C");
		}else if(nota > 7 && nota <= 8.5) {
			System.out.println("Conceito: B");
		}else if(nota > 8.5 && nota <=10) {
			System.out.println("Conceito: A");
		}else if(nota > 0 || nota > 10) {
			System.out.println("Nota Inválida!");
		}
		
	
		sc.close();
	}
	
	
}
