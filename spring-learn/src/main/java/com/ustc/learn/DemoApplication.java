package com.ustc.learn;

import com.ustc.learn.po.User;
import com.ustc.learn.services.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
	public static void main(String[] args) throws Exception {
		ApplicationContext act = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService userService = (UserService)act.getBean("userService");
		User user = new User();
		user.setName("李四");
		user.setAge(41);
		user.setSex("女");
		// 保存一条记录
		userService.save(user);
	}
}
