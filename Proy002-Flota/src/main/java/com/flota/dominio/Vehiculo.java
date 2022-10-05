package com.flota.dominio;

/**
 * Clase que representa un vehiculo de una flota
 * Puede transportar cajas
 * Pero tiene una craga maxima permitida
 * 
 * @author Asier
 * @version 1.0
 */
public class Vehiculo {

	private double cargaMaxima;
	private String matricula = "";
	private double cargaActual = 0;
	private int numCajas = 0;
	
	public Vehiculo(String matricula, double cargaMaxima) {
		this.matricula = matricula;
		this.cargaMaxima = cargaMaxima;
	}
	
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		if(cargaMaxima < 0) {
			throw new RuntimeException("No puede pasar una carga negativa");
		}
		this.cargaMaxima = cargaMaxima;
	}
	 
	/**
	 * Metodo que recibe el peso de la caja a cargar e incrementa el peso actual del camion
	 * y el numero de cajas cargadas
	 * Si el peso no es valido lanza una excepcion
	 * Si el peso a cargar supera el max permitido exce...
	 * @param peso peso de la caja a cargar en kg
	 * @throws RuntimeException el peso de la caja no es valido o supera la carga maxima permitida
	 */
	
	public void cargarCaja(double peso) {
		if(peso <= 0) {
			throw new RuntimeException("La caja debe pesar");
		}
		
		if(peso+cargaActual > cargaMaxima) {
			throw new RuntimeException("No caben mas cajas");
		}
		
		this.cargaActual +=peso;
		this.numCajas ++;
	}
	
	public void cargarCaja(Caja c) {
		cargarCaja(c.getPeso());
	}
	
	public double getCargaActual() {
		return cargaActual;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public int getNumCajas() {
		return numCajas;
	}
	 
}
