package com.curso;

import java.util.List;

import com.curso.Customer;
import com.curso.GenericDAO;
import com.curso.CustomerInMemory;

public class BankService {

	GenericDAO<Customer> dao = new CustomerInMemory();

	public void darDeAltaUnCustomer(Customer p) {
		dao.add(p);
	}

	public List<Customer> dameTodosLosCustomers() {
		return dao.getAll();
	}

}