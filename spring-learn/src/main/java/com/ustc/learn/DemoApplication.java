package com.ustc.learn;

import com.ustc.learn.mapper.UserMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserMapper userDao = (UserMapper) context.getBean("userMapper");
		System.out.println(userDao.getUser(9));
	}
}
