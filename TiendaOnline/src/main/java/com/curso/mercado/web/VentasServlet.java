package com.curso.mercado.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.mercado.servicios.VentasService;
import com.curso.mercado.servicios.excepciones.VentasException;

@WebServlet(urlPatterns = "comprar", loadOnStartup = 2)
public class VentasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public VentasServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//leer parametro que recibe el idProducto
		//comprar 1 unidad
		
		String paramId = request.getParameter("idproducto");
		int idProductoComprar = 0;
		if(paramId != null) {
			idProductoComprar = Integer.parseInt(paramId);
		}
		
		String mensaje = "";
		VentasService servicio = new VentasService();
		try {
			servicio.comprarProducto(idProductoComprar, 1);
			mensaje = "Has comprado una unidad";
		}catch (VentasException e){
			mensaje = "No se ha comprado";
		}
		request.setAttribute("mensaje", mensaje);
		RequestDispatcher rd = request.getRequestDispatcher("alta-producto.jsp");
		rd.forward(request, response);
	}

}