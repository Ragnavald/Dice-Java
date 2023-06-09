package Classes;

public class Data {

	int dia;
	int mes;
	int ano;
	
	
	Data(){
		
	this(1,1,1970);
		
	}
	
	Data(int dia, int mes, int ano){
	
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	String dataFormat(){
		final String formato = "%d/%d/%d"; // variável Local do método dataFormat()
		return String.format(formato,dia,mes,ano);
		
	}
	
	static void voltarDataPadrao(Data d) {
		
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
	}
	
}
