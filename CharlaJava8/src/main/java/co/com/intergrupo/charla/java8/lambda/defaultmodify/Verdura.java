package co.com.intergrupo.charla.java8.lambda.defaultmodify;

@FunctionalInterface
public interface Verdura {
	
	String obtenerPropiedades();
	
	default String regionDondeSeCultiva() {
		return "Desconocida";
	}
}
