package Logica;

import java.sql.Date;
import java.util.HashSet;


public class Docente extends Usuario{

	public Docente(String ci, String contraseņa, String nombre, String apellido, String mail, Date fecha) {
		super(ci, contraseņa, nombre, apellido, mail, fecha);
	}

	//relaciones
	HashSet<Materia>Materias = new HashSet<Materia>();
	
	
}
