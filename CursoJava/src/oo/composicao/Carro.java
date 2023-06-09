package oo.composicao;

public class Carro {

	Motor motor; //PARA CADA NOVO CARRO TERÁ 1 MOTOR
	
	Carro(){
		
		this.motor = new Motor(this) ;
	}
	
	
	void acelerar() {
		if(motor.fatorInjecao <= 1) {
		motor.fatorInjecao += 0.4;
		}
	}
	
	void frear() {
		if(motor.fatorInjecao >= 0.4) {
		motor.fatorInjecao -= 0.4;	
		}
	}
	
	void Ignicao() {
		if (!motor.ligado) {
			motor.ligado = true;
		}else {
			motor.ligado = false;
		}
	}
	
	boolean IgnicaoOnOrOff() {
		
		return motor.ligado;
				
	}
	
	
	
}
