package com.cleversai.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cleversai.starter.bean.CleverSAI;

@RestController
@RequestMapping("clevermain")
public class CleverSaiController {

	@RequestMapping("/hello")
	public String sayHello() {
		return "hello sai career";
	}

	@RequestMapping("/bean")
	public CleverSAI getCleverSAI() {
		CleverSAI cleverSAI = new CleverSAI();
		cleverSAI.setId(1);
		cleverSAI.setUser("clever");
		cleverSAI.setWay("super auto interface");
		return cleverSAI;
	}

}
