package com.atit.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.atit.app.dao.UserDAO;

@Controller
public class DemoController {
	
	@Autowired
	private UserDAO userDAO;

	@RequestMapping(value="/demo", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav){
		
		mav.addObject("list", userDAO.getUser());
	
		mav.setViewName("demo/index");	
		
		return mav;
	}
	
	@RequestMapping(value="/demo/insert", method=RequestMethod.GET)
	public ModelAndView insert(ModelAndView mav){
		mav.setViewName("demo/insert");
		
		return mav;
	}
	
	@RequestMapping(value="/demo/save", method=RequestMethod.POST)
	public ModelAndView insertForm(ModelAndView mav
			, @RequestParam("name") String name){
		
		userDAO.setUser(name);
		mav.addObject("list", userDAO.getUser());
		
		
		mav.setViewName("demo/index");
		
		return mav;
	}
		
}
