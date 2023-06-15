package dado;

import java.util.Scanner;

public class DadoTest {

	public static void main(String[] args) {

		String text = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("     _ _          \r\n"
				+ "   __| (_) ___ ___ \r\n"
				+ "  / _` | |/ __/ _ \\\r\n"
				+ " | (_| | | (_|  __/\r\n"
				+ "  \\__,_|_|\\___\\___|\n");
		System.out.println("Exemplo: /d20-3 /d30-3");
		System.out.println("Comando: ");
		text += sc.nextLine().trim().toLowerCase();
		sc.close();
		
		
		try {

			Dado.play(Comando.executar(text));

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
