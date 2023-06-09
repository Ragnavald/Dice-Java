package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		Predicate<Produto> isCaro = prod -> (prod.preco * (1-prod.desconto)) >= 750; 
		Produto pro = new Produto("Notebook",3890.0,0.2);
		System.out.println(isCaro.test(pro));
		
	}
	
	
}
