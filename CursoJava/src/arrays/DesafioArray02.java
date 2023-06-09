package arrays;

import java.util.Scanner;

public class DesafioArray02 {

	
	public static void main(String[] args) {
		
		//ARRAY DENTRO DE OUTRO
		
		Scanner sc = new Scanner(System.in);
		
		int QtdAlunos, QtdNotas;
		double nota, somatorio = 0, media;
		
		System.out.println("Digite a quantia de alunos: ");
		QtdAlunos = sc.nextInt();
		System.out.println("Digite a quantia de notas por aluno: ");
		QtdNotas = sc.nextInt();
		
		
		double[][] Alunos = new double[QtdAlunos][QtdNotas];
		
		
		for (int i = 0; i < Alunos.length; i++) {
			
			for (int j = 0; j < Alunos[i].length; j++) {
				
				System.out.println("Digite a "+(j+1)+"º nota do aluno "+(i+1));
				nota = sc.nextDouble();
				Alunos[i][j] = nota;
				somatorio += nota;
			}	
			
		}
		
		media = somatorio/(QtdAlunos * QtdNotas);
		System.out.println("a média da turma é: " +media);
		
		
		
		
		
		sc.close();
		
		
	}
	
	
}
