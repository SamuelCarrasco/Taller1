package Package;

public class Medico extends Persona {
	private String especialidad;

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public Medico(String nombre, String apellido, String rut,String especialidad) {
	super(nombre, apellido, rut, especialidad);
	}
}