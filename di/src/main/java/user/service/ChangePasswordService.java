package user.service;

import user.dao.UserDao;
import user.dto.UserDto;

public class ChangePasswordService {
	private UserDao userDao;
	
	public void changePassword(String email, String oldPassword, String newPassword) {
		UserDto user = userDao.selectByEmail(email);
		if (user == null) {
			throw new Error("UserNotFoundException");
		}
		user.changePassword(oldPassword, newPassword);
		userDao.update(user);
	}
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
