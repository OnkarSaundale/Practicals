

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Question4a
 */
@WebServlet("/Question4a")
public class Question4a extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("Text/html");
		
		out.println("<HTML><BODY>");
		
		ServletConfig cfg=getServletConfig();
		
		String s1=cfg.getInitParameter("Drivername");
		out.println("<h1>"+"Driver is: "+s1+"</h1>");
		
		out.println("</BODY></HTML>");
		out.close();
		
	}

}
