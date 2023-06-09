package oo.encapsulamento.getSet;

public class Pessoa {

	private int idade;
	private String nome;
	private String sobrenome;

	Pessoa(int idade, String nome, String sobrenome){
		setIdade(idade);
		setNome(nome);
		setSobrenome(sobrenome);
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade >=0 && idade <= 120) {
			this.idade = idade;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	
	public String getNomeCompleto() {
		
		return getNome()+" "+getSobrenome();
	}
	
}
