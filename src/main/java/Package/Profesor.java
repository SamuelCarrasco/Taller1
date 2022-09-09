package Package;

public class Profesor extends Persona {
	private String disciplinaEnseña;

	public String getDisciplinaEnseña() {
		return this.disciplinaEnseña;
	}

	public void setDisciplinaEnseña(String disciplinaEnseña) {
		this.disciplinaEnseña = disciplinaEnseña;
	}

	public Profesor(String nombre, String apellido, String rut, String disciplinaEnseña ) {
		super(nombre,apellido, rut, disciplinaEnseña );

		}


}