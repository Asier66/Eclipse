package com.curso;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.curso.Customer;

public class BaseDatosCustomer {
	
	private static Map<Integer, Customer> tablaCustomer;
	public static int contador = 3;
	
	static {
		tablaCustomer = new TreeMap<Integer,Customer>();
		tablaCustomer.put(1, new Customer("Asier", "Campos"));
		tablaCustomer.put(2, new Customer("Asier", "Campos"));

	}

	private BaseDatosCustomer() {
		
	}
	
	public static void add(String firstName, String lastName) {
		int newId = ++contador;
		Customer newP = new Customer(firstName, lastName);
		tablaCustomer.put(newId, newP);
	}
	
	public static Collection<Customer>getAll(){
		return tablaCustomer.values();
	}
	
	public static Customer findById (int id) {
		return tablaCustomer.get(id);
	}
	
	public static int getContador() {
		return contador;
	}
}
