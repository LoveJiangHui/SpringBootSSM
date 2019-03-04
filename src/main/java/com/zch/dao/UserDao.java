package com.zch.dao;
/**
* @author 张城辉
* @version 创建时间：2019年3月1日 下午1:40:54
* @ClassName 类名称
* @Description 类描述
*/

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import com.zch.bean.User;
@Mapper
public interface UserDao {
   public List<User> findAll();

public User findById(String id);
} 
