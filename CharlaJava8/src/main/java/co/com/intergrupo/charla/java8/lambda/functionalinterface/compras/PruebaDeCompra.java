package co.com.intergrupo.charla.java8.lambda.functionalinterface.compras;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PruebaDeCompra {

	public static void main(String[] args) {		
		PruebaDeCompra pruebaDeCompra = new PruebaDeCompra();
		List<Mango> listaFrutas = pruebaDeCompra.obtenerListaFrutas();
		pruebaDeCompra.agregarFrutasYAumentarPrecioEn20(listaFrutas);
		
		listaFrutas.stream().forEach(mango -> System.out.println(mango.valorProducto()));
	}

	/**
	 * llena una lista de frutas
	 * @return un lista de frutas
	 */
	private List<Mango> obtenerListaFrutas() {
		Mango mangoAzucar = new Mango();
		Mango mangoTommy = new Mango();
		
		List<Mango> listaFrutas = new ArrayList<>();
		listaFrutas.add(mangoAzucar);
		listaFrutas.add(mangoTommy);
		return listaFrutas;
	}

	CarroCompras<List<Mango>> agregarFrutasYAumentarPrecioEn20(List<Mango> listaMangos) {
		Objects.requireNonNull(listaMangos);
	  Double suma = listaMangos.stream().mapToDouble(mango -> mango.aumentarPrecio(20d)).sum();
	  System.out.println("La suma es: "+suma);
	  CarroComprasMangosImpl carroComprasMangosImpl = new CarroComprasMangosImpl();
	  carroComprasMangosImpl.agregarAlCarro(listaMangos);
	  return carroComprasMangosImpl;
	}
}
