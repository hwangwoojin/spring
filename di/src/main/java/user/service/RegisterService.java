package user.service;

import java.time.LocalDateTime;

import user.dao.UserDao;
import user.dto.RegisterDto;
import user.dto.UserDto;

public class RegisterService {
	private UserDao userDao;
	
	public RegisterService(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public Long regist(RegisterDto registeredUser) {
		UserDto user = userDao.selectByEmail(registeredUser.getEmail());
		if (user != null) {
			throw new Error("Duplicated Email: " + registeredUser.getEmail());
		}
		String email = registeredUser.getEmail();
		String password = registeredUser.getPassword();
		String name = registeredUser.getName();
		LocalDateTime registerDateTime = LocalDateTime.now();
		UserDto newUser = new UserDto(email, password, name, registerDateTime);
		userDao.insert(newUser);
		return newUser.getId();
	}
}
