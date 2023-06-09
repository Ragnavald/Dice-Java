package fundamentos;

public class Wrappers {

	public static void main(String[] args) {
		
		//Byte com a primeira letra em maiúsculo equivale a um objeto, permitindo assim, trabalharmos com métodos
		Byte b = 100;
		Short s = 1000;
		
		//Integer
		Integer i = 10000; //int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c+" ...");
	}
	
}
