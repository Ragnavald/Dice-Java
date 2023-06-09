package fundamentos.operadores;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("2" == "2");
			
			String s1 = new String("2");
			System.out.println("2" == s1);
			System.out.println("2".equals(s1));
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite uma string");
			String s2 = sc.nextLine(); //NextLine não tira os espaços já p Next tira os espaços
			System.out.println("2" == s2.trim()); //false
			System.out.println("2".equals(s2.trim())); //true pelo "equals"
			sc.close();
			
	}

}
