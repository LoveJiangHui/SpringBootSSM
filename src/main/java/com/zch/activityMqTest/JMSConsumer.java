package com.zch.activityMqTest;

import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import ch.qos.logback.classic.Logger;

/**
* @author 张城辉
* @version 创建时间：2019年3月5日 上午9:52:24
* @ClassName 类名称
* @Description 类描述 消息消费者
*/
@Component
public class JMSConsumer {
	private final static Logger logger = (Logger) LoggerFactory.getLogger(JMSConsumer.class);

    @JmsListener(destination = "springboot.queue.test")
    public void receiveQueue(String msg) {
        logger.info("接收到消息：{}",msg);
    }
}
