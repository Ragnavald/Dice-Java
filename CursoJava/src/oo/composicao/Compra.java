package oo.composicao;

import java.util.ArrayList;

	
//UMA COMPRA TEM MUITOS ITENS
public class Compra {
	
	String cliente; //EM UM SISTEMA REAL CLIENTE É UMA CLASSE
	ArrayList<Item> itens = new ArrayList<>();
	
	public void adicionarItem(Item item) {
		
		this.itens.add(item);
		item.compra = this;
	}
	
	public void adicionarItem(String nome, int Qtd, double preco) {
		this.adicionarItem(new Item(nome, Qtd, preco));
		
	}
	
	
	public double total() {
		double total = 0;
		for(Item valor: itens) {	
			total += valor.preco * valor.Qtd;	
		}
		return total;
		
	}
	
	
}
