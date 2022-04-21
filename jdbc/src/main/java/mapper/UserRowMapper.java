package mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import dto.User;

public class UserRowMapper implements RowMapper<User> {

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new User(
			rs.getString("id"),
			rs.getString("email"),
			rs.getString("password"),
			rs.getString("name")
		);
	}

}
