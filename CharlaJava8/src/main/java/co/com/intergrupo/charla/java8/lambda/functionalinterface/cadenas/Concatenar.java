package co.com.intergrupo.charla.java8.lambda.functionalinterface.cadenas;

@FunctionalInterface
public interface Concatenar {

	String ingresarCadena(String cadenaOriginal);
	
	default String concatenar(String cadenaAConcatenar) {
		return cadenaAConcatenar+" + Cadena adicionada";
	}
}
