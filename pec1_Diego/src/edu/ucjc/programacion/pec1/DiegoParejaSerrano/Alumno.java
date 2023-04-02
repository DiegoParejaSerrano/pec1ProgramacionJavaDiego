package edu.ucjc.programacion.pec1.DiegoParejaSerrano;

public class Alumno {
	
	//Declaramos las variables que son los datos del alumno
	String nombreAlumno; 
	String apellidosAlumno;
	String dni;
	int notaMedia;
	
	//Creamos en constructor de la clase Alumno
	public Alumno(String nombre, String apellidos, String dni, int notaMedia) {
		super();
		nombreAlumno = nombre;
		apellidosAlumno = apellidos;
		dni = dni;
		notaMedia = notaMedia;
	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public String getApellidosAlumno() {
		return apellidosAlumno;
	}

	public void setApellidosAlumno(String apellidosAlumno) {
		this.apellidosAlumno = apellidosAlumno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(int notaMedia) {
		this.notaMedia = notaMedia;
	}



//Generamos los métodos GetySet
	
	
	
}
