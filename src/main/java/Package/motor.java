package Package;

public class motor {
	private String numMotor;
	private double cmCubicos;

	public String getNumMotor() {
		return this.numMotor;
	}

	public void setNumMotor(String numMotor) {
		this.numMotor = numMotor;
	}

	public double getCmCubicos() {
		return this.cmCubicos;
	}

	public void setCmCubicos(double cmCubicos) {
		this.cmCubicos = cmCubicos;
	}

	public motor(String numMotor, double cmCubicos) {
		throw new UnsupportedOperationException();
	}
}