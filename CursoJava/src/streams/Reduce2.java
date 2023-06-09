package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ronaldo", 5);
		Aluno a2 = new Aluno("Matheus", 2);
		Aluno a3 = new Aluno("Ramon", 7);
		Aluno a4 = new Aluno("Ragnar", 7);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> nota = n -> n.nota;
		BinaryOperator<Double> somatoria = (a,b) -> a + b;
		
		alunos.stream().filter(aprovado).map(nota).reduce(somatoria).ifPresent(System.out::println);
		
		
		List<Integer> nums = Arrays.asList(1,2,3);
		
		nums.stream().reduce((a,b)-> a + b).ifPresent(System.out::println);
		
		
	}
	
	
	
}
