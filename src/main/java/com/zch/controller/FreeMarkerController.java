package com.zch.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zch.util.Resources;

import freemarker.ext.beans.MapModel;

/**
* @author 张城辉
* @version 创建时间：2019年3月1日 下午5:24:09
* @ClassName 类名称
* @Description 类描述
*/
@Controller
@RequestMapping("/ftl")

public class FreeMarkerController {
  @Autowired
  private Resources resources;
    @RequestMapping("/index")
    public String index(ModelMap mm) throws UnsupportedEncodingException{
    	String transCodeName = new String(resources.getName().getBytes("iso-8859-1"), "utf-8");
    	  resources.setName(transCodeName);
    	mm.addAttribute("resources", resources);
    	System.out.println(mm.toString()+"-----");
		return "freemarker/index";
    }
}
