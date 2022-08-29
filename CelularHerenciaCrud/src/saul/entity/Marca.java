package saul.entity;

public class Marca {

	private String nombre;
	private String pais;
	private int anios;

	public Marca() {
	}

	public Marca(String nombre) {
		this.nombre = nombre;
	}

	public Marca(String nombre, String pais, int anios) {
		this.nombre = nombre;
		this.pais = pais;
		this.anios = anios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getAnios() {
		return anios;
	}

	public void setAnios(int anios) {
		this.anios = anios;
	}

	@Override
	public String toString() {
		return "Marca [nombre=" + nombre + ", pais=" + pais + ", anios=" + anios + "]";
	}

}
