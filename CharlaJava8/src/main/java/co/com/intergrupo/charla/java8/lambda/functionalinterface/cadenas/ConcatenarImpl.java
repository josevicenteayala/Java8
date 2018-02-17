package co.com.intergrupo.charla.java8.lambda.functionalinterface.cadenas;

public class ConcatenarImpl implements Concatenar {
	private String cadena;
	
	@Override
	public String ingresarCadena(String cadenaOriginal) {
		cadena = cadenaOriginal;
		return cadena;
	}

}
