package user.dao;

import java.util.HashMap;
import java.util.Map;

import user.dto.UserDto;

public class UserDao {
	
	private long nextId = 0;
	
	private Map<String, UserDto> map = new HashMap<>();
	
	public UserDto selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(UserDto userDto) {
		userDto.setId(++nextId);
		map.put(userDto.getEmail(), userDto);
	}
	
	public void update(UserDto userDto) {
		map.put(userDto.getEmail(), userDto);
	}
}
