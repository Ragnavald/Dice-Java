package systensGame;

import java.util.function.Function;
import java.util.function.Predicate;

public class InventarioTest {

	public static void main(String[] args) {

		Player p1 = new Player("Pichu",65.2,130,new Inventario());
		p1.addInv(new contItem(new Item("Cinto", 0.2, Item.comum()),1));
		p1.addInv(new contItem(new Item("Espada", 1.2, Item.epico()),1));
		p1.addInv(new contItem(new Item("Adaga", 0.9, Item.lendario()),2));
		p1.addInv(new contItem(new Item("Armadura", 5, Item.epico()),1));
		
		Function<contItem, String> chestList = o -> "Item: "+o.getItem().getNome()+"\nPeso: "+o.getItem().getPeso()+
				"\nProbabilidade: "+ o.getItem().getProb()+"\n";
		
		Predicate<contItem> isEpico = o -> o.getItem().getProb() == Item.epico();
		
		p1.getInv().getInventario().stream().map(chestList).forEach(System.out::println);
		p1.getInv().getInventario().stream().filter(isEpico).map(chestList).forEach(System.out::println);
		
		System.out.println("Peso Atual: "+p1.getPesoTotal());
		
		
	}	
	
}
