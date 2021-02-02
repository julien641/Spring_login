package com.example.demo.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.forms.Signup_Form;
import com.example.demo.model.mysql.*;
import com.example.demo.repository.PersonRepository;
import com.example.demo.repository.Person_LoginRepository;

@Controller
public class SignupController {
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private Person_LoginRepository person_loginrepository;
	  @GetMapping("/signup")
	  public String greetingForm(Model model) {
	    model.addAttribute("Person_Login", new Person_Login());
	    
	    return "signup";
	  }

	  @PostMapping("/signup")
	  public String greetingSubmit(@ModelAttribute Person_Login person_Login, Model model) {
	    model.addAttribute("Person_Login",person_Login);
	    System.out.println(person_Login.toString());
	    //person_loginrepository.save(person_login);
	    return "result";
	  }
	
	
	
	
	/*
	  @GetMapping("/signup")
	  public String greetingForm(Model model) {
		    model.addAttribute("signup", new Person());
		    return "signup";
		  }

		  @PostMapping("/signup")
		  public String greetingSubmit(@ModelAttribute Person person, Model model) {
		    model.addAttribute("signup", person);
		    return "result";
		  }
	
	
	*/
	
	
	/*
	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public String signupSubmit(@ModelAttribute Person person, Model model) {
		 System.out.println("Here we go !!");
	     model.addAttribute("person", new Person());
	    return "signup";	

		  }
		  
		  
		
	   @GetMapping
	    public String showForm(Model model) {
		   Person person = new Person();
	        model.addAttribute("user", person);
	        
	         
	        return "signup";
	    }
	public String Test(Model model) {
	    System.out.println("Here we go !! Test");
	     model.addAttribute("person", new Person());
	    return "signup";
	
	}
	
	@RequestMapping(value="/register")
	public String Test1(@ModelAttribute("person")Person person,Model model) {
	    System.out.println("Here we go !! Test1");
	     this.personRepository.save(person);
	     return "redirect:/";
	
	}
	@RequestMapping(value="/signup")
	//public String Test2(@RequestBody Date date) {
	public void Test2() {
	    System.out.println("Here we go !! Test1");
	    Person p= new Person();
	    this.personRepository.save(p);

	
	}
	@RequestMapping(value="/signup")
	//public String Test2(@RequestBody Date date) {
	public void Test3() {
	    System.out.println("Here we go !! Test1");
	    Person p= new Person();
	    this.personRepository.save(p);

	
	}
	  */
/*
		@RequestMapping(value = "/signup", method = RequestMethod.GET)
		public void getsignup() {
		
		}
*/
	}



