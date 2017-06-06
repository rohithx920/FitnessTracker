package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.model.Excercise;

@Controller
public class MinutesController {
	@RequestMapping(value="/addminutes")
	public String addMinutes(@ModelAttribute("exercise") Excercise exercise){
		System.out.println("exercise:"+exercise.getMinutes());
		return "addMinutes";
	}
}
