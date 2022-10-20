package com.flota.dominio;

public class PruebaCajaMejorada {
	
	public static void main(String[] args) {
		VehiculoMejorado v = new VehiculoMejorado("aa", 300);
		
		Caja c = new Caja();
		c.setPeso(350);
		
		try {
		v.cargarCaja(c);
		}catch(CargaException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getExcesoCarga());
		}
		
		
	}

}
