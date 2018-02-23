package co.com.intergrupo.charla.java8.lambda.functionalinterface;

public class PruebaDefaultIndetificador {

	public static void main(String[] args) {
		UsoInterfaces usoInterfaces = new UsoInterfaces();
		System.out.println(usoInterfaces.metodo());
	}

}

class UsoInterfaces implements PrimeraInterfaz, SegundaInterfaz{
	
	public String metodo1() {
		return "Metodo UsoInterfaces";
	}

	@Override
	public String metodo() {
		String cadenaInicial = PrimeraInterfaz.super.metodo();
		return cadenaInicial+ " Metodo implementado de la PrimeraInterfaz";
	}
}


interface PrimeraInterfaz{
	default String metodo() {
		return "Metodo PrimeraInterfaz";
	}
}

interface SegundaInterfaz{
	default String metodo() {
		return "Metodo PrimeraInterfaz";
	}
}
