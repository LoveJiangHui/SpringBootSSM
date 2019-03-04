package com.zch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zch.bean.User;
import com.zch.service.IUserService;

/**
* @author 张城辉
* @version 创建时间：2019年3月1日 下午2:55:54
* @ClassName 类名称
* @Description 类描述
*/
@RestController
public class UserController {
	@Autowired
	private IUserService userService;
	@RequestMapping("/findAll")
    public String findAll(){
		List<User> list = userService.findAll();
    	return list.toString();
    }
	@RequestMapping("/findById")
    public String findById(String id){
		User user = userService.findById(id);
    	return user.toString();
    }
	@RequestMapping("/123")
	public String shwo(){
		return "啊哈哈";
	}
}
