package systensGame;

public class Player {

	private String nome;
	private double peso;
	private double forca;
	private Inventario inv;
	
	public Player(String nome, double peso, double forca, Inventario inv) {
		setInv(inv);
		setNome(nome);
		setPeso(peso);
		setForca(forca);
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
	public double getForca() {
		return forca;
	}
	public void setForca(double forca) {
		this.forca = forca;
	}

	public Inventario getInv() {
		return inv;
	}

	public void setInv(Inventario inv) {
		this.inv = inv;
	}

	public double getPesoTotal() {
		return inv.getPesoInv() + peso;
	}
	
	public void addInv(contItem item) {
		inv.getInventario().add(item);
	}
	
	
	
	
}
