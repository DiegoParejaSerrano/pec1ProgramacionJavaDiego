package edu.ucjc.programacion.pec1.DiegoParejaSerrano;

public class Profesor {
 //Declaramos las variables que son los datos del profesor
	
	String nombreProfesor;
	String apellidosProfesor;
	String dniProfesor;
	String asignatura;
	
//Generamos el constructor de la clase Profesor	
	
	public Profesor(String nombre, String apellidos, String dni, String asignatura) {
		super();
		nombreProfesor = nombre;
		apellidosProfesor = apellidos;
		dniProfesor = dni;
		asignatura = asignatura;
	}

//Realizamos  los métodos GetySet 
	public String getNombreProfesor() {
		return nombreProfesor;
	}



	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}



	public String getApellidosProfesor() {
		return apellidosProfesor;
	}



	public void setApellidosProfesor(String apellidosProfesor) {
		this.apellidosProfesor = apellidosProfesor;
	}



	public String getDniProfesor() {
		return dniProfesor;
	}



	public void setDniProfesor(String dniProfesor) {
		this.dniProfesor = dniProfesor;
	}



	public String getAsignatura() {
		return asignatura;
	}



	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	


	

	
}
