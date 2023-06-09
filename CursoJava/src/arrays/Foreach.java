package arrays;

public class Foreach {

	
	public static void main(String[] args) {
		
		
		double[] notas = {9.6,5.6,5.9,10};
		double total = 0;
		
		
		for(double nota:notas) {
		total += nota;	
		}
		
		System.out.println("Média: "+total/notas.length);
		
		
		
		
	}
	
	
}
