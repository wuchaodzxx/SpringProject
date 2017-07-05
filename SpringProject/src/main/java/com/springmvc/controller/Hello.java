
package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hello {
	@RequestMapping(value = "/hello")
	public String HelloWorld(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
		ModelAndView mav=new ModelAndView("dept");
	    mav.addObject("message", "Hello World!!!");
	    return "hello";
	}

}
