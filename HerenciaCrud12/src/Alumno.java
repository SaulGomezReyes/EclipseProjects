
public class Alumno {

	String nombre;
	String apellido;
	int edad;
	Desayuno desayuno;

	public Alumno() {
	}

	public Alumno(String nombre, String apellido, int edad, Desayuno desayuno) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.desayuno = desayuno;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", desayuno=" + desayuno
				+ "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Desayuno getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(Desayuno desayuno) {
		this.desayuno = desayuno;
	}

}
