package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

	public static void main(String[] args) {
		
		BinaryOperator<Double> media = (n1,n2) -> (n1+n2)/2;
		System.out.println(media.apply(9.8, 9.3));
		
		BiFunction<Double, Double, String> resultado =
				(n1,n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";
				
				BiFunction<Double, Double, String> resultado2 = (n1,n2) -> {
						double notaFinal = (n1 + n2) / 2 ;
						return notaFinal >= 7 ? "Aprovado" : "Reprovado";

				};
						
						System.out.println(resultado.apply(9.0, 10.0));
						System.out.println(resultado2.apply(9.0, 10.0));
				
	}
	
	
}
