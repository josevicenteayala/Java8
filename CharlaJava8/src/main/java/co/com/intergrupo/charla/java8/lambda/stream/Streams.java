package co.com.intergrupo.charla.java8.lambda.stream;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import co.com.intergrupo.charla.java8.lambda.functionalinterface.compras.PruebaDeCompra;

public class Streams {
	private static String directorioDeTrabajo = System.getProperty("user.dir");

	public static void main(String[] args) {
		/*
		  recorrerDirectorio(); System.out.println("***********************");
		  recorrerDirectorioConWalk();
		  lecturaArchivoFuente();
		
		*/
		List<Integer> listaEnteros = Arrays.asList(1,2,3,4,5);
		System.out.println(listaEnteros.stream().count());
		System.out.println(listaEnteros.size());
		
		Optional<Integer> resultado = listaEnteros.stream().min( (x,y) -> x-y );
		System.out.println("El minimo es "+resultado.get());
		
		resultado = listaEnteros.stream().max(Comparator.comparingInt(x -> x));
		System.out.println("El maximo es: "+resultado.get());
		
		Integer reduce = listaEnteros.stream().reduce(0,(x,y) -> x+y);
		System.out.println("La suma es: "+reduce);
		
		Set<Integer> conjuntoEnteros = listaEnteros.stream().collect(Collectors.toSet());
		System.out.println("Conjunto enteros:  "+conjuntoEnteros);
		
		Integer[] arregloEnteros = listaEnteros.stream().toArray(Integer[]::new);
		Arrays.stream(arregloEnteros).forEach(CustomConsumer::imprimir);
		
		resultado = listaEnteros.stream().findFirst();
		System.out.println("El primer elemento es: "+resultado.get());
		
		boolean encontroCoincidencias = listaEnteros.stream().anyMatch(x -> x==3);
		System.out.println("Encontro coincidencias de igualdad: "+encontroCoincidencias);
		
		encontroCoincidencias = listaEnteros.stream().anyMatch(x -> x>3);
		System.out.println("Encontro coincidencias mayores: "+encontroCoincidencias);
		
		resultado = listaEnteros.stream().findAny();
		System.out.println("Encontro cualquiera: "+resultado.get());
	
		/*Stateful Intermediate Operations*/
		
		listaEnteros.stream().filter(x -> x < 4).forEach(CustomConsumer::imprimir);
		
		List<Integer> listaEnterosAumentada = listaEnteros.stream().map(x -> x+1).collect(Collectors.toList());
		listaEnterosAumentada.forEach(CustomConsumer::imprimir);
		
		IntSummaryStatistics intSummaryStatistics = listaEnteros.stream().mapToInt(x -> x).summaryStatistics();
		System.out.println(intSummaryStatistics);
		
		/*Stateful Intermediate Operations*/
		
		listaEnteros.stream().distinct().forEach(CustomConsumer::imprimir);
		
		listaEnteros.stream().limit(2).forEach(System.out::println);
		
		listaEnteros.stream().skip(2).forEach(CustomConsumer::imprimir);
		
		System.out.println("Lista luedo de ordenarse");
		List<Integer> listaEnterosDesordenada = Arrays.asList(8,3,6,1,0,4,9,15);
		listaEnterosDesordenada.stream().sorted().forEach(CustomConsumer::imprimir);
		
		
		/************Otro Ejercicio*******/
		Stream<OrdenCompra> ordenCompraStream = OrdenCompraService.getStream();
		Stream<OrdenCompra> ordenCompraStream2 = OrdenCompraService.getStream();
		OptionalDouble promedio = ordenCompraStream.filter(o -> o.getListaCompras().size()>2).mapToDouble(OrdenCompra::total).average();
		System.out.println("Promedio "+promedio.getAsDouble());
		
		
		OptionalDouble optionalDouble = ordenCompraStream2
				.filter(o -> o.getListaCompras().size()>2)
		.mapToDouble(o -> o.getListaCompras().stream().mapToInt(
				item -> item.getCantidad()*100).sum()).average();
		
		System.out.println("El promedio es: "+optionalDouble);
	}

	public static String imprimir(String cadena) {
		System.out.println("valor a imprimir: "+cadena);
		return cadena;
	}
	public static void lecturaArchivoFuente() {
		Path directorio = obtenerPath(directorioDeTrabajo);

		String classFileName = PruebaDeCompra.class.getName().replace('.', '/') + ".java";
		System.out.println(classFileName);
		int profundidadBusqueda = 12;

		try {
			Files.find(directorio, profundidadBusqueda, (filename, attributes) -> filename.endsWith(classFileName))
					.forEach(path -> {
						try {
							Files.lines(directorio).forEach(System.out::println);
						} catch (Exception e) {
							e.printStackTrace();
						}
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void recorrerDirectorioConWalk() {
		Path directorio = obtenerPath(directorioDeTrabajo);
		try {
			Files.walk(directorio).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void recorrerDirectorio() {
		Path directorio = obtenerPath(directorioDeTrabajo);
		try {
			Files.list(directorio).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static Path obtenerPath(String directorioDeTrabajo) {
		Path directorio = FileSystems.getDefault().getPath(directorioDeTrabajo);
		return directorio;
	}

}