package Classes;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	
	//construtor padrão explícito
	
	Produto(){			
	}
	
	//construtor 
	Produto(String nome, double preco){
		
		// nome da var do objeto pertence ao atributo nome da classe 
		this.nome = nome;
		this.preco = preco;
		
	}
	
	//não preciso receber preco nem desconto pois o objeto já possui os atributos
	double precoDesconto(){
		return preco * (1-desconto);	
	}

	
	
	
	
}
