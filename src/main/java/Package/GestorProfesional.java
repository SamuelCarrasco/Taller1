package Package;

import java.util.ArrayList;
import java.util.List;

public class GestorProfesional {
    //Agregar profesores y medicos
    //agregar un vehículo a una persona en particular.
    //obtener a todas los médicos que contengan un automóvil de una marca en específico
    //obtener a todas los profesores que contengan un automóvil de una marca en específico.


    //Asociar persona con vehiculo

    private ArrayList<Persona> personas = new ArrayList<Persona>();
    private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();



    public Persona agregarVehiculoPersona(Vehiculo vehiculo){
        this.personas.addAll(vehiculos);

    }

    public Persona agregarProfesor(Profesor profesor) {
        this.personas.add(profesor);
        return profesor;
    }
    public Medico agregarMedicos(Medico medico) {
        this.personas.add(medico);
        return medico;
    }

    public List<Profesor> obtenerProfesorVehiculo( Vehiculo vehiculo ){
     List<Profesor> profesores = new ArrayList<Profesor>();
        for (Persona persona: vehiculo.getMarca("Nissan")) {
            

        }
    }

}
