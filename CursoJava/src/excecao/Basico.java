package excecao;

public class Basico {

	
	public static void main(String[] args) {
	
		Aluno a1 = null;
		
		//TRATAMENTO DE ERRO DE FORMA GENÉRICA
		try {	
		imprimirAluno(a1);
		} catch(Exception e){
			System.out.println("Ocorreu um erro: "+ e.getMessage());
		}
		
		//TRATAMENTO DE ERRO DE FORMA ESPECÍFICA
		try {
		System.out.println(7/0);
		} catch(ArithmeticException e) {
		 System.out.println("Ocorreu um erro: "+e.getMessage());
		}
	}
	
	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}
	
}
