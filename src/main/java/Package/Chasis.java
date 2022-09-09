package Package;

public class Chasis {
	private int numChasis;
	private String tipoMaterial;

	public int getNumChasis() {
		return this.numChasis;
	}

	public void setNumChasis(int numChasis) {
		this.numChasis = numChasis;
	}

	public String getTipoMaterial() {
		return this.tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	public Chasis(int numChasis, String tipoMaterial) {
		throw new UnsupportedOperationException();
	}
}