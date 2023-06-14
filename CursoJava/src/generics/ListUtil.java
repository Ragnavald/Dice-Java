package generics;

import java.util.List;

public class ListUtil {

	
	public static Object getUltimo1(List<?> lista ) {
		return lista.get(lista.size() - 1);
	}
	//O TIPO DA LIST PASSADO COMO PARÂMETRO SETA O MESMO TIPO PARA A FUNÇÃO 
	public static <T> T getUltimo2(List<T> lista){
		return lista.get(lista.size() - 1);
	}
}