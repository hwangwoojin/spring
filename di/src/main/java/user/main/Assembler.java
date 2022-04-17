package user.main;

import user.dao.UserDao;
import user.service.ChangePasswordService;
import user.service.RegisterService;

public class Assembler {
	private UserDao userDao;
	private RegisterService registerService;
	private ChangePasswordService changePasswordService;
	
	public Assembler() {
		userDao = new UserDao();
		registerService = new RegisterService(userDao);
	    changePasswordService = new ChangePasswordService();
	    changePasswordService.setUserDao(userDao);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public RegisterService getRegisterService() {
		return registerService;
	}

	public ChangePasswordService getChangePasswordService() {
		return changePasswordService;
	}
}
