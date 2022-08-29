
public class Padre {

	String nombre;
	String apelliP;
	int edad;

	public Padre(String nombre, String apelliP, int edad) {
		this.nombre = nombre;
		this.apelliP = apelliP;
		this.edad = edad;
	}

	public Padre() {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelliP() {
		return apelliP;
	}

	public void setApelliP(String apelliP) {
		this.apelliP = apelliP;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", apelliP=" + apelliP + ", edad=" + edad + "]";
	}

}
