package com.ustc.learn;

import com.ustc.learn.impl.UserServiceImpl;
import com.ustc.learn.po.User;
import com.ustc.learn.services.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		UserService userService = (UserService)act.getBean("userService");
		User user = new User();
		user.setName("张三");
		user.setAge(20);
		user.setSex("男");
		// 保存一条记录
		userService.save(user);

		List<User> users = userService.getUsers();
		System.out.println("++++++++得到所有User+++++++++");
		for (User u: users) {
			System.out.println(u);
		}
	}
}
