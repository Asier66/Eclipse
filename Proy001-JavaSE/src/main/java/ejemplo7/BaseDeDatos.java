package ejemplo7;

import java.util.*;

public class BaseDeDatos {
	
	private static Map<Integer, Alumno> tablaAlumnos;
	
	static {
		tablaAlumnos = new HashMap();
	}
	
	public static Alumno getAlumnoById(int id) {
		return tablaAlumnos.get(id);
	}
	
	public static void addAlumno(Alumno a) {
		tablaAlumnos.put(a.getId(), a);
	}
	
	public static void grabarBD() {
		Collection<Alumno>alumnos = tablaAlumnos.values();
		for(Alumno a : alumnos) {
			System.out.println(" inserto en bd " + a);
		}
	}
}

class Alumno{
	private Integer id;
	private String nombre;
	
	public Alumno(Integer id, String nombre) {
		this.id = id;
		this.nombre=nombre;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
}