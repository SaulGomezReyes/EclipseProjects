
public class SistemaOperativo {

	private String nombre;
	private String tipo;
	private String version;

	public SistemaOperativo() {
	}

	public SistemaOperativo(String nombre) {
		this.nombre = nombre;
	}

	public SistemaOperativo(String nombre, String tipo, String version) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.version = version;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SistemaOperativo [nombre=" + nombre + ", tipo=" + tipo + ", version=" + version + "]";
	}

}
