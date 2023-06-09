package oo.composicao;

public class CursoMain {

	
	public static void main(String[] args) {
		
		
		Aluno alun1 = new Aluno("Ronaldo");
		Aluno alun2 = new Aluno("Marcos");
		Aluno alun3 = new Aluno("Ramon");
		
		Curso curso1 = new Curso("Java");
//		Curso curso2 = new Curso("C#");
//		Curso curso3 = new Curso("Python");
		
		//RELACIONAMENTO ENTRE OS OBJETOS
		curso1.addAluno(alun2);
		curso1.addAluno(alun3);
//		
//		curso2.addAluno(alun2);
//		curso3.addAluno(alun3);
//		
//		alun1.addCurso(curso3);
//		alun2.addCurso(curso3);
//		alun3.addCurso(curso3);
//		
		//TODOS OS ALUNOS DO CURSO 1
		for(Aluno aluno: curso1.aluno) {
			
			System.out.println(aluno.nome);
			
		}
		
//		System.out.println(alun1.curso.get(0).aluno.toString());
		
		Curso cursoEncontrado = alun1.obterCursoPorNome("Java");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.aluno);
			
		}
	}
	
	
}
