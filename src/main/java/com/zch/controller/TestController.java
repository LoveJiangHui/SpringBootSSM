package com.zch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zch.bean.User;

/**
* @author 张城辉
* @version 创建时间：2019年3月4日 上午11:34:12
* @ClassName 类名称
* @Description 类描述
*/
@Controller
public class TestController {
	@RequestMapping("/test")
     public String index(Model model,User user){
    	 return "index";
     }
}
