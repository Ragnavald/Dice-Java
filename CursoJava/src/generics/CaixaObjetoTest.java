package generics;

public class CaixaObjetoTest {

	public static void main(String[] args) {
		
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3); //2.3 PRIMITIVO É CONVERTIDO PARA DOUBLE DO TIPO CLASS ISS SE CHAMA
		//AUTOBOX
		
		Double coisaA = (Double) caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("olá");
		
		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
		
		
		
		
	}
	
}
