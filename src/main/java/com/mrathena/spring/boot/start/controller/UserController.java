package com.mrathena.spring.boot.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

	@RequestMapping("{username}")
	public String index(Model model, @PathVariable("username") String username) {
		model.addAttribute("username", username);
		// 页面被称为模板, 放到src/main/resources/templates下
		return "user/index";
	}
	
}