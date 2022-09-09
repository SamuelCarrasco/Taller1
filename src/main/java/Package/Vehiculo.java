package Package;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int año;
	private String color;
	private motor motor;
	private Chasis chasis;

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return this.año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Vehiculo(String marca, String modelo, int año, String color) {
		throw new UnsupportedOperationException();
	}
}