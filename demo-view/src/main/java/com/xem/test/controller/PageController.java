/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xem.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author arria
 */
@Controller
public class PageController {

@RequestMapping(value = {"/","/index"})
	public ModelAndView index(){
		
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("greeting", "Welcome to Test page");
		return mv;
	}    
    
    
}
