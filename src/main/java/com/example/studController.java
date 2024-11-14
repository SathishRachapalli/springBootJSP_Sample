package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class studController {
	
	
	@GetMapping("/testing")
	//@ResponseBody
	public String sampleTesting()
	{
		return "hello";
	}
	
	
	
	@GetMapping("/students")
	public String getAllStudents(Model model)
	{
		List<String> studentNames= new ArrayList<>();
		
		studentNames.add("sathish");
		studentNames.add("Ravi");
		studentNames.add("Mahesh");
		
		model.addAttribute("students", studentNames);
		
		return "students-list";
	}

}
