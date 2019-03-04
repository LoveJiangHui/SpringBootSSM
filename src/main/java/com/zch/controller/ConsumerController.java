package com.zch.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

/**
* @author 张城辉
* @version 创建时间：2019年3月5日 上午11:09:47
* @ClassName 类名称
* @Description 类描述  消费者controller
*/
@RestController
public class ConsumerController {
	@JmsListener(destination="activity.queue")
	public void recevieMsg(String msg){
		System.out.println("收到消息:"+msg);
	}
}
