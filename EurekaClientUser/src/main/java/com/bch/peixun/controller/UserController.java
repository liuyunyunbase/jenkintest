package com.bch.peixun.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bch.peixun.entity.User;

@RestController
public class UserController {

	@GetMapping("/findUser/{id}")
	public User findUser(@PathVariable Integer id) {
		User user = new User();
		user.setId(id);
		user.setName("张三");
		user.setAge(18);
		user.setSex("男");
		return user;
	}
}
