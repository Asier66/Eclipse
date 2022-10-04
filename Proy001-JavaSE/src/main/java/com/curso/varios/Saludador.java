package com.curso.varios;

public class Saludador {

	// atributos
	private String saludo;

	// constructores
	public Saludador()
	{
		super();
		this.saludo = saludo = "Hola";
	}
	// public void Saludador () {} //OJO esto es un metodo
	public Saludador(String saludo) {
		this.saludo = saludo;
	}

	// metodos
	public String saluda(String nombreUsuario) {
		return this.saludo + nombreUsuario;
	}

	// sobrecargar metodo

	public String saluda() {
		return this.saludo + " Amigo";
	}

}
