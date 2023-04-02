package edu.ucjc.programacion.pec1.DiegoParejaSerrano;
//Enlace para el repositorio
//https://github.com/DiegoParejaSerrano/pec1ProgramacionJavaDiego.git
public class GestionColegios {
	
	public static void main(String[] args) {
	
	Colegio colegio = new Colegio("Colegio Mulhacén","Calle Mercurio 53",5,10);   // Se crea el objeto colegio que se nos pide con diferentes datos          
	GestionColegios Recibo = new GestionColegios ();   //En la linea 8, 9  y 10 de codigo se crea un abjeto para pasar un metodo dinamico de otra clase al estatico del main de esta clase 
	Alumno  [] alumnosCompletos = UtilsColegio.crearAlumno(Colegio.numAlumnos);
	Recibo.recibirDatos(colegio, alumnosCompletos); //Llamada al metodo 
	
	GestionColegios colocacion = new GestionColegios(); //Creamos otro objeto para hacer que el método dinámico asignarAsiento pueda meterse dentro del estaticó 
	colocacion.asignarAsientos(alumnosCompletos, colegio); //Llamada al método
	
	}	
	


public void recibirDatos(Colegio   arg1, Alumno[]  arg2) { //Creamos un metodo que se encarga de recibir datos y mostrarlos 
																					//Muesta el colegio y los datos de los alumnos
System.out.println(arg1);
System.out.println(arg2);

}
public void asignarAsientos(Alumno [] alumnos, Colegio colegio) { //Creamos un metodo que se encarga de colocar los alumnos en sus respectivos asientos libres 
for (Alumno alumno : alumnos) {
	colegio.ColocarAlumnos(alumnos); //Llamamos al metodo de la clase colegío que es capaz de asignar esos asientos a los alumnos
}
}
}

