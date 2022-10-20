package Subclases;

import java.sql.Date;

public class Empleado {

	public String nombre = "";
	public double salario;
	public Date fechaNacimiento;
	
	private static final double SALARIO_BASE = 15.000;
	
	public Empleado(String nombre, double Salario, Date FechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.salario = Salario;
		this.fechaNacimiento = FechaDeNacimiento;
	}
	
	public Empleado(String nombre, double Salario) {
		this(nombre,Salario,null);
	}
	
	public Empleado(String nombre) {
		this(nombre, SALARIO_BASE);
	}
	
	public String getDetails() {
		return nombre + "tiene salario" + salario;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
}

class Ingeniero extends Empleado{

	public Ingeniero(String nombre, double Salario, Date FechaDeNacimiento) {
		super(nombre, Salario, FechaDeNacimiento);
		// TODO Auto-generated constructor stub
	}
	
}

class Secretario extends Empleado{

	public Secretario(String nombre, double Salario, Date FechaDeNacimiento) {
		super(nombre, Salario, FechaDeNacimiento);
		// TODO Auto-generated constructor stub
	}
	
}
