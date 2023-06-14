package generics;

public class CaixaNumTeste {

	public static void main(String[] args) {
		
		//CaixaNum extends the class number
		CaixaNum<Double> caixaA = new CaixaNum<>();
		caixaA.guardar(2.3);
		System.out.println(caixaA.abrir());
		
		
	}
}
