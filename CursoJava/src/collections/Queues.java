package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("Vinícius");
		fila.add("Matheus");
		fila.add("Felipe");
		fila.add("Lucas");
		
		
		System.out.println(fila.peek());
		System.out.println(fila.element());
		System.out.println(fila.isEmpty());
		System.out.println(fila.poll()); 
		
	}
	
	
}
