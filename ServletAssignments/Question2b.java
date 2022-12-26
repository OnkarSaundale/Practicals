package ServletAssignments;
//ThirdServlet print original text
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Question2b")
public class Question2b extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("Text/html");
		
		HttpSession session = request.getSession();
		
		String s3=(String) session.getAttribute("str");
		out.println("Original String is: "+s3);
		out.close();
	}

}
