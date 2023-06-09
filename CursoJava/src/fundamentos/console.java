package fundamentos;

import java.util.Scanner;

public class console {

	public static void main(String[] args) {
		
		String nome, sobrenome;
		int idade;
		
		System.out.println("Digite seu nome");
		Scanner Entrada = new Scanner(System.in);
		nome = Entrada.nextLine();
		System.out.println("Digite seu sobrenome");
		sobrenome = Entrada.nextLine();
		System.out.println("Digite sua idade");
		idade = Entrada.nextInt();
		
		System.out.printf("Nome: %s \nSobrenome: %s\nIdade: %d", nome, sobrenome, idade );
		Entrada.close();
		
	}
	
}
