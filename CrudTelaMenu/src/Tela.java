
public class Tela {

	private String tipo;
	private String color;
	private String textura;
	private int metros;
	private double precio;

	public Tela() {
	}

	public Tela(String tipo) {
		this.tipo = tipo;
	}

	public Tela(String tipo, String color, String textura, int metros, double precio) {
		this.tipo = tipo;
		this.color = color;
		this.textura = textura;
		this.metros = metros;
		this.precio = precio;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTextura() {
		return textura;
	}

	public void setTextura(String textura) {
		this.textura = textura;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Tela [tipo=" + tipo + ", color=" + color + ", textura=" + textura + ", metros=" + metros + ", precio="
				+ precio + "]";
	}

}
