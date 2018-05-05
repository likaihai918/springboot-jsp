package cn.likaihai.com.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.likaihai.com.mapper.UserMapper;
import cn.likaihai.com.pojo.User;
import cn.likaihai.com.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	@Transactional
	public int createUser(String name, Integer age) {
		System.out.println("mapper方式插入一条数据");
		int insertUser = userMapper.insertUser(age, name);
		return insertUser;
	}

	@Override
	public List<User> findUserByName(String username) {
		return userMapper.findUserByName(username);
	}
	
	@Async
	public void sedsms(){
		
		System.out.println("开始执行第2步........");
		for (int i = 0; i < 5; i++) {
			System.out.println("第"+i+"条数据...");
		}
		System.out.println("开始执行第3步........");
		
	}

}
