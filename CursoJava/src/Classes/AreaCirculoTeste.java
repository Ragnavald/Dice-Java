package Classes;

public class AreaCirculoTeste {

	public static void main(String[] args) {
		
		AreaCirculo a1 = new AreaCirculo(2);
		
		System.out.println(a1.area()); 
		
		
		
		//NÃO PRECISO CRIAR UMA INSTÂNCIA PARA ACESSAR ESSE MÉTODO, POIS ELE É STATIC, ASSIM COMO .pow()
		AreaCirculo.area(2);
		
		
	}
	
	
}
