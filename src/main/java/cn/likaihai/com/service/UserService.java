package cn.likaihai.com.service;

import java.util.List;

import cn.likaihai.com.pojo.User;

public interface UserService {

	int createUser(String name, Integer age);

	List<User> findUserByName(String name);
	
	public void sedsms();
}
