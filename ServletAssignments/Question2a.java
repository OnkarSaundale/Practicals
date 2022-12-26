package ServletAssignments;
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


@WebServlet("/Question2a")
public class Question2a extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		response.setContentType("Text/html");
		
		HttpSession session = request.getSession();
		
		String s2=(String) session.getAttribute("str");
		
		//Reverse the String
		String nstr="";
		char ch;
		int len,i;
		
		for(i=0; i<s2.length(); i++)
			{
				ch= s2.charAt(i); //extracts each character
		        nstr= ch+nstr;//adds each character in front of the existing string
			}
		out.println("Reverse of the string is: "+nstr);
		
		out.println("<HTML><BODY>");
		out.println("<FORM method='post' action='Question2b'>");
		out.println("<input type ='submit' value='Want to see oringinal'>");
		out.println("</FORM</BODY></HTML>");
		out.close();
		
	}

}
