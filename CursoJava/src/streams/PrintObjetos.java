package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintObjetos {

	public static void main(String[] args) {
		
	List<String> aprovados = Arrays.asList("Lu","Ana","Gui","Luca");	
	
	System.out.println("Usando For...");
	for (int i = 0; i < aprovados.size(); i++) {
		System.out.println(aprovados.get(i));
	}
	
	System.out.println("\nUsando Foreach...");
	for (String nome: aprovados) {
		System.out.println(nome);
	}
	
	System.out.println("\nUsando Iterator...");
	Iterator<String> it = aprovados.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	
	System.out.println("\nUsando forEach Lambda");
	aprovados.forEach((nome)->{System.out.println(nome);});
	
	System.out.println("\nUsando forEach MethodReference");
	aprovados.forEach(System.out::println);

	System.out.println("\nUsando Stream Api...");
	Stream<String> stream = aprovados.stream();
	stream.forEach(System.out::println);

	}
	
}
