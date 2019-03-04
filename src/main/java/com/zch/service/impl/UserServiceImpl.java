package com.zch.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zch.bean.User;
import com.zch.dao.UserDao;
import com.zch.service.IUserService;

/**
* @author 张城辉
* @version 创建时间：2019年3月1日 下午2:53:42
* @ClassName 类名称
* @Description 类描述
*/
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private UserDao userDao;
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}
	@Override
	public User findById(String id) {
		return userDao.findById(id);
	}

}
