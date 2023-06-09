package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		
		try {
		geraErro1();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
		geraErro2();
		} catch(Exception e) {
		System.out.println(e.getMessage());
		}
	}
	
	
	static void geraErro1() {
	//NECESSARIO "THROW" PARA LNÇAR O ERRO
		throw new RuntimeException("Ocorreu um erro#01 "); //EXCEÇÃO NÃO CHECADA 
	}
	
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro#02 "); // EXECEÇÃO CHECADA
	}
	
	
}
