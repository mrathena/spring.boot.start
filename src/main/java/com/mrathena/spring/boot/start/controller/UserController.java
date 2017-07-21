package com.mrathena.spring.boot.start.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.mrathena.spring.boot.start.constant.Constants;
import com.mrathena.spring.boot.start.entity.SYSUser;
import com.mrathena.spring.boot.start.service.SYSUserService;

@Controller
@RequestMapping("user")
public class UserController {
	
	Logger log = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private SYSUserService userService;

	@RequestMapping("list")
	public String list(Model model, HttpServletRequest request, Integer size, Integer index) {
		PageInfo<SYSUser> page = userService.getAllUsers(size, index);
		model.addAttribute("page", page);
		if (Constants.HTTP_METHOD_GET.equals(request.getMethod())) {
			return "user-list";
		}
		return "user-list-items";
	}
	
	@ResponseBody
	@RequestMapping("insert")
	public void insert(SYSUser user) {
		userService.insertUser(user);
	}
	
	@ResponseBody
	@RequestMapping("delete")
	public void delete(Long id) {
		userService.deleteUser(id);
	}
	
}