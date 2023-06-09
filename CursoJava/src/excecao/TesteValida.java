package excecao;

public class TesteValida {

	public static void main(String[] args) {
		
		try {
		Aluno a = new Aluno("",-7);
		Validar.aluno(a);
		} catch (StringVaziaException s) {
			System.out.println(s.getMessage());
		} catch(NumeroNegativoException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
