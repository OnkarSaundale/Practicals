package ServletAssignments;
//Q.1 Create Login Form using Servlet
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Question1
 */
@WebServlet("/Question1")
public class Question1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("Text/html");
		
		String s1= request.getParameter("t1");
		String s2= request.getParameter("t2");
		out.println("<HTML><BODY>");
		out.println("<h1>Welcome</h1>"+s1);
		out.println("</BODY></HTML>");
	}

}
