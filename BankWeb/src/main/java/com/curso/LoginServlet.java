package com.curso;


import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.curso.Customer;
import com.curso.BankService;
import com.curso.Bank;

@WebServlet(urlPatterns = "login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	BankService bankService = new BankService();

    public LoginServlet() {
        super();
    }
    
    public void init(ServletConfig config) throws ServletException {
    	//contexto de la aplicación
    	// CREO UN ATRIBUTO DE ÁMBITO DE APLICACIÓN
    	// es para todos los usuarios en todas las pagínas/Servlets/jsp
    	System.out.println("..... " + config.getServletContext());
    	config.getServletContext().setAttribute("tituloTienda", "LAS MARAVILLAS");
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//leer parametros
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		
		if(firstName == null || firstName.trim().length()==0) {
			firstName = "customer Sin Nombre";
		}if(lastName == null || lastName.trim().length()==0) {
			lastName = "Customer Sin Apellido";
		}
		Bank.addCustomer(firstName, lastName);
		
		Customer customer = new Customer(firstName, lastName);
		
		request.setAttribute("customer", customer);
		//modo 1. ÁMBITO DE PETICIÓN (REQUEST)
//		request.setAttribute("usuario", usuario);	
//		
//		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
//		rd.forward(request, response);
		
		
		//modo 2. ÁMBITO DE SESIÓN (MEJOR)
		
		HttpSession sesion= request.getSession();
		
		sesion.setAttribute("customer", customer);
			
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
		List<Customer> listaCustomer = bankService.dameTodosLosCustomers();

		request.setAttribute("lista", listaCustomer);
		RequestDispatcher rd1 = request.getRequestDispatcher("index.jsp");
		rd1.forward(request, response);

	}
	
}

