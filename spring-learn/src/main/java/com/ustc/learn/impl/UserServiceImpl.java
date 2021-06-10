package com.ustc.learn.impl;

import com.ustc.learn.po.User;
import com.ustc.learn.services.UserService;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.sql.Types;

public class UserServiceImpl implements UserService {
	private JdbcTemplate jdbcTemplate;

	// 设置数据源
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void save(User user) {
		jdbcTemplate.update("insert into user(name, age, sex)values(?, ?, ?)",
				new Object[]{user.getName(), user.getAge(), user.getSex()},
						new int[] {Types.VARCHAR, Types.INTEGER, Types.VARCHAR});
		// 事务测试，加上这句代码则数据不会保存到数据库中
		throw new RuntimeException("aa");
	}
}
