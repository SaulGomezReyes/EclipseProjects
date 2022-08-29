
public class Moto {

	private String modelo;
	private String marca;
	private double precio;
	private int motor;

	public Moto() {
	}

	public Moto(String modelo) {
		this.modelo = modelo;
	}

	public Moto(String modelo, String marca, double precio, int motor) {
		this.modelo = modelo;
		this.marca = marca;
		this.precio = precio;
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Moto [modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + ", motor=" + motor + "]";
	}

}
