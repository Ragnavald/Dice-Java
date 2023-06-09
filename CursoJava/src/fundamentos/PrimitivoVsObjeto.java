package fundamentos;

public class PrimitivoVsObjeto {

	public static void main(String[] args) {
		//criando um objeto
		String texto = new String("texto");
		texto.toUpperCase();
		//String não é do tipo primitivo, então podemos ter notação com ponto e chamar métodos.
		
		//int se trata de um tipo primitivo, mas existem uma forma de fazer notação com ponto por meio dos Wrappers
		int n = 123;
		System.out.println(n);
		
	}
	
}
