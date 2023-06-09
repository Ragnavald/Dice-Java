package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("olá pessoal".charAt(2));
		//Return the first character (0) of a string:
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("Tarde"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa Tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+ "\nSalário: "+salario+".\n\n");
		//after print break the line
		System.out.printf("Nome: %s %s tem %d anos e ganha R$ %.2f reais.", nome, sobrenome, idade, salario);
		//method to convert string with args 
		
		String frase = String.format("\nNome: %s %s tem %d anos e ganha R$ %.2f reais.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		
		}
	
}
