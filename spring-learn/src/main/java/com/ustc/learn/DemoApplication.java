package com.ustc.learn;

import com.ustc.learn.beans.Car;
import com.ustc.learn.beans.MyTestBean;
import com.ustc.learn.factories.CarFactoryBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean", "Construct args in getBean");
		System.out.println(bean.getTestStr());
		CarFactoryBean car = (CarFactoryBean) bf.getBean("&car");
		System.out.println(car);
	}
}
