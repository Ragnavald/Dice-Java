package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
//		Consumer<Object> print = System.out::print;
		Consumer<Object> println = System.out::println;
		
		Stream<String> langs = Stream.of("Java","Lua", "JS\n");
		langs.forEach(println);
		
		String[] maisLangs = {"python","Lisp","Pearl","Go\n"};
		Stream.of(maisLangs).forEach(println);
		
		Arrays.stream(maisLangs).forEach(println);
		Arrays.stream(maisLangs,0,2).forEach(println);
		
		//Collections with streams
		List<String> outrasLangs = Arrays.asList("\nJava","Python","C#");
		outrasLangs.stream().forEach(println);
		
		//Stream generate
		Stream.iterate(0, n -> n+1).forEach(println);
		
		
		
		
		
	}
	
	
}
