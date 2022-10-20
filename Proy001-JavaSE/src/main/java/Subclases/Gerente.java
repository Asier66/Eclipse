package Subclases;

import java.sql.Date;

public class Gerente extends Empleado {
	
	private static final double SALARIO_BASE = 15.000;
	
	private String departamento;
	
	public String nombre = "";
	public double salario;
	public Date fechaNacimiento;
	
	public Gerente(String nombre, double salario, Date fechaNacimiento) {
		super(nombre, salario, fechaNacimiento);
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}



	public String getDetails() {
		return nombre;
	}
	
	
	
	public String getDepartamento() {
		return departamento;
	}
	
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return super.getNombre();
	}
	
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}
	
	

}

class Director extends Gerente{
	public Director(String nombre, double salario, Date fechaNacimiento) {
		super(nombre, salario, fechaNacimiento);
		// TODO Auto-generated constructor stub
	}

	public double VehiculoEmpresa() {
		return 0;
	}
	
	public void aumentarComision() {
		
	}
}
