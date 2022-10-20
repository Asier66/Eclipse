package com.flota.dominio;

import java.util.Date;

public class Avion extends Vehiculo implements Volable, Reservable{

	protected Avion(String matricula, double cargaMaxima) {
		super(matricula, cargaMaxima);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double consumoFuel() {
		// TODO Auto-generated method stub
		return 309.90;
	}

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("Despego por la pista como un avion");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("Aterrizo en la pista como un avion");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Vuelo como un avion de dos motores");
	}
	
	public void reservar(Date fechaReserva) {
		System.out.println("Reservo un vuelo ");
	}

	
}
