package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Mapa {

	
	public static void main(String[] args) {
		
		
		Map<Integer, String> Users = new HashMap<>();
		
		
		Users.put(1, "Ronaldo");
		Users.put(2, "Matheus");
		Users.put(3, "João");
		Users.put(4, "Malaquias");
		Users.put(5, "Fernando");
		
		System.out.println(Users.keySet());
		System.out.println(Users.values());
		System.out.println(Users.entrySet());
		
		System.out.println(Users.containsKey(2));
		System.out.println(Users.containsValue("Ronaldo"));
		
		System.out.println(Users.get(3));
		
		//PERCORRER LISTA PELA KEY
		for(int chave: Users.keySet()) {
			
			System.out.println(chave);
			
		}
		
		//PERCORRER LISTA PELO VALOR
		for(String nome: Users.values()) {
			
			System.out.println(nome);
			
		}
		
		//PERCORRER LISTA PELO VALOR E PELA CHAVE SIMULTANEAMENTE
		for(Entry<Integer, String> registro : Users.entrySet() ) {
			
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
			
		}
		
		
		
		
		
	}
	
	
}
