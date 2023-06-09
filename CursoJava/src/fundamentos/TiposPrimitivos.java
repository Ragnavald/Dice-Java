package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		//informações do funcionário
		
		//Tipos numéricos inteiros
		byte anosEmpresa = 22;
		short numeroDeVoos = 3232;
		int id = 4578421;
		long pontosAcumulados = 32_20_450L;
		
		//Tipos numéricos reais
		float salario = 11_455.45F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo caracter 
		char status = 'u';
	
		
		//Dias de empresa 
		System.out.println(anosEmpresa * 365);
		
		//número de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": ganha-> "+ salario);
		String ferias = new String();
		if (estaDeFerias == false) {
		 ferias = "não";
		}else {
		 ferias = "sim";	
		}
		System.out.println("Férias? "+ferias+ ", Ativo? "+status);
	}
	
}
