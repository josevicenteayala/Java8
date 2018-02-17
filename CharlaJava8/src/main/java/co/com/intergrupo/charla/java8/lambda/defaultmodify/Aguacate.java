package co.com.intergrupo.charla.java8.lambda.defaultmodify;

public class Aguacate implements Fruta, Verdura {

	@Override
	public String obtenerPropiedades() {
		return "{\"color\":\"Verde selva\"}";
	}

	@Override
	public String regionDondeSeCultiva() {
		Fruta.super.regionDondeSeCultiva();
		return "La Ceja Antioquia";
	}

}
