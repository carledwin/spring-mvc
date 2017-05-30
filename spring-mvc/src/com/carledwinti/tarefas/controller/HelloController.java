package com.carledwinti.tarefas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String execute(){
		System.out.println("executando hello com springmvc.");
		return "hello";
	}
}
