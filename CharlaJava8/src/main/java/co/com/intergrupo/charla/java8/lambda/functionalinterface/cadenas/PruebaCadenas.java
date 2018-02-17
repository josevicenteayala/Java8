package co.com.intergrupo.charla.java8.lambda.functionalinterface.cadenas;

public class PruebaCadenas {

	public static void main(String[] args) {
		//probarManejoMayusculas();
		//pruebaDefaultEnInterface();
		Concatenar concatenarMejorado = new ConcatenarMejoradoImpl();
		concatenarMejorado.ingresarCadena("Esta es la cadena original");
		System.out.println(concatenarMejorado.concatenar(" - Esta es la cadena adicionada"));
	}

	public static void pruebaDefaultEnInterface() {
		Concatenar concatenar = new ConcatenarImpl();
		String cadenaOriginal = concatenar.ingresarCadena("Esta es la cadena Original");
		System.out.println(concatenar.concatenar(cadenaOriginal));
	}

	public static void probarManejoMayusculas() {
		Mayuscula pasarAMayuscula = pasarAMayuscula();
		System.out.println(pasarAMayuscula.convertirAMayuscula("esta cadena ha sido convertida a mayuscula"));
		
		Mayuscula dejarCadenaTalCual = dejarLaCadenaComoEsta();
		System.out.println(dejarCadenaTalCual.convertirAMayuscula("esta cadena ha sido convertida a mayuscula"));
	}

	/**
	 * @return una funcion que convierte una cadena en mayuscula
	 */
	public static Mayuscula pasarAMayuscula() {
		return (cadena) -> cadena.toUpperCase();
	}
	
	/**
	 * @return una funcion que retorna la misma cadena
	 */
	public static Mayuscula dejarLaCadenaComoEsta() {
		return (cadena) -> cadena;
	}
	
}
