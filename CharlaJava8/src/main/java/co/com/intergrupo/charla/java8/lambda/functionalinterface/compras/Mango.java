package co.com.intergrupo.charla.java8.lambda.functionalinterface.compras;

public class Mango implements Fruta, Precio{
	private Double precioOriginal = 50d;
	
	@Override
	public Double valorProducto() {
		return precioOriginal;
	}

	@Override
	public String tipoFruta() {
		return CLASIFICACIONFRUTA.TROPICAL.name();
	}

	@Override
	public Double aumentarPrecio(Double valorAdicional) {
		return precioOriginal += valorAdicional;
	}

	
	
}
