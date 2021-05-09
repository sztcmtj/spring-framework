package com.ustc.learn.services;

import com.ustc.learn.po.User;

import java.util.List;

public interface UserService {
	public void save(User user);

	public List<User> getUsers();
}
