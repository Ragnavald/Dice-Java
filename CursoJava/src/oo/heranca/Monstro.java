package oo.heranca;

public class Monstro extends Jogador {

	 public Monstro(){
		super(0,0); // call the constructor from Jogador
		super.vida = 200;
		super.ataque = 14;
	}
	Monstro(int x, int y){
		super(x,y);
		super.vida = 200;
		super.ataque = 14;
	}
	
	public boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
		
	}
	
}
