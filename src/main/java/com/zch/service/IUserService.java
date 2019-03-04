package com.zch.service;
/**
* @author 张城辉
* @version 创建时间：2019年3月1日 下午2:53:05
* @ClassName 类名称
* @Description 类描述
*/

import java.util.List;

import com.zch.bean.User;

public interface IUserService {
   public List<User> findAll();

public User findById(String id);
}
