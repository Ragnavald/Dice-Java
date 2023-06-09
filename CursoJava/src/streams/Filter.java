package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {

	Aluno a1 = new Aluno("Ana",10);
	Aluno a2 = new Aluno("Bia",7.5);
	Aluno a3 = new Aluno("Daniel",9);
	Aluno a4 = new Aluno("Gui",6);
	Aluno a5 = new Aluno("Rebeca",5.8);
	Aluno a6 = new Aluno("Pedro",9.6);
	Aluno a7 = new Aluno("Renata",6.8);
	
	Predicate<Aluno> situ = a -> a.nota >=7;
	Function<Aluno, String> mensagem = m ->  "Parabéns "+m.nome+" você foi aprovado.";
	Consumer<String> println = System.out::println;
	
	
	
	List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6,a7);
	alunos.stream().filter(situ).map(mensagem).forEach(println);;

}	
	
}
