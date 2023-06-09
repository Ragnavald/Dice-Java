package fundamentos.operadores;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Input final grade:");
		double media =  sc.nextDouble();
		
		//expressão condicional
		String Resparcial = media >= 5.0 ? "Em recuperação": "Reprovado";
		String Resfinal = media >= 7.0 ? "Aprovado" : Resparcial;
		sc.close();
		System.out.println("O aluno está" + Resfinal);
		
		
	}

}
