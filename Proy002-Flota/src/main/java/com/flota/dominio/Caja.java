package com.flota.dominio;

public class Caja {
	
	private double peso;
	
	public Caja() {
		peso = 100;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso <= 0) {
			throw new RuntimeException("La caja debe pesar");
		}
		this.peso = peso;
	}
	
	
}
