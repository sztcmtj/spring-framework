package com.ustc.learn.services;

import com.ustc.learn.po.User;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)
public interface UserService {
	public void save(User user) throws Exception ;
}
