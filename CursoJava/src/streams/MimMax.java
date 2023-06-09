package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MimMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ronaldo", 5);
		Aluno a2 = new Aluno("Matheus", 2);
		Aluno a3 = new Aluno("Ramon", 7);
		Aluno a4 = new Aluno("Ragnar", 7);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Comparator<Aluno> melhorNota = (a,b) ->
		{
		if(a.nota > b.nota) return 1;
		if(a.nota < b.nota) return -1;
		return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get().nome);
			
			
	
	}
}
