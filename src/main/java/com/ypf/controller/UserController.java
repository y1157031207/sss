package com.ypf.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ypf.beans.User;
import com.ypf.service.UserService;

@Controller
public class UserController {

	@Resource
	private UserService ser;
	
	@RequestMapping("list")
	public String list(Model model){
		List<User> list = ser.queryAll();
		model.addAttribute("list", list);
		return "list";
	}
}
