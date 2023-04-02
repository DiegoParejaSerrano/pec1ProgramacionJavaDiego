package edu.ucjc.programacion.pec1.DiegoParejaSerrano;

public class Aula  {

	//Declaramos las variables que se van a utilizar en la clase Aula 
	int numeroAula;
	int plantaAula;
	
	Alumno [] asientos;
	Profesor profesor;
	// Generamos el cosntrutor de la clase
	public Aula(int numero, int planta, int numAsientos, Alumno[] asientos, Profesor profesor) {
		super();
		numeroAula = numero;
		plantaAula = planta;
		
		this.asientos = asientos;
		this.profesor = profesor;
	}
	
	//Creamos los métodos GetySet
	public int getNumeroAula() {
		return numeroAula;
	}
	public void setNumeroAula(int numeroAula) {
		this.numeroAula = numeroAula;
	}
	public int getPlantaAula() {
		return plantaAula;
	}
	public void setPlantaAula(int plantaAula) {
		this.plantaAula = plantaAula;
	}
	public Alumno[] getAsientos() {
		return asientos;
	}
	public void setAsientos(Alumno[] asientos) {
		this.asientos = asientos;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}