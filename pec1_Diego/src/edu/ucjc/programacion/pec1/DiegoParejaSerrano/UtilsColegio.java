package edu.ucjc.programacion.pec1.DiegoParejaSerrano;
import java.util.Scanner;

public class UtilsColegio {



	
	
	public static Alumno[] crearAlumno(int numAlumnos) {  //Creamos un método al cual se le daran los datos de los alumnos por escrito 
		Alumno [] alumnos = new Alumno [Colegio.numAlumnos]; //Creamos un array de alumnos al que se le asignara en cazda posición los datos de cada uno de estos
		for (int i=0; i < Colegio.numAlumnos; i++) { //Generamos bucle para recibir todos los datos de cada alumno
			String nombreAlumnos;
			String apellidosAlumnos;
			String dniAlumnos;
			int notaMediaAlumno;
			System.out.println("Describamos al alumno: ");
			Scanner scan = new Scanner(System.in);
			System.out.println("¿Cual es el nombre del alumno? ");
			nombreAlumnos = scan.nextLine();
			
			System.out.println("¿Cuales son sus apellidos?");
			apellidosAlumnos = scan.nextLine();
			
			System.out.println("¿Cual es su dni? ");
			dniAlumnos = scan.nextLine();
			
			System.out.println("¿Cual es su nota Media?");
			notaMediaAlumno = scan.nextInt();
			
			Colegio.numAlumnos -=1;
			Alumno tempoalumnos = new Alumno(nombreAlumnos,apellidosAlumnos,dniAlumnos,notaMediaAlumno); //Se crea abjeto con los datos para meterlo posteriormente en el array de ALUMNOS
			 alumnos [i] = tempoalumnos;
		
			
			 scan.close();
			
	}
		
		return alumnos;
		
	
	}

public	static  Profesor[] crearProfesor() {  //Creación de método para pasar los datos de los profesores 
	int contadorAulas = Colegio.numAulas;
	int j=0;
	Profesor [] profesores = new Profesor [contadorAulas]; // Generamos el array de profesores àra que se guarden sus datos aquí
	while (contadorAulas >0) { //Pro variar puse un bluce while que recorriese todas las aulas ya que por cada aula hay un profesor 
		String NombreProfesors;
		String apellidosProfesors;
		String dniProfesors;
		String asignatura;
		
		Scanner atributosProfesor  = new Scanner (System.in);
		
		System.out.println("¿Cual es el nombre del profesor?: ");
		NombreProfesors = atributosProfesor.nextLine();
		
		System.out.println("¿Cuales son los apellidos del profesor del aula " + Colegio.numAulas + " ?: ");
		apellidosProfesors = atributosProfesor.nextLine();
		
		System.out.println("¿ Cual es el Dni del profesor?: ");
		dniProfesors = atributosProfesor.nextLine();
		
		System.out.println("¿Cual es su asignatura?: ");
		asignatura = atributosProfesor.nextLine();
		
		Profesor profesor = new Profesor (NombreProfesors, apellidosProfesors, dniProfesors, asignatura); //Creamos objeto con los atributos del profesor que posteriormente se guardara en el array de profesores
		profesores [j] = profesor;
		contadorAulas-= 1;
		j++;
		
		
		
		
}
	return profesores;

}}
