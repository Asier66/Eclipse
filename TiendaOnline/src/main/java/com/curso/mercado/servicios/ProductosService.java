package com.curso.mercado.servicios;

import java.util.List;

import com.curso.db.PoolConexiones;
import com.curso.mercado.entidades.Producto;
import com.curso.mercado.persistencia.GenericDAO;
import com.curso.mercado.persistencia.ProductoDataBaseDAO;
import com.curso.mercado.persistencia.ProductoInMemoryDAO;

public class ProductosService {

	private GenericDAO<Producto> dao/* = new ProductoDataBaseDAO()*/;
	
	public ProductosService(){
		PoolConexiones pool = new PoolConexiones();
		this.dao = new ProductoDataBaseDAO(pool.getConnection());
	}

	public void darDeAltaUnProducto(Producto p) {
		// validar que p no es null
		// validar descripcion
		// validar precio
		dao.add(p);
	}

	public List<Producto> dameTodosLosProductos() {
		return dao.getAll();
	}

	
}
