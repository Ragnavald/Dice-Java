package Classes;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Digite o dia: ");
		String dia = sc.nextLine();
		System.out.println("Digite o mês: ");
		String mes = sc.nextLine();
		System.out.println("Digite o ano: ");
		String ano = sc.nextLine();
		
		if(dia != "" && mes != "" && ano != "") {
			
		int Ndia, Nmes, Nano;
		Ndia = Integer.parseInt(dia);
		Nmes = Integer.parseInt(mes);
		Nano = Integer.parseInt(ano);
		Data d2 = new Data(Ndia,Nmes,Nano);
		System.out.printf(d2.dataFormat());
		
		}else {
			
		Data d1 = new Data();
		System.out.print(d1.dataFormat());
		
		}
		
		
		
		sc.close();
	}
	
	
	
}
