package co.com.intergrupo.charla.java8.lambda.functionalinterface;

import java.util.ArrayList;
import java.util.List;

public class PruebaDeCompra {

	public static void main(String[] args) {		
		PruebaDeCompra pruebaDeCompra = new PruebaDeCompra();
		CarroCompras<List<Fruta>> carroFrutas = new CarroCompras<List<Fruta>>() {
			
			@Override
			public boolean agregarAlCarro(List<Fruta> a) {
				return false;
			}
		};
		pruebaDeCompra.agregarFrutas(carroFrutas );
	}

	/**
	 * llena una lista de frutas
	 * @return un lista de frutas
	 */
	private List<Fruta> obtenerListaFrutas() {
		Fruta mangoAzucar = new Mango();
		Fruta mangoTommy = new Mango();
		
		List<Fruta> listaFrutas = new ArrayList<>();
		listaFrutas.add(mangoAzucar);
		listaFrutas.add(mangoTommy);
		return listaFrutas;
	}

	void agregarFrutas(CarroCompras<List<Fruta>> carroFrutas) {
		boolean resultadoAdicion = carroFrutas.agregarAlCarro(obtenerListaFrutas());
		System.out.println("resultado de la adicion: "+resultadoAdicion);
		
		
	}
}
