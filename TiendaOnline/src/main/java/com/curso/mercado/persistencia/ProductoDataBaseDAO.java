package com.curso.mercado.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.curso.mercado.entidades.Producto;

public class ProductoDataBaseDAO implements GenericDAO<Producto>{
	
	private Connection con;
	
	public ProductoDataBaseDAO(Connection con) {
		this.con = con;
	}

	@Override
	public void add(Producto entidad) {
		// TODO Auto-generated method stub
		
		int newId = 0;
		newId = getUltimoIdProducto() + 1;
		PreparedStatement ps;
		try {
			ps = con.prepareStatement("INSERT INTO PRODUCTOS " + "(ID_PRODUCTO, DESCRIPCION, PRECIO, STOCK) " + "VALUES (?,?,?)");
			ps.setInt(1,  newId);
			ps.setString(2, entidad.getDescripcion());
			ps.setDouble(3,  entidad.getPrecio());
			ps.setInt(4,  entidad.getStock());
			ps.executeUpdate();
			System.out.println("grabo ok el producto");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("No se pudo crear el producto" + e.getMessage(),e);
		}
		
	}

	@Override
	public List<Producto> getAll() {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		String consulta = "SELECT * FROM HR.PRODUCTOS";
		try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(consulta);
		
		while(rs.next()) {
			Producto p = new Producto();
			p.setIdProducto(rs.getInt("ID_PRODUCTO"));
			p.setDescripcion(rs.getString("DESCRIPCION"));
			p.setPrecio(rs.getDouble("PRECIO"));
			p.setStock(rs.getInt("STOCK"));
			productos.add(p);
		}
		
		}catch (SQLException e) {
			throw new RuntimeException("DB JDBC API. " + e.getMessage());
		}
		return productos;
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
	
	private int getUltimoIdProducto() {
		String consulta = "SELECT max(ID_PRODUCTO) FROM HR.PRODUCTOS";
		try {
			ResultSet rs = con.createStatement().executeQuery(consulta);
			if (rs.next()) {
				return rs.getInt(1);
			}else {
				return 0;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("No se pudo obtener el ultimo id");
			
		}
	}

}
