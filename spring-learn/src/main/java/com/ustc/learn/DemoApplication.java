package com.ustc.learn;

import com.ustc.learn.beans.Car;
import com.ustc.learn.beans.CircularBeanA;
import com.ustc.learn.beans.MyTestBean;
import com.ustc.learn.factories.CarFactoryBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean", "Construct args in getBean");
		System.out.println(bean.getTestStr());
		CircularBeanA ca = (CircularBeanA) bf.getBean("circularBeanA");
		System.out.println(ca);
	}
}
