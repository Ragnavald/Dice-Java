package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 0;
		monstro.y = 0;
		
		Heroi heroi = new Heroi();
		heroi.x = 0;
		heroi.y = 1;
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem : "+monstro.vida+" pontos de vida");
		System.out.println("Herói tem : "+heroi.vida+" pontos de vida");
		
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.NORTE); 
//		System.out.println(j1.y);
//		j1.andar(Direcao.SUL); 
//		System.out.println(j1.y);
		
	}
	
}
