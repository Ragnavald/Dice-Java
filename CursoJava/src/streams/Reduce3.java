package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ronaldo", 5);
		Aluno a2 = new Aluno("Matheus", 2);
		Aluno a3 = new Aluno("Ramon", 7);
		Aluno a4 = new Aluno("Ragnar", 7);
		
		List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, Double> apenasnota = n -> n.nota;
		
		BiFunction<Media, Double, Media> calcularMedia = (media,nota) -> media.add(nota);
		BinaryOperator<Media> combinarMedia = (m1,m2) -> Media.combinar(m1, m2);
		
		Media media = alunos.stream().filter(aprovado).map(apenasnota).reduce(new Media(), calcularMedia, combinarMedia);
		System.out.println("Média dos aprovados: "+media.getMedia());
	}
	
}
