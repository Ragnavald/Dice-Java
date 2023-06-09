package systensGame;

public class Item {

	private String nome;
	private double peso;
	private double prob; 
	
	public Item() {
		
	}
	public Item(String nome, double peso, double prob) {
		this.setNome(nome);
		this.setPeso(peso);
		this.setProb(prob);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getProb() {
		return prob;
	}
	public void setProb(double prob) {
		this.prob = prob;
	}
	
	public static double comum() {
		return 0.5;
	}
	public static double raro() {
		return 0.15;
	}
	public static double epico() {
		return 0.05;
	}
	public static double lendario() {
		return 0.002;
	}
	
	
}
