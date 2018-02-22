package co.com.intergrupo.charla.java8.lambda;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
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
		
		List<Integer> listaEnteros = Arrays.asList(1,2,3,4,5);
		Instant instant1 = Instant.now();
		System.out.println(instant1);
		int sumaEnteros = listaEnteros.stream().reduce(0, (x,y) ->x+y);
		Instant instant2 = Instant.now();
		System.out.println(instant2);
		long diferenciaEnMilisegundos = ChronoUnit.MILLIS.between(instant1, instant2);
		System.out.println("Suma de enteros "+sumaEnteros+" diferenciaEnMilisegundos "+diferenciaEnMilisegundos);
		
		
		Instant instant3 = Instant.now();
		sumaEnteros = listaEnteros.stream().parallel().reduce(0, (x,y) ->x+y);
		Instant instant4 = Instant.now();
		long diferenciaEnMilisegundos2 = ChronoUnit.MILLIS.between(instant3, instant4);
		System.out.println("Suma de enteros "+sumaEnteros+" diferenciaEnMilisegundos "+diferenciaEnMilisegundos2);
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
