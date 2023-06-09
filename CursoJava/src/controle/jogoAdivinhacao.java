package controle;


import java.util.Random;
import java.util.Scanner;

public class jogoAdivinhacao {

	
	public static void main(String[] args) {
	
	int num, numgerado;
	String condi = "";
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Tente adivinhar qual número foi gerado de (0 a 100)");
	Random rd = new Random();
	numgerado = rd.nextInt(100);
	
	for (int i = 10; i >=1; i--) {
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		if (num == numgerado) {
			System.out.println("Parabéns você acertou o número :)");
			break;
		}else {
			
		 if(num > numgerado) {
			 condi = "menor"; 
		 }else {
			condi = "maior";
		 }
			System.out.println("Errou :( Restam apenas "+i+" tentativas./n O número é "+condi);	
		}
		
		
	}
		
	sc.close();	

	}
	
}
