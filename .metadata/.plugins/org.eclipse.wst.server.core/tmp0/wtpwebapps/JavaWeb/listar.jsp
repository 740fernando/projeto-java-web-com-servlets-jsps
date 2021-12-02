<%@page import="java.util.Set"%>
<%@page import="java.util.Properties"%>
<%@page import="java.io.InputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listagem do arquivo props.txt</title>
</head>
<body>
<%!
//declaration - define para o java que esse código declarado seja considerado atributo da classe no servlet
 Properties props = new Properties(); // Colecao do java que permite que faça a importacao de pares de chave e valor
%>
<%
	//Scripelet- Permitem que coloque codigo java, dentro da jsp - variaveis local criado dentro de um metodo
	 InputStream is = application.getResourceAsStream("/WEB-INF/props.txt");// permite le recursos do projeto
	 props.load(is);//fara que o Objeto props seja carregado com o conteud odo props.txt
	 is.close();
	 
	 Set<Object> keys= props.keySet();
%>
<table border="1" width="100%">
	<TR>
		<TD><STRONG>Nome</STRONG></TD>
		<TD><STRONG>Valor</STRONG></TD>
	</TR>
	<% for (Object k : keys){ %>
	<TR>
		<TD><%=k %></TD>
		<TD><%=props.getProperty((String) k) %></TD>
	</TR>
	<% } %>
</table>
</body>
</html>