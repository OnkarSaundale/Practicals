package com.example.demo;
//Example of using the @RestController
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //This is interface
public class Controller
{
	int count=0,newcount=0;
	@RequestMapping("/home")//When  this is placed in url it gets redirect to this display method.
	public String display()
	{
		count++;
		System.out.println("count: "+count);
		
		return "<a href='/newhome'>newhome</a>";
	}
	
	@RequestMapping("/newhome")
	public String dis()
	{
		newcount++;
		System.out.println("newcount: "+newcount);

		return "<h1>Hi</hi>";
	}
}
