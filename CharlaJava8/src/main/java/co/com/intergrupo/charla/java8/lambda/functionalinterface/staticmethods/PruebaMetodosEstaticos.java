package co.com.intergrupo.charla.java8.lambda.functionalinterface.staticmethods;

public class PruebaMetodosEstaticos {

	public static void main(String[] args) {
		System.out.println(InterfaceConMetodosEstaticos.devolverUnaCadena());
		System.out.println(OtraInterfazConElMismoMetodoEstatico.devolverUnaCadena());
		
		System.out.println(ClaseQueUsaLasInterfaces.devolverUnaCadena());
	}

}
