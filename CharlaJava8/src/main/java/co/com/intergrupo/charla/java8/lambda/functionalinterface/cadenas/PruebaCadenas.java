package co.com.intergrupo.charla.java8.lambda.functionalinterface.cadenas;

public class PruebaCadenas {

	public static void main(String[] args) {
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
	
	public static Mayuscula dejarLaCadenaComoEsta() {
		return (cadena) -> cadena;
	}
	
}
