package lambdas;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class DesafioBinaryOperator {

	public static void main(String[] args) {
		
		Produto pro = new Produto("Ipad", 3235.89, 0.13);
		Produto pro2 = new Produto("Ipad", 32.89, 0.13);
		
		Function<Produto, Double> preco = p -> p.preco * (1 - p.desconto);
		UnaryOperator<Double> precoComImposto = p -> p >= 2500 ?  p * 1.085 : p;
		UnaryOperator<Double> PrecoComFrete = p -> (p >= 3000.0) ? p + 100.0 : p + 50.0;
		Consumer<Produto> nota = p -> {
			double precoFinal =  preco.andThen(precoComImposto).andThen(PrecoComFrete).apply(p);
			System.out.printf("Total: R$ %.2f\n",precoFinal);
		};
		
		nota.accept(pro);
		nota.accept(pro2);
		
	}
		
		
	}
	

