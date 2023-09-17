package ejercicioPeliculas;

public class Categorias {
	
	private String nombre;

	public Categorias(String nombre) {
		this.nombre = nombre;
	}
	
	public Categorias() {};

	@Override
	public String toString() {
		return nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}