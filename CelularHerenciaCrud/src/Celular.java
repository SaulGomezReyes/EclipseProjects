
public class Celular {

	private String modelo;
	private int precio;
	private int ram;
	private Marca marca;
	private SistemaOperativo sistemaOp;

	public Celular() {
	}

	public Celular(String modelo) {
		this.modelo = modelo;
	}

	public Celular(String modelo, int precio, int ram, Marca marca, SistemaOperativo sistemaOp) {
		this.modelo = modelo;
		this.precio = precio;
		this.ram = ram;
		this.marca = marca;
		this.sistemaOp = sistemaOp;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public SistemaOperativo getSistemaOp() {
		return sistemaOp;
	}

	public void setSistemaOp(SistemaOperativo sistemaOp) {
		this.sistemaOp = sistemaOp;
	}

	@Override
	public String toString() {
		return "Celular [modelo=" + modelo + ", precio=" + precio + ", ram=" + ram + ", marca=" + marca + ", sistemaOp="
				+ sistemaOp + "]";
	}

}
