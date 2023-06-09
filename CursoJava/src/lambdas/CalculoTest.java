package lambdas;

public class CalculoTest {

	public static void main(String[] args) {
		
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(4, 5));
		calculo = new Multiplicar();		
		System.out.println(calculo.executar(4, 5));
		
	}
	
}
