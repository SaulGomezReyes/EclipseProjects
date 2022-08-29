
public class Casa {

	private String color;
	private String material;
	private String piso;
	private int cuartos;
	private int banos;
	private double precio;

	public Casa(String color, String material, String piso, int cuartos, int banos, double precio) {
		this.color = color;
		this.material = material;
		this.piso = piso;
		this.cuartos = cuartos;
		this.banos = banos;
		this.precio = precio;
	}

	public Casa() {
	}

	public Casa(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public int getCuartos() {
		return cuartos;
	}

	public void setCuartos(int cuartos) {
		this.cuartos = cuartos;
	}

	public int getBanos() {
		return banos;
	}

	public void setBanos(int banos) {
		this.banos = banos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Casa [color=" + color + ", material=" + material + ", piso=" + piso + ", cuartos=" + cuartos
				+ ", banos=" + banos + ", precio=" + precio + "]";
	}

}
