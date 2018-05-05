package cn.likaihai.com.controller;

import java.util.List;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.likaihai.com.pojo.User;
import cn.likaihai.com.service.UserService;

@RestController
public class UserController {
	
	private static Logger log = Logger.getLogger(UserController.class);
	@Autowired
	private CacheManager cacheManager;
	@Autowired
	private UserService userService;
	@Value("${testname}")//获取自定义参数
	private String testname;

	@RequestMapping("insertUser")
	public String insertUser(String name, Integer age) {
		int createUser = userService.createUser(name, age);
		System.out.println("成功插入" + createUser + "条user信息");
		return "add susscess";
	}

	@RequestMapping("selectUserByName")
	public String selectUserByName(String name) {
		List<User> users = userService.findUserByName(name);
		System.out.println("用户信息：" + users);
		return "find susscess";
	}

	@RequestMapping("log")
	public String log(String name) {
		return "success";
	}

	@RequestMapping("/remoKey")
	public void remoKey() {
		cacheManager.getCache("baseCache").clear();
	}

	@RequestMapping("ansyc")
	public String sesmsm() {
		System.out.println("执行的第1步...");
		userService.sedsms();
		System.out.println("执行的第4步...");
		return "success";
	}

	@RequestMapping("testname")
	public String testname() {
		return testname;
	}

}
