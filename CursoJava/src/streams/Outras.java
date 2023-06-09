package streams;

import java.util.Arrays;
import java.util.List;

public class Outras {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ronaldo", 5);
		Aluno a2 = new Aluno("Matheus", 2);
		Aluno a3 = new Aluno("Ramon", 7);
		Aluno a4 = new Aluno("Ragnar", 7);
		Aluno a5 = new Aluno("Igor", 10);
		Aluno a6 = new Aluno("Igor", 2);
		Aluno a7 = new Aluno("Isac", 9);
		Aluno a8 = new Aluno("Leonardo", 10);
		
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
		
		System.out.println("distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		
	
		
	}
	
}
