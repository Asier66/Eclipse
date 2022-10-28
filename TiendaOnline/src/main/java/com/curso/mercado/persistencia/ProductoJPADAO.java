package com.curso.mercado.persistencia;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.curso.mercado.entidades.Producto;

public class ProductoJPADAO implements GenericDAO<Producto>{
	public static void main(String[] args) {
		

			//1. Crear una Factoria de Entiny Manager
			EntityManagerFactory factory;
			
			{
				factory = Persistence.createEntityManagerFactory("OracleHRPU");
			}
				
				
			//2. Obtenemos un Entity Manager  
			EntityManager em = factory.createEntityManager();
			

			
			Query consulta = em.createNativeQuery(
					"SELECT * FROM PRODUCTOS",
					Producto.class);
			
			//MOSTRAR TODOS LOS PRODUCTOS
			List<Producto> lista = consulta.getResultList();
	
			System.out.println("Lista de todos los objetos");
			for(Producto p : lista) {
				System.out.println(p);
			}
			
			//BUSCAR UN PRODUCTO
			Producto p1 = em.find(Producto.class, 2);
			System.out.println("El producto es " + p1);
			
			//CREAR UN PRODUCTO
			em.getTransaction().begin();
			try {
				Producto pNuevo = new Producto();
				pNuevo.setDescripcion("Cama");
				pNuevo.setPrecio(24.3);
				pNuevo.setStock(10);
				em.persist(pNuevo);
				
				System.out.println("Creo el producto " + pNuevo.getIdProducto());
				
				em.getTransaction().commit();
			}catch(Exception e) {
				em.getTransaction().rollback();
			}
			
	}
	
	@Override
	public void add(Producto entidad) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Producto> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Producto entidad) {
		// TODO Auto-generated method stub
		
	}

}
