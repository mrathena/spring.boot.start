package com.mrathena.spring.boot.start.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mrathena.spring.boot.start.entity.SYSUser;
import com.mrathena.spring.boot.start.service.SYSUserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SYSUserService userService;

	@RequestMapping("list")
	public String list(Model model) {
		log.info("UserController.list");
		List<SYSUser> users = userService.getAllUsers();
		model.addAttribute("users", users);
		return "user/list";
	}
	
	@ResponseBody
	@RequestMapping("insert")
	public void insert(SYSUser user) {
		log.info("UserController.insert");
		userService.insertUser(user);
	}
	
	@ResponseBody
	@RequestMapping("delete")
	public void delete(Long id) {
		log.info("UserController.delete");
		userService.deleteUser(id);
	}
	
}