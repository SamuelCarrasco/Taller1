package Package;

import java.util.ArrayList;

public class Persona {
	private String nombre;
	private String apellido;
	private String rut;
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRut() {
		return this.rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public Persona(String nombre, String apellido, String rut, String disciplinaEnseña) {
		this.nombre=nombre;
		this.rut=rut;
		this.apellido=apellido;

	}
	public Vehiculo asociarVehiculo(Vehiculo vehiculo){
		this.vehiculos.add(vehiculo);
		return vehiculo;
	}

	//asociar vehiculo a persona

}