package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> curso = new ArrayList<>();
	
	Aluno(String nome){
		this.nome = nome;		
	}
	
	void addCurso(Curso curso){
		
		this.curso.add(curso);
		curso.aluno.add(this);
	}
	
	
	public String toString() {
		return nome;
		
	}
	
	Curso obterCursoPorNome(String nome) {
		for(Curso curso: this.curso) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				
				return curso;
			}	
		}
		return null;
	}
	
}
