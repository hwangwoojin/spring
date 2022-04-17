package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import user.dao.UserDao;
import user.service.ChangePasswordService;
import user.service.RegisterService;

@Configuration
public class AppContext {
	
	@Bean
	public UserDao userDao() {
		return new UserDao();
	}
	
	@Bean
	public RegisterService registerService() {
		return new RegisterService(userDao());
	}
	
	@Bean
	public ChangePasswordService changePasswordService() {
		ChangePasswordService changePasswordService = new ChangePasswordService();
		changePasswordService.setUserDao(userDao());
		return changePasswordService;
	}
}
