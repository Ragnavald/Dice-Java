package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTestLambdaJava {

	public static void main(String[] args) {
		
		BinaryOperator<Double> cal1 = (x,y) ->  x + y; 
		System.out.println(cal1.apply(2.0,3.0));  
		BinaryOperator<Integer> cal2 = (x,y) ->  x + y; 
		System.out.println(cal2.apply(2,3));  
	}
	
	
}
