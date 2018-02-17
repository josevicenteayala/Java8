package co.com.intergrupo.charla.java8.lambda.stream;

import java.util.function.Consumer;

public class CustomConsumer<T> implements Consumer<T> {

	@Override
	public void accept(T arg0) {
		System.out.println(arg0);
	}

	public static void imprimir(Integer entero) {
		System.out.println("valor a imprimir: "+entero);
	}
}
