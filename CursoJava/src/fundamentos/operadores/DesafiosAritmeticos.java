package fundamentos.operadores;

public class DesafiosAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fraction01 = ((int)Math.pow(6*(3+2),2))/(3*2);
		int fraction02 = ((int)Math.pow(((1-5)*(2-7))/2,2));
		int fraction03 = ((int)Math.pow((fraction01 - fraction02),3)/(int)Math.pow(10,3));
		
		System.out.print(fraction03);
		
	}

}
