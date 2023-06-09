package oo.abstrato;

public class TesteAbstract {

	
	public static void main(String[] args) {
		
		Animal a = new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.respirar());
		
		Manifero m = new Cachorro();
		System.out.println(m.mover());
		System.out.println(m.respirar());
		System.out.println(m.mamar());
		
		Cachorro c = new Cachorro();
		System.out.println(c.mover());
		System.out.println(c.respirar());
		System.out.println(c.mamar());
		
		
	}
	
}
