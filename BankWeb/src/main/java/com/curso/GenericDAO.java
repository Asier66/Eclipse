package com.curso;

import java.util.List;

public interface GenericDAO<T> {
	
	public void add(T entidad);
	public List<T> getAll();

}