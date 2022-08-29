
public class Hijo extends Padre {

	String colorOjos;
	double estatura;

	public Hijo() {

	}

	public Hijo(String nombre, String apelliP, int edad, String colorOjos, double estatura) {
		super(nombre, apelliP, edad);
		this.colorOjos = colorOjos;
		this.estatura = estatura;
	}

	@Override
	public String toString() {
		return "Hijo [colorOjos=" + colorOjos + ", estatura=" + estatura + ", nombre=" + nombre + ", apelliP=" + apelliP
				+ ", edad=" + edad + "]";
	}

	public String getColorOjos() {
		return colorOjos;
	}

	public void setColorOjos(String colorOjos) {
		this.colorOjos = colorOjos;
	}

	public double getEstatura() {
		return estatura;
	}

	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}

}
