package com.curso;

import java.util.List;

import com.curso.BaseDatosCustomer;
import com.curso.Customer;

public class CustomerInMemory implements GenericDAO<Customer> {

	@Override
	public void add(Customer entidad) {
	   BaseDatosCustomer.add(entidad.getFirstName(), entidad.getLastName());
		
	}

	@Override
	public List<Customer> getAll() {
		// TODO crear y devolver una lista de productos
		return null;
	}

}