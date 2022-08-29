
public class Taco {

	private String nombre;
	private String sabor;
	private double precio;
	private String tipoSalasa;

	public Taco(String nombre, String sabor, double precio, String tipoSalasa) {
		this.nombre = nombre;
		this.sabor = sabor;
		this.precio = precio;
		this.tipoSalasa = tipoSalasa;
	}

	public Taco() {
	}

	public Taco(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getTipoSalasa() {
		return tipoSalasa;
	}

	public void setTipoSalasa(String tipoSalasa) {
		this.tipoSalasa = tipoSalasa;
	}

	@Override
	public String toString() {
		return "Taco [nombre=" + nombre + ", sabor=" + sabor + ", precio=" + precio + ", tipoSalasa=" + tipoSalasa
				+ "]";
	}

}
