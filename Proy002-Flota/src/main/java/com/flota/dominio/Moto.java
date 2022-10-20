package com.flota.dominio;

public class Moto extends Vehiculo{

	public Moto(String matricula, double cargaMaxima) {
		super(matricula, cargaMaxima);
		
	}

	@Override
	public double consumoFuel() {
		// TODO Auto-generated method stub
		return 39.9;
	}
	
	public void cargarCaja(Caja c) {
		if (this.numCajas == 1) {
			throw new RuntimeException("La moto solo puede cargar una caja");
		}
		this.numCajas++;
		super.cargarCaja(c);
	}

}
