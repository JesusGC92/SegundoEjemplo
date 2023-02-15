package es.clase.primerosServlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControladorServlet
 */
@WebServlet("/ControladorServlet")
public class ControladorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ControladorServlet() {

      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Imaginamos que hemos conectado con una bd y hemos recogido una serie de productos
		String productos[]= {"destornillador","serrucho","tornillo","taladro"};
		//hereda de la interafcea ServletRequest
		//Almacena un atributo en el request. Se usa juto a RequestDispatcher
		//Almcenamos en request la información que viene de la BD
		request.setAttribute("lista_productos",productos);
		//Comunicamos con el JSp
		RequestDispatcher miDispatcher =request.getRequestDispatcher("/paginas/VistaJSP.jsp");
		//Enviamos la inf al jsp
		miDispatcher.forward(request,response);
		}

	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
