package fundamentos;

import java.util.Scanner;

public class desafioSalarioMedia {

	public static void main(String[] args) {
		
		String Sal1, Sal2, Sal3;
		System.out.println("Cálculo da média de três salários");
		System.out.println("Por favor digite o primeiro salário");
		Scanner entrada = new Scanner(System.in);
		Sal1 = entrada.nextLine().replace(",", "." );
		System.out.println("Por favor digite o segundo salário");
		Sal2 = entrada.nextLine().replace(",", "." );
		System.out.println("Por favor digite o terceiro salário");
		Sal3 = entrada.nextLine().replace(",", "." );
		System.out.println(Sal1);
		System.out.println(Sal2);
		System.out.println(Sal3);
		double m = ((Double.parseDouble(Sal1) + Double.parseDouble(Sal2) + Double.parseDouble(Sal3))/3);
		System.out.printf("A média dos três salários é: R$ %.2f",m);
		entrada.close();

	}
}
