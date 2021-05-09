package com.ustc.learn.mapper;

import com.ustc.learn.po.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User person = new User(rs.getInt("id"), rs.getString("name"),
				rs.getInt("age"), rs.getString("sex"));
		return person;
	}
}
