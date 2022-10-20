package Subclases;

import java.sql.Date;

public class PruebaEmpleados {

	public static void main(String[] args) {
		 Empleado e = new Empleado(null, 0, null);
		 e.setNombre("Luis Ramos");
		 e.setSalario(40.000);
		 
		 Gerente g = new Gerente(null, 0, null);
		 g.setNombre("Luis Ramos");
		 g.setDepartamento("Desarrollo");
		 g.setSalario(70.000);
		 
		 System.out.println("g es un gerente? " + (g instanceof Gerente));
		 
		 System.out.println("e es un empleado? " + (e instanceof Empleado));
		 
		 System.out.println("e es un gerente? " + (e instanceof Gerente));
		 
		 Administrativo a = new Administrativo(null, 0, null);
		 a.setNombre("Roberto");
		 a.setSalario(50.000);
		 
		 Empleado Mario = new Empleado("Mario", 43.000, null);
	}
	
	
}
