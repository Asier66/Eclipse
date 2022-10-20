package com.flota.dominio;

public class Pajaro implements Volable{

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("Despego desde lo alto");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("Aterrizo como un pajaro");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Vuelo batiendo las alas");
	}

}
