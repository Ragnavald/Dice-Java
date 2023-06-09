package Classes;

public class AreaCirculo {

	double raio;
	final static double pi = 3.14; //definir como static para pupar espaço de memória nas instâncias

	
	AreaCirculo(double raio) {
	
		this.raio = raio;
	}
	
	double area() {

		return pi * raio * raio;
	}
	static double area(double raio) {  //NÃO PRECISO DE INTÂNCIA PARA ACESSAR ESSE MÉTODO
		return pi * raio * raio;
	}
}
