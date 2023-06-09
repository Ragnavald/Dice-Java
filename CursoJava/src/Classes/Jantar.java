package Classes;

import java.util.Scanner;

public class Jantar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome do Prato do dia: ");
		String nome  = sc.nextLine();

		System.out.println("Digite o peso da refeição em KG: ");
		double peso = sc.nextDouble();
		sc.nextLine(); // consume leftover newline character

		System.out.println("Digite o nome da pessoa: ");
		String nomeP  = sc.nextLine();

		System.out.println("Digite o peso da pessoa: ");
		double pesoP = sc.nextDouble();
		
		Comida prato = new Comida(nome,peso);
		Pessoa pessoa = new Pessoa(nomeP,pesoP);
		pessoa.comer(prato);
		
		System.out.println("Seu peso final é: "+pessoa.peso);
		
		
		sc.close();
	}
	
	
}
