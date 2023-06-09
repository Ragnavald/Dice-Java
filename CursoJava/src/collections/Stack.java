package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {

	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Dom Quixote");
		livros.add("Hobbit");
		livros.add("Bíblia");
		
//		System.out.println(livros.peek());
//		System.out.println(livros.element());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		System.out.println(livros.pop());
		
		
		
	}
	
	
	
}
