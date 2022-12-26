

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServletQ3
 */
@WebServlet("/TestServletQ3")
public class TestServletQ3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("Text/html");
		out.println("<HTML><BODY>");
		ServletContext ctx=request.getServletContext();
		String s1=ctx.getInitParameter("Email");
		out.println("<h1>"+"Email is: "+s1+"</h1>");
		out.println("</BODY></HTML>");
		out.close();
	}

}
