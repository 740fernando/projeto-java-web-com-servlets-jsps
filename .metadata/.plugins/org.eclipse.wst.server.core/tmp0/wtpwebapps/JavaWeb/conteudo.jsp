<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pagina Inicial</title>
	</head>
	<body>
		<!-- Diretiva include = Quando ? compilado, o codigo j? incluido -->
		<%@include file = "header.jsp" %>
	
		<CENTER>Conteudo da p?gina Inicial</CENTER>
		
		<!-- outra forma = aqui o conteudo ? incluido apenas na renderizacao- ? mais utilizado -->
		<jsp:include page="footer.jsp"/>
	</body>	
</html>