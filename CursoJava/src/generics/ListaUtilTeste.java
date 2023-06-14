package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("C#","Java","PHP","Python");
		List<Double> num = Arrays.asList(2.0,3.9,5.9);
		List<Object> obj = Arrays.asList(null,"vazio",2.0, Arrays.asList("ronaldo","junior", Arrays.asList(1,2,5)), 'w');
		
//		obj.stream().forEach(System.out::println);
		String lastLang = (String) ListUtil.getUltimo1(langs);
		System.out.println(lastLang);
		
		Double lastNum = (Double) ListUtil.getUltimo1(num);
		System.out.println(lastNum);
		
		Object lastObj = ListUtil.getUltimo1(obj);
		System.out.println(lastObj);
		
		System.out.println(ListUtil.getUltimo2(langs));
		System.out.println(ListUtil.getUltimo2(num));
		System.out.println(ListUtil.getUltimo2(obj));
		
	}
	
}
