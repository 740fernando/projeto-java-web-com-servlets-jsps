package servlet.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Arquivo")
public class ArquivoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		OutputStream out= null;
		
		FileInputStream fis = null;
		try{
			out= response.getOutputStream();
			
			response.addHeader("Content-Disposition", "attachment: filename=alura.zip");
			
			response.setContentType("application/zip");
			fis= new FileInputStream("C:/Users/fsouviei/swagger/perfil_alura.zip");
			
			byte[] buffer = new byte[1024];
			int b;
			//leia o conteudo em fis para dentro do buffer, essa chamada vai retornar o numero de byte lidos
			while((b= fis.read(buffer))>-1){
				out.write(buffer,0,b);
			}		
		}finally{
			if(fis !=null){
				fis.close();
			}
			if(out != null){
				out.close();
			}
		}
	}
}
