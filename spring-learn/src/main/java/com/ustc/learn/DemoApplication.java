package com.ustc.learn;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Proxy;

public class DemoApplication {
	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("ApplicationContext.xml");
	}
}
