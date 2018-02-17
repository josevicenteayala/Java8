package co.com.intergrupo.charla.java8.lambda.functionalinterface;

public class Mango implements Fruta, Precio{

	@Override
	public Double valorProducto() {
		return 50d;
	}

	@Override
	public String tipoFruta() {
		return CLASIFICACIONFRUTA.TROPICAL.name();
	}

	
	
}
