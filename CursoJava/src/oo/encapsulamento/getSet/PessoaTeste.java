package oo.encapsulamento.getSet;

public class PessoaTeste {

	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(25,"Luck", "Vader");
		
		
		System.out.println(p1.getIdade());
		System.out.println(p1.getNome());
		System.out.println(p1.getSobrenome());
		System.out.println(p1.getNomeCompleto());
		
	}
	
	
	
}
