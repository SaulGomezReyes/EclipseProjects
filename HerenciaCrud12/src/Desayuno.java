
public class Desayuno {

	String nombreD;
	double precio;
	int porcion;
	
	public Desayuno(String nombreD) {
		this.nombreD = nombreD;
	}
	public Desayuno() {
	}
	public Desayuno(String nombreD, double precio, int porcion) {
		this.nombreD = nombreD;
		this.precio = precio;
		this.porcion = porcion;
	}
	public String getNombreD() {
		return nombreD;
	}
	public void setNombreD(String nombreD) {
		this.nombreD = nombreD;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getPorcion() {
		return porcion;
	}
	public void setPorcion(int porcion) {
		this.porcion = porcion;
	}
	@Override
	public String toString() {
		return "Desayuno [nombreD=" + nombreD + ", precio=" + precio + ", porcion=" + porcion + "]";
	}
	
	
}
