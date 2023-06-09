package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 1;
		int b = 2;
		
		// pós fixado o incremento é feito após a comparação
		a++; //a = a + 1;
		a--; //a = a - 1;
		
		// pré fixado o incremento é feito antes da comparação
		++b; //b = b + 1
		--b; //b = b - 1 
		
		System.out.println(++a == b--); //true
		System.out.println(a++ == --b); // true
		System.out.println(a++ == b--); //false
		

	}

}
