<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>Login</title>
</head>
<body>


	<h1>Bank Online</h1>
	<h4>Login Customer</h4>



	<form action="login" method="post">


		<label for="nombreUsr">Nombre Customer</label> 
		<input type="text"
			id="nombreUsr" name="firstName" /> 
			
			<label for="nombreUsr">Apellido Customer</label> 
		<input type="text"
			id="nombreUsr" name="lastName" />
        <br>
        <button type="submit" class="btn btn-primary">Enviar</button>
	</form>


</body>
</html>