package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecondController 
{
	@RequestMapping("/list")
	@ResponseBody
	public List test()
	{
		List<String> li= new ArrayList<>();
		li.add("Pune");
		li.add("Mumbai");
		li.add("Chennai");
		return li;
	}
}
