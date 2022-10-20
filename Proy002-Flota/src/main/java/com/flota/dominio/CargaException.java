package com.flota.dominio;

public class CargaException extends Exception{
	
	private double excesoCarga;
	
	public CargaException(String msj, double excwesoCarga) {
		super(msj);
		this.excesoCarga = excwesoCarga;
	}
	
	public double getExcesoCarga() {
		return excesoCarga;
	}

}
