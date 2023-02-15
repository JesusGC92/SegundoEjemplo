package es.clase.primerosServlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registrousuarios
 */
@WebServlet("/Registrousuarios")
public class Registrousuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrousuarios() {

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//enviamos una respuesta al usuario con la inf que ha introducido en el formulario
		
		//request.setCharacterEncoding("UTF-8");
		PrintWriter salida = response.getWriter();
		
		salida.println("<html>");
		salida.println("<head>");
		salida.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
		salida.println("</head>");
		salida.println("<body>");
		salida.println("Nombre introducido: "+request.getParameter("nombre"));
		salida.println("Apellido introducido: "+request.getParameter("apellido"));
		salida.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
