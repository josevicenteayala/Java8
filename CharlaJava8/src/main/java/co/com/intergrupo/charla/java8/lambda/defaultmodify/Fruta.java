package co.com.intergrupo.charla.java8.lambda.defaultmodify;

@FunctionalInterface
public interface Fruta {

	String obtenerPropiedades();
	
	default String regionDondeSeCultiva() {
		return "Desconocida";
	}
	

}
