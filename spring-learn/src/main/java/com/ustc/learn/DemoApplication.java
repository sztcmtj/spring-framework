package com.ustc.learn;

import com.ustc.learn.beans.MyTestBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		System.out.println(bean.getTestStr());
	}
}
