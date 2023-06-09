package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("Segredo!!!");
		System.out.println(caixaA.abrir());
		
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.15);
		System.out.println(caixaB.abrir());

		Caixa<Character> caixaC = new Caixa<>();
		caixaC.guardar('s');
		System.out.println(caixaC.abrir());
	}
	
}
