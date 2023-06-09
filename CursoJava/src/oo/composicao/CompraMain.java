package oo.composicao;

public class CompraMain {

	public static void main(String[] args) {
		
		
		Compra c1 = new Compra();
		c1.cliente = "Ronaldo";
		c1.adicionarItem(new Item("Teclado",2,20.3)); //CRIA UM OBJETO DO TIPO ITEM E ADICIONA NA LISTA 
		c1.adicionarItem(new Item("Mouse",2,20.3)); //CRIA UM OBJETO DO TIPO ITEM E ADICIONA NA LISTA 
		c1.adicionarItem(new Item("Monitor",2,20.3)); //CRIA UM OBJETO DO TIPO ITEM E ADICIONA NA LISTA 
		
		System.out.println(c1.total());
		
	}
	
	
	
}
