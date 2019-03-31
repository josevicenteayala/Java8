package co.com.intergrupo.charla.java8.lambda.functionalinterface;

public class PruebaCuadrado {

	public static void main(String[] args) {
		int entero = 10;
		
		Cuadrado cuadrado = (int x)->x*x;
		
		int resultado = cuadrado.calcularCuadrado(entero);
		
		System.out.println(resultado);
	}

}
