package com.ustc.learn.aspect;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("aService")
public class AServiceImpl1 implements AService {
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void a() {
		this.b();
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void b() {

	}
}
