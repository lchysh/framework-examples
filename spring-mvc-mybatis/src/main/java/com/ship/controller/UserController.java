package com.ship.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ship.service.UserService;
 
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
    @RequestMapping("index")
    public String index(){
        return "index";
    }
     
}
