package dado;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Comando {

	public static List<Dado> executar(String text) {
		List<Dado> dados = new ArrayList<>();
		Pattern pattern = Pattern.compile("/d(\\d+)-(\\d+)");
		Matcher matcher = pattern.matcher(text);

		try {
			while (matcher.find()) {
				Dado d = new Dado(Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(1)));
				dados.add(d);
			}

			return dados;

		} catch (Exception e) {
			return null;
		}

	}
	
	

}
