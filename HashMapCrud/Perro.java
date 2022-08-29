
public class Perro {

	private String nombre;
	private String raza;
	private int edad;

	public Perro(String nombre, String raza, int edad) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}

	public Perro() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + "] \n";
	}

}
