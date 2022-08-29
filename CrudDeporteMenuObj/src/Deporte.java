
public class Deporte {

	private String nombre;
	private String pais;
	private int años;
	private int jugadores;

	public Deporte(String nombre, String pais, int años, int jugadores) {
		this.nombre = nombre;
		this.pais = pais;
		this.años = años;
		this.jugadores = jugadores;
	}

	public Deporte() {
	}

	public Deporte(String nombre) {
		this.nombre = nombre;
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

	public int getAños() {
		return años;
	}

	public void setAños(int años) {
		this.años = años;
	}

	public int getJugadores() {
		return jugadores;
	}

	public void setJugadores(int jugadores) {
		this.jugadores = jugadores;
	}

	@Override
	public String toString() {
		return "Deporte [nombre=" + nombre + ", pais=" + pais + ", años=" + años + ", jugadores=" + jugadores + "]";
	}

}
