package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(66.2);
		
		Comida c1 = new Arroz(0.2);
		Comida c2 = new Feijao(0.125);
		Comida c3 = new Sorvete(0.30);

		
		convidado.comer(c1);
		convidado.comer(c2);
		convidado.comer(c3);
		
		
		System.out.println(convidado.getPeso());
			
	}
	
	
}
