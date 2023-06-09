package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	final String nome;
	final List<Aluno> aluno = new ArrayList<>();
	
	Curso(String nome){
		
		this.nome = nome;
	}
	
	void addAluno(Aluno aluno){
		
		this.aluno.add(aluno); //ADICIONA O OBJ aluno NA LIST aluno 
		aluno.curso.add(this); //ADICIONA O OBJ Curso (nome, aluno) NA LIST curso DO OBJ aluno
		
	}
	
}
