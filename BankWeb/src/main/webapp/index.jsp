<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>index</title>
  </head>
  <body>
        <h1>Bank Online</h1>
    
    <div> Nombre: ${requestScope.customer.firstName }</div>
    <div> Apellido: ${sessionScope.customer.lastName }</div>

    
     
   	<a class="btn btn-primary" href="savings-account.jsp" role="button">Savings Account</a>
    <a class="btn btn-primary" href="checking-account" role="button">Checking Account</a>
    
    <h4>Lista de Customers</h4>
    
    <table>
		<c:forEach var="customer" items="${requestScope.lista}">
			<tr>
				<td>${customer.firstName}</td>
				<td>${customer.lastName}</td>
			</tr>
			<tr>
				<td>${customer.firstName}</td>
				<td>${customer.lastName}</td>
			</tr>
			<tr>
				<td>${customer.firstName}</td>
				<td>${customer.lastName}</td>
			</tr>
		</c:forEach>
	</table>
 

  </body>
</html>
