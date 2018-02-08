
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/mostrar")
public class muestra extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public muestra() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		Leemos todos los parámetros que nos pasan del formulario.
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos");
		String estudios = request.getParameter("estudios");
		
		String[] preferencias = request.getParameterValues("preferencias");
		
//		Configuramos la salida de datos hacia el navegador del usuario.
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		Generamos la página web que será enviada al navegador del usuario.
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Parámetros de formulario</title>");
		out.println("<meta charset='utf-8'>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Parámetros recibidos</h1>");
		out.println("Nombre: " + nombre + "<br>");
		out.println("Apellidos: " + apellidos + "<br>");
		out.println("Estudios: " + estudios + "<br>");
		out.println("Preferencias:<br>");
		
		for (int i = 0; i < preferencias.length; i++) {
			out.println(" - " + preferencias[i] + "<br>");
		}
		
		out.println("</body>");
		out.println("</html>");
		

	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}