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

import asr.proyectoFinal.dao.CloudantPalabraStore;
import asr.proyectoFinal.dominio.Palabra;
import asr.proyectoFinal.services.Text2Speech;
import asr.proyectoFinal.services.Traductor;


/**
 * Servlet implementation class ControllerEscuchar
 */
@WebServlet(urlPatterns = {"/escuchar"})
public class ControllerEscuchar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		switch(request.getServletPath())	{
			
			case "/escuchar":
				byte[] audio ;
				audio = Text2Speech.escuchar("Hola mundo");
				response.getOutputStream().write(audio);
			    //out.println(String.format("Procedemos a descargar el texto"));
				break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
