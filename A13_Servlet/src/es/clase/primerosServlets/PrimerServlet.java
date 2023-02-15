package es.clase.primerosServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimerServlet
 */
@WebServlet("/PrimerServlet")
public class PrimerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public PrimerServlet() {
        super();
    }

  //Lo llama el servidor para permitir que un servlet maneje una solicitud GET.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Especificamos el formato de respuesta a través de getWriter()
		PrintWriter salida = response.getWriter();
		//generamos la respuesta de la petición
		
		salida.println("<html>");
		salida.println("<head>");
		salida.println("<meta http-equiv='Content-Type' content='text/html: charset=UTF-8' />");
		salida.println("</head>");
		salida.println("<body>");
		salida.println("<h1 style='text-align:center'>prueba servlet</h1>");
		salida.println("<p>fecha actual: "+LocalDate.now()+"</p>");
		salida.println("</body></html>");
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
