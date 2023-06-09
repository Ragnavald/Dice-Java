package Classes;

public class Pessoa {

	String nome;
	double peso;
	
	
	Pessoa(String nome, double peso){
		
		this.nome = nome;
		this.peso = peso;
		
	}
	
	public void comer(Comida prato) {
		
		if (prato != null) {
			peso += prato.peso;
		}
		
	}
	
	
}
