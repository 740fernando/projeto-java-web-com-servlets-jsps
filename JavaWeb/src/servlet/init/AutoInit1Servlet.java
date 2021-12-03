package servlet.init;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

public class AutoInit1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String AdminEmail;

	public void init(ServletConfig config) throws ServletException {

		String email = config.getInitParameter("adminEmail");
		this.AdminEmail = email;

		System.out.println("Servlet carregado ! adminEmail : " + email);

	}
}