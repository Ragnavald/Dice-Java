package excecao;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException{


	private String nome;
	
	 public	StringVaziaException(String nome) {
		this.nome = nome;
	}
	
	public String getMessage() {
		return String.format("O atributo %s está negativo",nome);
	}
	
	
}
