package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet(); 
		
		
		conjunto.add(1.5); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("teste"); //String já é obj
		conjunto.add(2); // int -> Integer
		conjunto.add('x'); //char -> Character
		
		System.out.println("Existem " +conjunto.size()+" elementos no HashSet");
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove(2));
		System.out.println("Existem " +conjunto.size()+" elementos no HashSet");
		
		//saber se existe determinado elemento no HashSet
		System.out.println(conjunto.contains(2));
		
		Set nums = new HashSet();
		
		nums.add(3);
		nums.add("Não");
		nums.add(true);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		conjunto.addAll(nums); //união entre dois conjuntos
		System.out.println(conjunto); 
		conjunto.retainAll(nums); // intersecção entre conjuntos 
		System.out.println(conjunto); 
		
		conjunto.clear();
		
		
		
		
	}	
	
	
}
