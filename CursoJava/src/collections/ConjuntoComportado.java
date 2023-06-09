package collections;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	
	public static void main(String[] args) {
			
		SortedSet<String>	lista = new TreeSet<>(); //só vai aceitar valores do tipo String
		lista.add("Ronaldo");
		lista.add("Ricardo");
		lista.add("João");
		lista.add("Lucas");
		
		
		for(String nome:lista) {
			
			System.out.println(nome);
			
		}
		Set<Integer>num = new TreeSet<>(); //só vai aceitar valores do tipo String
		num.add(1);
		num.add(9);
		num.add(10);
		num.add(20);
		num.add(5);
		
		for(int nums: num) {
			
			System.out.println(nums);
		}
		
	}
	
	
}
