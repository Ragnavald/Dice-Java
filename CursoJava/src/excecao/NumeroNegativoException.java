package excecao;

@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException {

	private String nome;
	
	public NumeroNegativoException(String nome) {
	
		this.nome = nome;
	}
	
	public String getMessege() {
		return String.format("O atributo %s está negativo",nome);
	}
	
	
}
