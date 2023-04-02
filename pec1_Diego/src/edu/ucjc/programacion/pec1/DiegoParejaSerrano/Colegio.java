package edu.ucjc.programacion.pec1.DiegoParejaSerrano;





public class Colegio {
	
	//	Declaramos las variables de la clase Colegio
	String nombreColegio;
	String direccionColegio;
	 public static int numAulas=3;
	Aula [] aulas = new Aula[numAulas];
	Alumno alumno;

	 public static int numAlumnos=10 ; 
	
	//Creamos el contructor
	public Colegio(String nombre, String direccion, Aula[] aulas, Alumno alumno, int numAlumno) {
		super();
		nombreColegio = nombre;
		direccionColegio = direccion;
		this.aulas = aulas;
		this.alumno = alumno;
	
	}



public Colegio(String string, String string2, int i, int j) { //Creamos segundo constructor para poder generar el objeto colegio en gestion de colegios con los datos que nos piden 
	
	}













public String getNombreColegio() {
		return nombreColegio;
	}


	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}



	public String getDireccionColegio() {
		return direccionColegio;
	}



	public void setDireccionColegio(String direccionColegio) {
		this.direccionColegio = direccionColegio;
	}




	public static int getNumAulas() {
		return numAulas;
	}




	public static void setNumAulas(int numAulas) {
		Colegio.numAulas = numAulas;
	}


	public Aula[] getAulas() {
		return aulas;
	}



	public void setAulas(Aula[] aulas) {
		this.aulas = aulas;
	}



	public Alumno getAlumno() {
		return alumno;
	}



	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}



	public static int getNumAlumnos() {
		return numAlumnos;
	}




	public static void setNumAlumnos(int numAlumnos) {
		Colegio.numAlumnos = numAlumnos;
	}




//Creamos un metodo que es capaz de colocar los alumnos en los asientos libres que van quedando en las diferentes aulas
public void ColocarAlumnos(Alumno [] asientos) { 
for (Alumno aula : asientos) { //Generamos un foreach para recorrer todas las aulas
	for (int x = 0 ;  x < aulas.length ; x++){ //Feneramos un for para establecer la condicion de que vaya pasando por cada clase e incrementando en el array
		if (x < numAulas) { //Solo he puesto este if qie es igual que el for anterior la condicion para poner el ultimo else
			
		
	
	for (Alumno alumno : asientos) { //Ponemos otro bucle foreach para que por cada aula recorra el array de asientos que hay en esa aula
		for (int i = 0 ; i<asientos.length;i++ ) { //Bucle for para hacer que se vaya pasando por cada asiento 
			if(asientos [i] == null) { //Condicion para agregar cada alumno al asiento si este esta libre
				asientos [i] = alumno;
		
		System.out.println("El alumno " + alumno.getNombreAlumno() + "con Dni " + alumno.getDni() + "se ha sentado en la posición " +   i  + "en la aula " + aulas[x]  ) ;
		}
		
	}
}

	
	
}
		else {
			System.out.println("El alumno de nombre " + alumno.getNombreAlumno() + " con Dni " + alumno.getDni() +  " no tiene sitio en el colegío");
		}
}	
} 
}



}

 





	


