package systensGame;

public class contItem {

	private Item item;
	private int Qtd;
	
	public contItem(Item item, int qtd) {
		this.item = item;
		Qtd = qtd;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getQtd() {
		return Qtd;
	}
	public void setQtd(int qtd) {
		Qtd = qtd;
	}
	
	
}
