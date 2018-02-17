package co.com.intergrupo.charla.java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Asus
 * 
 */
public class IntegersLambda {

	public static void main(String[] args) {
		//recorrerListaEnteros();
		multiplicarListaEnteros();
	}

	/**
	 * El metodo forEach acepta una funcion como entrada y llama a la funcion por cada elemento de la lista
	 * la expresion lambda enviada en el forEach es una funcion anonima que recibe un dato tipo entero como parametro
	 */
	private static void recorrerListaEnteros() {
		List<Integer> listaEnteros = Arrays.asList(7,8,9,5,2,4);
		listaEnteros.forEach(entero -> System.out.println(entero));
	}

	private static void multiplicarListaEnteros() {
		List<Integer> listaEnteros = Arrays.asList(1,2,3,4,5,6);
		listaEnteros.forEach(entero -> {entero *= entero; System.out.println(entero);});
	}
	
}
