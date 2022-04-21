package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import dto.User;
import mapper.UserRowMapper;

public class UserDao {
	private JdbcTemplate jdbcTemplate;
	
	public UserDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public User selectByUser(String email) {
		List<User> results = jdbcTemplate.query(
		    "select * from user where email = ?",
		    new UserRowMapper(),
		    email
		);
		return results.isEmpty() ? null : results.get(0);
	}
	
	public int count() {
		int count = jdbcTemplate.queryForObject(
			"select count(*) from user",
			Integer.class
		);
		return count;
	}
}
