package oo.composicao.desafio;

public class CompraMain {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Cadeira", 129.99);
		Produto p2 = new Produto("Mesa", 649.99);
		Produto p3 = new Produto("Vaso de Flor", 69.9);
		Produto p4 = new Produto("Cama", 2099.9);
		
		Compra c1 = new Compra();
		c1.addItem(p3,5); //5 VASOS DE FLORES
		c1.addItem(p2,1); //1 MESA
		
		Compra c2 = new Compra();
		c2.addItem(p4,4); //4 CAMAS
		c2.addItem(p1,1); //1 CADEIRA
		
		Compra c3 = new Compra();
		c3.addItem(p2,10);
		c3.addItem(p1,40); 
		
		Compra c4 = new Compra();
		c4.addItem(p3,25); 
		c4.addItem(p4,10); 
		
		
		Cliente cli1 = new Cliente("José");
		cli1.addCompra(c1); 
		cli1.addCompra(c2);
		
		Cliente cli2 = new Cliente("Ana");
		cli2.addCompra(c3);
		cli2.addCompra(c4);

		System.out.println(cli1.getTotalCompra()+ " Gasto total do "+cli1.nome);
		System.out.println(cli2.getTotalCompra()+ " Gasto total da "+cli2.nome);
	
	}
	
	
}
