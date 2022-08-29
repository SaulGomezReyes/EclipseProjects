package saul.entity;

public class Laptop {

	private String modelo;
	private int discoDuro;
	private int ram;
	private Tarjeta tarjetaGrafica;
	private double precio;

	public Laptop() {
	}

	public Laptop(String modelo) {
		this.modelo = modelo;
	}

	public Laptop(String modelo, int discoDuro, int ram, Tarjeta tarjetaGrafica, double precio) {
		this.modelo = modelo;
		this.discoDuro = discoDuro;
		this.ram = ram;
		this.tarjetaGrafica = tarjetaGrafica;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getDiscoDuro() {
		return discoDuro;
	}

	public void setDiscoDuro(int discoDuro) {
		this.discoDuro = discoDuro;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public Tarjeta getTarjetaGrafica() {
		return tarjetaGrafica;
	}

	public void setTarjetaGrafica(Tarjeta tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Laptop [modelo=" + modelo + ", discoDuro=" + discoDuro + ", ram=" + ram + ", tarjetaGrafica="
				+ tarjetaGrafica + ", precio=" + precio + "]";
	}

}
