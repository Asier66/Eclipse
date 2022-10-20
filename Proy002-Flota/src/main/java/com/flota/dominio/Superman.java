package com.flota.dominio;

public class Superman implements Volable{

	@Override
	public void despegar() {
		// TODO Auto-generated method stub
		System.out.println("Salto para despegar");
	}

	@Override
	public void aterrizar() {
		// TODO Auto-generated method stub
		System.out.println("Aterrizo");
	}

	@Override
	public void volar() {
		// TODO Auto-generated method stub
		System.out.println("Vuelo volando");
	}

}
