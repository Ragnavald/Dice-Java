package lambdas;

import java.util.function.Function;

public class Functions {

	public static void main(String[] args) {
		
		Function<Integer, String> ParImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		System.out.println(ParImpar.apply(2));
		System.out.println(ParImpar.apply(3));
		
		Function<String, String> Result = valor ->  "O resultado é: " + valor;
		Function<String, String> Empolgado = valor ->  valor + "!!!";
		
		System.out.println(ParImpar.andThen(Result).andThen(Empolgado).apply(32));
		
		
	}
	
	
}
