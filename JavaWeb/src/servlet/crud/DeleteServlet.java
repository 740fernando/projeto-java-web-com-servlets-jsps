package servlet.crud;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Properties;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/Delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String key = request.getParameter("key");
		Properties.delete(key);
		
		response.sendRedirect("/JavaWeb/list");
	}

}
/*
 * Existe duas formas de fazer um redirecionamento:
 * 
 * - foward - redirecionamento interno, feito pelo conteiner, dentro do servidor.
 * 
 * - redirect - servidor fala para o Browser fazer o redirecionamento.
 * 
 * Quando usar:
 * 
 *  Redirect � utilizado quando for feito um altera��o no sistemas, banco de dados.
 *  porque o redirect atualiza a url do browser externamente, caso utilize foward e
 *   vc excluir e ficar atulizando a pagina, essa atualizacao fara que o /list seja 
 *  chamado denovo,isso far� que exclui novamente.
 *  
 *  foward- Quando � exibi��o de lista
 */
