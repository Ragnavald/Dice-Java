package Classes;

public class ValorVsReferencia {

	public static void main(String[] args) {
		
		double a = 2;
		double b = a; //Atribuição por valor (cópia do valor de a)
		
		a++;
		b--;
		
		System.out.println("Valor de a "+a+" Valor de b "+b);
		
		
		Data d1 = new Data(1,10,2002);
		Data d2 = d1; // atribuição por referência apontam para o mesmo objeto, pois agora possuem o mesmo endereço de memória
		
		System.out.println(d1.dataFormat());
		System.out.println(d2.dataFormat());
		Data.voltarDataPadrao(d2);
		
		
		
		System.out.println(d2.dataFormat());
		System.out.println(d1.dataFormat());
		
		
	}

}
