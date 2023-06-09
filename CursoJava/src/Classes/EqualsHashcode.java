package Classes;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Fernando";
		u1.email = "fernando@outlook.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Fernando";
		u2.email = "fernando@outlook.com";
		
		
		System.out.println(u1==u2); //false, pois são dois endereços de memória distintos 
		System.out.println(u1.equals(u2)); // false 
		System.out.println(u2.equals(u1)); // false
		
		
		
	}
	
}
