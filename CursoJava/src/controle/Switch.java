package controle;

public class Switch {

	public static void main(String[] args) {
		
		
		String faixa = "preta";
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Seio o Heian Godan");
		case "verde":
			System.out.println("Seio o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sadan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
				System.out.println("Não sei de nada :(");
		}
		
	}
	
	
}
