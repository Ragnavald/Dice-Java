package fundamentos.operadores;

import java.util.Scanner;

public class desafioEqSegundoGrau {

	public static void main(String[] args) {

		double a,b,c,x1,x2,delta;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o coeficiente 'a':");
		a = sc.nextDouble();
		System.out.println("Digite o coeficiente 'b':");
		b = sc.nextDouble();
		System.out.println("Digite o coeficiente 'c':");
		c = sc.nextDouble();
		delta = Math.pow(b, 2) - 4 * a * c;

		if (delta < 0) {
			System.out.println("Delta negativo");
		}else {
			x1 = ((-b + Math.sqrt(delta))/2);
			x2 = ((-b - Math.sqrt(delta))/2);
			System.out.printf("X1 = %.2f e X2 = %.2f",x1,x2);
		}
		sc.close();
	}


}
