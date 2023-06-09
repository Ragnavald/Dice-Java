package fundamentos.operadores;

import java.util.Random;

public class DesafioLogico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Trabalho na Terça (V ou F)
		//Trabalho na quinta (V ou F)
		
		Random rd = new Random();
		boolean work1 = rd.nextBoolean();
		boolean work2 = rd.nextBoolean();
		
		if (work1 == true && work2 == true ) {
			
			System.out.println("Tv 50 Polegadas e tomar sorvete");		
		}
		else if(work1 == true || work2 == true) {
			System.out.println("Tv 32 Polegadas e tomar sorvete");
		} else if(work1 == false && work2 == false) {
			System.out.println("Ficar em casa");
		}
		
	}

}
