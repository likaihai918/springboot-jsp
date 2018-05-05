package cn.likaihai.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.likaihai.com.service.UserService;

@Controller
public class IndexController {
	

	
	@RequestMapping("index")
	public String index(){
		return "index";
	}
	

}
