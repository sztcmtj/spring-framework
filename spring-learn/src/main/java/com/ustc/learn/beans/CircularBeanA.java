package com.ustc.learn.beans;

public class CircularBeanA {
	private CircularBeanB b;

	public void setB(CircularBeanB b) {
		this.b = b;
	}
}
