package co.com.intergrupo.charla.java8.lambda.defaultmodify;

public class PruebaFrutas {

	public static void main(String[] args) {
		Aguacate aguacate = new Aguacate();
		System.out.println("El Aguacate se cultiva en: "+aguacate.regionDondeSeCultiva());
		System.out.println("Propiedades: "+aguacate.obtenerPropiedades());
	}

}
