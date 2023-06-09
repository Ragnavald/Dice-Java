package arrays;

import java.util.Arrays;

public class Exercicio {

	
	public static void main(String[] args) {
		
//		double[] notasAlunoA = new double[3];
//		notasAlunoA[0] = 10;
//		notasAlunoA[1] = 3;
//		notasAlunoA[2] = 6;
		
		double[] notasAlunoA = {6.9, 7.6, 9.6};
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		
		for(int i = 0; i < notasAlunoA.length; i++) {
			
			total += notasAlunoA[i];
			
		}
		
		double media = total/ notasAlunoA.length;
		System.out.println(media);
		
		
	}
	
	
}
