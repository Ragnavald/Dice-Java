package generics;

public class ParesTestes {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultado = new Pares<>();
		
		resultado.adicionar(1, "Pedro");
		resultado.adicionar(2, "Ronaldo");
		resultado.adicionar(3, "Ronaldo");
		
		resultado.listar();
		
	}
	
	
	
}
