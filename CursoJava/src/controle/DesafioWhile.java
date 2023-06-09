package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		int i = 0,qtdNotas = 1;
		double nota,notas = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite a "+qtdNotas+"º nota");
			nota = sc.nextDouble(); 
			if (nota > 10 || nota < 0 ) {
				if(nota == -1) {
					System.out.println("Obrigado!");
				}else {
					System.out.println("Nota inválida, digite uma nota entre 0 a 10. Obrigado");
				}
			}else {
				i++;
				qtdNotas++;
				notas += nota;
			}
		}while(nota != -1);
		
		System.out.printf("A média é: %.2f", (notas/i));
		
		sc.close();
	}
	
	
}
