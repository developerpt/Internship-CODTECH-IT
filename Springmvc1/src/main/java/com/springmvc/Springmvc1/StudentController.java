package com.springmvc.Springmvc1;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping("/testjsp")
	public String wellcome() {

		return "index.html";
	}

//	@RequestMapping("/allstudents")
//
//	public ModelAndView fetchstudents() {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("students");
//		ArrayList<Students> list = new ArrayList<Students>();
//		list.add(new Students("pragat", 11));
//		list.add(new Students("vinayak", 22));
//		list.add(new Students("ishwar", 33));
//		list.add(new Students("akash", 44));
//		modelAndView.addObject("stulist", list);
//		return modelAndView;
//	}

}
