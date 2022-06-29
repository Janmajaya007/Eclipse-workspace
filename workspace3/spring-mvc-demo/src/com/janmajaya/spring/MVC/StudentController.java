package com.janmajaya.spring.MVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@RequestMapping("/showForm")
	public String showingForm(Model theModel){
		//Create a student object
		Student theStudent=new Student();
		//add student object to the model
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	@RequestMapping("/processForm")
	public String procesForm(@ModelAttribute ("student") Student theStudent){
		//log the input data
		System.out.println("theStudent "+ theStudent.getFirstName()+"  "+theStudent.getLastName());
		
		return "student-confirmation";
	}
}
