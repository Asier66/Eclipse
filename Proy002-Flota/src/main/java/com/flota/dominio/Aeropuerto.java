package com.flota.dominio;

public class Aeropuerto {
	
	public void gestionarVuelo(Volable v) {
		v.despegar();
		v.aterrizar();
		v.volar();
	}
	
	public static void main(String[] args) {
		
		//la variable de referencia v puede apuntar a cualquier objeto de la clase
		//que implementes el interfaz volable
		Volable v = new Avion("A5555", 4858);
		
		Aeropuerto aeropuerto = new Aeropuerto();
		aeropuerto.gestionarVuelo(v);
		
		Pajaro p = new Pajaro();
		aeropuerto.gestionarVuelo(p);
		
		Superman s = new Superman();
		aeropuerto.gestionarVuelo(s);
	}
}
