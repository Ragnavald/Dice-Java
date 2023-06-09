package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Gol;

public class CarroMain {

	
	public static void main(String[] args) {
		
		
		Ferrari c1 = new Ferrari();
		Carro c2 = new Gol();
		
		
		System.out.println(c1.getSpeed());
		System.out.println(c2.getSpeed());
		

		c1.ligarTurbo();
		c1.speedUp();
		c1.speedUp();
		c1.desligarTurbo();
		c1.speedUp();
		System.out.println(c1.getSpeed());
		System.out.println(c1.velocidadeDoAr());
		
		c2.speedUp();
		c2.speedUp();
		System.out.println(c2.getSpeed());
		
		
	}
	
	
}
