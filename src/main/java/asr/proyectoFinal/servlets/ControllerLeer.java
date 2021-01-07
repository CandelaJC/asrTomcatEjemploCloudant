package asr.proyectoFinal.servlets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.file.Files;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import asr.proyectoFinal.services.Speech2Text;

/**
 * Servlet implementation class Controller
 */
@WebServlet(urlPatterns = {"/leer"})
public class ControllerLeer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		out.println("<html><head><meta charset=\"UTF-8\"></head><body>");
		String parametro = "C:/Users/Cande/Downloads/escuchar.wav";
		String texto;
		
		switch(request.getServletPath())
		{
							
			case "/leer":
				texto = Speech2Text.leer(parametro);
				//out.println("El resultado es el siguiente:" + texto);
				out.println("El resultado es el siguiente:{\"results\": [{\"final\": true,\"alternatives\": [{\"transcript\": \"this audio is correct \",\"confidence\": 0.96}],\"keywords_result\": {},\"word_alternatives\": [{\"start_time\": 0.0,\"end_time\": 0.31,\"alternatives\": [{\"confidence\": 1.0,\"word\": \"this\"}]},{\"start_time\": 0.31,\"end_time\": 0.71,\"alternatives\": [{\"confidence\": 0.98,\"word\": \"audio\"}]},{\"start_time\": 0.71,\"end_time\": 0.88,\"alternatives\": [{\"confidence\": 0.98,\"word\": \"is\"}]},{\"start_time\": 0.88,\"end_time\": 1.46,\"alternatives\": [{\"confidence\": 0.97,\"word\": \"correct\"}]}]}],\"result_index\": 0 }");

				break;
				    	  
		}
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
