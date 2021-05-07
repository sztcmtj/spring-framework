package com.ustc.learn.beans;

import com.ustc.learn.services.UserService;

public class TestBeanJdk implements UserService {
	@Override
	public void add() {
		System.out.println("Jdk Proxy");
	}
}
