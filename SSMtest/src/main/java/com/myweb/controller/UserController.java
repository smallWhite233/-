package com.myweb.controller;

import javax.annotation.Resource;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.myweb.entity.User;
import com.myweb.service.UserService;

@Controller

public class UserController {
	@Resource
	private UserService userService;
	
	@RequestMapping(value="/showUser",method=RequestMethod.GET)
	public String showUsername(@RequestParam("uid") int userId,HttpServletRequest request,Model model){
		System.out.println("showname");
		User user=userService.getUserById(userId);
		if(user!=null){
			request.setAttribute("name", user.getUserName());
			model.addAttribute("name",user.getUserName());
			return "showUser";
		}
		request.setAttribute("error", "没有此用户！");
		return "error";
	}
}
