package co.com.intergrupo.charla.java8.lambda.stream;

import java.util.stream.Stream;

public class OrdenCompraService {

	public static Stream<OrdenCompra> getStream() {
		return Stream.of(new OrdenCompra());
	}

}
