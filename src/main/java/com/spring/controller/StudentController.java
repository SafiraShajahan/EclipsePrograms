package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.entity.StudentEntity;
import com.spring.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	/*@GetMapping("/display")
	public String display()
	{
		return "display";
	}*/
	
	@GetMapping("/home1")
	private String home1()
	{
		return "home1";
	}
	
	/*@GetMapping("/home2")
	private String home2()
	{
		return "home2";
	}
	@GetMapping("/home3")
	private String home3()
	{
		return "home3";
	}*/
	
	
	@PostMapping("/student")
	private String home1(@ModelAttribute StudentEntity student,Model model)
	
	{
	    studentService.addStudent(student);
		model.addAttribute("Safira",student);
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentEmail());
		return "student";
	}
	
//	@PostMapping("/home")
//	public String home(@ModelAttribute StudentEntity student,Model model)
//	{
//		model.addAttribute("student1",student);
//		
//		System.out.println("student id   " +student.getStudentId());
//		System.out.println("student name  "+student.getStudentName());
//		System.out.println("student email  "+student.getStudentEmail());
//	
//		return "home";
//		
//	}
}