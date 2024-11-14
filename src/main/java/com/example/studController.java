package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class studController {
	
	
	@GetMapping("/testing")
	//@ResponseBody
	public String sampleTesting()
	{
		return "hello";
	}
	
	
	
	
//	public List<students> getAllStudents()
//	{
//		
//	}

}
