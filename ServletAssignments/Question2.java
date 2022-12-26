package ServletAssignments;
//Q.2 Write a servlet that will take a string and show the reverse in the form. 
//FirstServlet take text input and submit it to SecondServlet,
//The SecondServlet print that input in reverse,it has original button when click,it 
//navigate to ThirdServlet and then
//ThirdServlet print original text
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//First Servlet- Question2
@WebServlet("/Question2")
public class Question2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("Text/html");
		
		HttpSession session = request.getSession();
		String s1=request.getParameter("t1");
		
		session.setAttribute("str", s1);
		out.println("Your String is stored click on reverse for reverse the string!!");
		out.println("<HTML><BODY>");
		out.println("<FORM method='post' action='Question2a'>");
		out.println("<input type ='submit' value='Reverse the string'>");
		out.println("</FORM</BODY></HTML>");
		out.close();
	}

}
