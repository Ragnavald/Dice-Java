package controle;

public class Continue {

	
	public static void main(String[] args) {
		
		
		for(int i = 0; i < 10;i++) {
			
			if (i % 2 == 1) {
				continue; //break quebra o laço e continue quebra aquela repetição
			}
		System.out.println(i);
		}
		
	for(int i = 0; i < 10;i++) {
			//exemplo repetir todos menos o 5
			if (i == 5) {
				continue; //quebra a repetoçãoe retorna para o for sem ao menos continuar a linha seguinte
			}
		System.out.println(i);
		}
		
		
	}
	
	
	
}
