package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159;
		double area = raio * raio* PI;
		System.out.println("Sua area é igual: "+area);
		raio = 10;
		area= raio * raio * PI;
		System.out.println("Sua area com raio 10 equivale a: "+area+"m²");	
	}
}
