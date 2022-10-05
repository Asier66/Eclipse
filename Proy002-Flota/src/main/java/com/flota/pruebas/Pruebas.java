package com.flota.pruebas;

import com.flota.dominio.Vehiculo;

public class Pruebas {

	public static void main(String[] args) {
		
		Vehiculo camion = new Vehiculo("44688DSDD", 5000.10);
		//camion.cargaMaxima = 555.25;
		try {
		camion.setCargaMaxima(600);
		
		System.out.printf("El camion con matricula %s " + "tiene una carga actual de %f kg %n",
				camion.getMatricula(), camion.getCargaActual());
		
		System.out.println("Cargo una caja de 560kg");
				camion.cargarCaja(560);
		
		System.out.printf("El camion con matricula %s " + "tiene una carga actual de %f kg %n",
				camion.getMatricula(), camion.getCargaActual());
		
		System.out.println("Cargo una caja de 100kg");
		camion.cargarCaja(100);
		
		
		
		}catch(Exception e) {
			System.out.println("No puede cargar " + e.getMessage());
		}
	}

}
