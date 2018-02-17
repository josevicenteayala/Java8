package co.com.intergrupo.charla.java8.lambda.functionalinterface.compras;

import java.util.List;

public class CarroComprasMangosImpl implements CarroCompras<List<Mango>> {

	private List<Mango> listaMangos;
	
	@Override
	public boolean agregarAlCarro(List<Mango> listaMangos) {
		this.listaMangos = listaMangos;
		return listaMangos.isEmpty();
	}

}
