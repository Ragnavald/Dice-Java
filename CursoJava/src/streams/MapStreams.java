package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class MapStreams {

	
	public static void main(String[] args) {
		
		Consumer<String> println = System.out::println;
		List<String> marcas = Arrays.asList("BMW","Audi","Honda");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(println);
		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		UnaryOperator<String> grito = n -> n+"!!!";
		
		marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(println);
		marcas.stream().map(maiuscula).map(primeiraLetra).forEach(println);
		marcas.stream().map(maiuscula).forEach(println);
		
	}
	
	
}
