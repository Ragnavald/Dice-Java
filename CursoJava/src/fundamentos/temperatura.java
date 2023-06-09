package fundamentos;

public class temperatura {
public static void main(String[] args) {
	
	double celsius = 30;
	double fahrenheit;
	//celsius para fahrenheit
	fahrenheit = ((9*celsius) + 160)/5;
	System.out.println("Sua temperatura de 30,5° Celsius equivale a: "+fahrenheit+" graus Fahrenheint");
	//concluído
	// fahrenheit para celsius
	celsius = 0;
	fahrenheit = 100;
	celsius = ((5* fahrenheit) - 160)/9;
	System.out.println("Sua temperatura de 100,6° Fahrenheint equivale a: "+celsius+" graus Celsius");
}
}
