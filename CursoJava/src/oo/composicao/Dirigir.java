package oo.composicao;

public class Dirigir {

	
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		System.out.println(carro.IgnicaoOnOrOff());
		carro.Ignicao(); //TROCA O BOOLEAN DE LIGADO DO MOTOR A PARTIR DE CARRO
		System.out.println(carro.IgnicaoOnOrOff());
		System.out.println(carro.motor.giros());
		
		carro.acelerar();
		carro.acelerar();
		
		System.out.println(carro.motor.fatorInjecao);
		System.out.println(carro.motor.giros());
		
		
	}
	
	
	
	
}
