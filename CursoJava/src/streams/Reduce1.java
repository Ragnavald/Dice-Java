package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {
		
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		BinaryOperator<Integer> soma = (ac, n) -> ac + n;
		Integer total1 = nums.parallelStream().reduce(1, soma);
		System.out.println(total1);
		
		BinaryOperator<Integer> soma1 = (ac,n) -> ac + n;
		Integer total2 = nums.stream().reduce(2,soma1);
		System.out.println(total2);
		
	}
	
	
	
}
