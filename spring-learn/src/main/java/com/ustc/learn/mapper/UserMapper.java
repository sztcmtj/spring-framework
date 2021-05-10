package com.ustc.learn.mapper;

import com.ustc.learn.po.User;

public interface UserMapper {
	public void insertUser(User user);
	public User getUser(Integer id);
}
