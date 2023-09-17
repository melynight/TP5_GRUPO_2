package ejercicioPeliculas;

public class Peliculas {

	private static int idAutomatico=1;
	
	private int id;
	private String nombre;
	private Categorias categoria;
	

	public Peliculas() {
		
		idAutomatico++;
	};
	
	public Peliculas(String nombre, Categorias categoria) {
		this.id = idAutomatico;
		this.nombre = nombre;
		this.categoria = categoria;
		
		idAutomatico++;
	}
	
	
	@Override
	public String toString() {
		return id + "- " + nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
}
