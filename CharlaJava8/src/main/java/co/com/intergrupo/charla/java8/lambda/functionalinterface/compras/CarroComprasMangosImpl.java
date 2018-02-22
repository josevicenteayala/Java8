package co.com.intergrupo.charla.java8.lambda.functionalinterface.compras;

import java.util.List;
import java.util.Objects;

public class CarroComprasMangosImpl implements CarroCompras<List<Mango>> {

	@Override
	public boolean agregarAlCarro(List<Mango> listaMangos) {
		try {
			Objects.requireNonNull(listaMangos);
			return listaMangos.isEmpty();
		}catch(Exception e) {}
		return true;
	}

}
