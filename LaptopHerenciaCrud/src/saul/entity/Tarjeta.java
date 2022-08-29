package saul.entity;

public class Tarjeta {
	private String fabricante;
	private String tipoMemoria;
	private int memoria;

	public Tarjeta() {
	}

	public Tarjeta(String fabricante) {
		this.fabricante = fabricante;
	}

	public Tarjeta(String fabricante, String tipoMemoria, int memoria) {
		this.fabricante = fabricante;
		this.tipoMemoria = tipoMemoria;
		this.memoria = memoria;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getTipoMemoria() {
		return tipoMemoria;
	}

	public void setTipoMemoria(String tipoMemoria) {
		this.tipoMemoria = tipoMemoria;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	@Override
	public String toString() {
		return "Tarjeta [fabricante=" + fabricante + ", tipoMemoria=" + tipoMemoria + ", memoria=" + memoria + "]";
	}

}
