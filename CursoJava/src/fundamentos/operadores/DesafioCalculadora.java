package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		//Ler num1
		//Ler num2
		// escolher operação * - / %
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		double num1 = sc.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = sc.nextDouble();
		System.out.println("Escolha uma operação (*, /, - , + ou %) entre num1 e num2");
		String op = sc.next();
		
		double resultado;
		//ternary operator 
		resultado = "+".equals(op)? num1 + num2: 0;
		resultado = "-".equals(op)? num1 - num2 : 0;
		resultado = "%".equals(op)? num1 % num2 : 0;
		resultado = "/".equals(op)? num1 / num2 : 0;
		resultado = "*".equals(op)? num1 * num2 : 0;   	 
		
		System.out.print(resultado);
		sc.close();
		
	}

}
