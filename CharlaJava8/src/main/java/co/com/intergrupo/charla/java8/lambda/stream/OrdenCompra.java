package co.com.intergrupo.charla.java8.lambda.stream;

import java.util.Arrays;
import java.util.List;

public class OrdenCompra {

	private List<Item> listaCompras;
	
	public static Double total(OrdenCompra ordenCompra) {
		return 20d;
	}

	public List<Item> getListaCompras() {
		Item banano = new Item(10,"Banano");
		Item uva = new Item(100, "Uva");;
		Item mango = new Item(30, "Mango");;
		Item pina = new Item(20, "Piña");
		listaCompras = Arrays.asList(banano,mango,uva,pina);
		return listaCompras;
	}

	public void setListaCompras(List<Item> listaCompras) {
		this.listaCompras = listaCompras;
	}
}
