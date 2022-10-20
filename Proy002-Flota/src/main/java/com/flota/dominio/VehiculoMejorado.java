package com.flota.dominio;

/**
 * Clase que representa un vehiculo de una flota
 * Puede transportar cajas
 * Pero tiene una craga maxima permitida
 * 
 * @author Asier
 * @version 1.0
 */
public class VehiculoMejorado {

	private double cargaMaxima;
	private String matricula = "";
	protected double cargaActual = 0;
	protected int numCajas = 0;
	
	protected VehiculoMejorado(String matricula, double cargaMaxima) {
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
	
	public void cargarCaja(double peso) throws CargaException{
		if(peso <= 0) {
			throw new CargaException("La caja debe pesar",0);
		}
		
		if(peso+cargaActual > cargaMaxima) {
			double exceso = (- cargaMaxima - (peso + cargaActual));
			throw new CargaException("No caben mas cajas", exceso);
		}
		
		this.cargaActual +=peso;
		this.numCajas ++;
	}
	
	
	
	public void cargarCaja(Caja c) throws CargaException {
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
