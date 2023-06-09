package Classes;

//Como a Class (Produto) e (ProdutoTeste) estão no mesmo pacote, não precisamos importar 

public class ProdutoTeste {
	
	public static void main(String[] args) {
	//Instânciar o produto
	//p1 é do tipo (Produto)
		
	Produto p1 = new Produto();
	Produto p2 = new Produto();
	
	p1.nome = "Nootebook";
	p1.preco = 4399.89;
	
	p2.nome = "Caneta";
	p2.preco = 2.50;
	
	
	// O método construtor recebe 3 parâmetros, como definimos na classe	
	Produto p3 = new Produto("Lápis",20.5);
		
	
	System.out.println("Preço final do "+ p1.nome +" é "+p1.precoDesconto());
	System.out.println("Preço final do "+ p2.nome +" é "+p2.precoDesconto());
	System.out.println("Preço final do "+ p3.nome +" é "+p3.precoDesconto());
	
	} 
	
}
