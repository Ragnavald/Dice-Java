package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Comsumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = valor -> System.out.println(valor.nome);
		Produto prod = new Produto("Caneta",2.0,0.2);
		imprimir.accept(prod);
		
		List<Produto> produtos = Arrays.asList(new Produto("Lápis", 1.5,0.3), new Produto("Apontador",2.3,0.1));
		produtos.forEach(imprimir); //consumer
		produtos.forEach(p ->  System.out.println(p.preco));
		
	}
	
	
}
