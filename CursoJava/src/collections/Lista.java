package collections;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		
	ArrayList<User> lista = new ArrayList<>();	
	User u1 = new User("Ronaldo");
	lista.add(u1);
	lista.add(new User("Ana"));
	lista.add(new User("Renato"));
	lista.add(new User("Fernando"));
	
	System.out.println(lista.get(3)); //Acessando pelo índice
	
	lista.remove(2);
	
	System.out.println(lista.contains(new User("Ana"))); //A lista contêm o objeto do tipo 
	//User com atributo de instância nome = Ana?
	
	for(User nome:lista) {
//		System.out.println(nome.nome);
		System.out.println(nome.toString());
	}
	
	}
	
}
