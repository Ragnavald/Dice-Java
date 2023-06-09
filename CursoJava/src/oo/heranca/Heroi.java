package oo.heranca;

public class Heroi extends Jogador {
	
	public Heroi(){	
		super(1,0);
		super.vida = 210;
		super.ataque = 12;	
	} 
	public Heroi(int x, int y){
		super(x,y);
		super.vida = 210;
		super.ataque = 12;	
	}
	
	
	public boolean atacar(Jogador oponente) {
		
		boolean ataque1 = super.atacar(oponente); 
		
		return ataque1;
		
	}
	
}
