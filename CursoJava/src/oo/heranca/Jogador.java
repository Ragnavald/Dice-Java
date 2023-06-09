package oo.heranca;

public class Jogador {

	public int x;
	public int y;
	public int vida = 100;
	public int ataque = 10;
	
	Jogador(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	
	//ENUM 
	boolean andar(Direcao direcao) {
		
		switch(direcao) {
		
		case NORTE : { y+=1; break;}
		case SUL : { y-=1; break;}
		case LESTE : { x+=1; break;}
		case OESTE : { x-=1; break;}
		
		}
		
		return true;
	}
	
	boolean atacar(Jogador oponente) {
		
		
		int deltaX = Math.abs(x - oponente.x); //VALOR ABSOLUTO
		int deltaY = Math.abs(y - oponente.y);
		if(deltaX == 0 && deltaY == 1) {		
			oponente.vida -= ataque;
			return true;
		}else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= ataque;
			return true;
		}
			return false;
		
	}
	
	
}
