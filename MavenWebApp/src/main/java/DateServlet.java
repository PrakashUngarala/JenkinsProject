import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/dateurl")
public class DateServlet extends HttpServlet{

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		pw.println("<h1 style='color: #6a0dad;' >Date and time is : "+new Date()+"</h1>");
		
		pw.println("<br> <a href='index.html'>home</a>");
		pw.close();
	}
	
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
}
