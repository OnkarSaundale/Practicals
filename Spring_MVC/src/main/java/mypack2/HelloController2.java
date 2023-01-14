package mypack2;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController2
	{
		@RequestMapping("/login")
		public String display(HttpServletRequest req, Model m)
		{
			String name=req.getParameter("t1");
			String pass=req.getParameter("t2");
			
			if(pass.equals("admin") && name.equals("admin"))
				{
					String msg = "hello" + name;
					//Storing object in model class
					m.addAttribute("message",msg);
					return "viewpage2";
				}
			else
				{
					String msg = "sorry" + name+"You entered an incorrect password";
					//Storing object in model class
					m.addAttribute("message",msg);
					return "viewpage";
				}
		}
	}
