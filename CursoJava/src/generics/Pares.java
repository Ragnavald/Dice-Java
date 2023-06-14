package generics;


import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares <C extends Number,V> {

	public final Set<Par<C,V>> itens = new LinkedHashSet<>();
	
	//PODEMOS UTILIZAR RETURN EM MÉTODOS DO TIPO VOID PARA QUEBRAR E SAIR DO MÉTODO
	public void adicionar(C c,V v) {
		if(c == null) return;
		
		Par<C,V> novoPar = new Par<C,V>(c,v);
		
		if (itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		itens.add(novoPar); 
	}
	
	public V getValor(C c) {
		if (c == null) return null;
		
		Optional<Par<C,V>>parOp = itens.stream().filter(par -> c.equals(par.getChave())).findFirst();
		
		return parOp.isPresent() ? parOp.get().getValor() : null;
		
	}
	
	public void listar(){
		itens.stream().map(par -> {
		 return "Id: "+par.getChave()+"\n Nome: "+par.getValor();
		}).forEach(System.out::println);
	} 
	
}	
