package co.com.intergrupo.charla.java8.lambda.stream;

public class Item {

	private Integer cantidad;
	private String nombre;
	
	public Item() {
		// vacio
	}
	
	public Item(Integer cantidad, String nombre) {
		super();
		this.cantidad = cantidad;
		this.nombre = nombre;
	}




	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
