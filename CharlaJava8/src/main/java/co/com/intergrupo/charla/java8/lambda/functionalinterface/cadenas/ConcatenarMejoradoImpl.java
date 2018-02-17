package co.com.intergrupo.charla.java8.lambda.functionalinterface.cadenas;

public class ConcatenarMejoradoImpl implements Concatenar {
	
	private String cadena; 
	
	@Override
	public String ingresarCadena(String cadenaOriginal) {
		cadena = cadenaOriginal;
		return cadena;
	}
	
	@Override
	public String concatenar(String cadenaAConcatenar) {
		return cadena += cadenaAConcatenar;
	}

}
