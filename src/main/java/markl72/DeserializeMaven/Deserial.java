package markl72.DeserializeMaven;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Base64;
import java.util.zip.GZIPInputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.remoting.*;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

//import ysoserial.payloads.*;

@WebServlet
public class Deserial extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
		
            
        try {
           out.println("<p>handleRequest</p>");
           HttpInvokerServiceExporter test = new HttpInvokerServiceExporter();
           test.handleRequest(request, response);
           out.println("<p>handleRequest END</p>");
        } catch (Throwable e) {
           out.println(e);
           throw new ServletException(e);
        }      	
		
	}
}
