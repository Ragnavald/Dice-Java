package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	List<Item> itens = new ArrayList<>();
	
	void addItem(Produto p, int Qtd){
		
		this.itens.add(new Item(p,Qtd)); //ADICIONA DIRETAMENTE PASSANDO O PRODUTO E A QUANTIDADE
	}
	
	double	getTotal(){
		
		double  total = 0;
		
		for(Item item:itens) {
			
			 total += item.pro.preco * item.Qtd;
		}
		
		return total;
	}

}


