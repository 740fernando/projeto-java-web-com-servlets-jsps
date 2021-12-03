package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HTMLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = null;
		
		try{
			out = response.getWriter();
			
			response.setContentType("text/html");
			
			out.print("<HTML>");
			out.print("<HEAD>");
			out.print("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">");
			out.print("</HEAD>");
			out.print("<BODY>");
			out.print("<H1>Titulo da página</H1>");
			out.print("<STRONG>Este é um texto em negrito</STRONG>");
			out.print("</HTML></BODY>");
			
		} finally {
			if(out!=null){
				out.close();
			}
		}
	}
}
