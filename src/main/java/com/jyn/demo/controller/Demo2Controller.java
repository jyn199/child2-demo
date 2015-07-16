package com.jyn.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Scope(value="prototype")
@RequestMapping("/demo2")
public class Demo2Controller {
	
	@RequestMapping(value="")
	public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("/index2");
		return mav;
	}
}