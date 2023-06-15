package dado;

import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class Dado {

	private int qtdDados;
	private int lados;

	Dado(int qtdDados, int lados) {

		this.qtdDados = qtdDados;
		this.lados = lados;
	}

	public int getQtdDados() {
		return qtdDados;
	}

	public void setQtdDados(int qtdDados) {
		this.qtdDados = qtdDados;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public static void play(List<Dado> dados) {

		Function<Dado, Object[]> sort = d -> {

			Object values[] = new Object[(d.qtdDados + 1)];
			values[0] = values.length - 1 + "x (D" + d.getLados() + ")";

			try {

				for (int i = 1; i < values.length; i++) {

					Random ran = new Random();
					values[i] = ran.nextInt(d.lados);

				}
				return values;

			} catch (Exception e) {
				return null;
			}
		};

		dados.stream().map(sort).forEach(p -> {

			System.out.println("\n"+p[0]);
			for (int i = 1; i < p.length; i++) {
				System.out.printf(" %d: <%d> \n", i, p[i]);
			}

		});

	}

}
