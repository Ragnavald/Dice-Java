package systensGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Inventario {
	
	private final List<contItem> inventario = new ArrayList<>();

	public List<contItem> getInventario() {
		return inventario;
	}
	
	public double getPesoInv() {
		double peso = 0;
		for(contItem item: inventario) {
			peso+= item.getItem().getPeso() * item.getQtd();
		}
		return peso;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(inventario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Inventario other = (Inventario) obj;
		return Objects.equals(inventario, other.inventario);
	}


}
