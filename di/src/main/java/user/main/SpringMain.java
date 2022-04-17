package user.main;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppContext;
import user.dto.RegisterDto;
import user.service.ChangePasswordService;
import user.service.RegisterService;

public class SpringMain {
	private static ApplicationContext ctx;
	
	public static void main(String[] args) {
		ctx = new AnnotationConfigApplicationContext(AppContext.class);
		/* ... */
	}
	
	private static void registerUser(String[] args) {
		RegisterService registerService = ctx.getBean("registerService", RegisterService.class);
		RegisterDto register = new RegisterDto(args);
		
		if (!register.isPasswordEqualToConfirmPassword()) {
			/* passwordNotEqualError */
			return;
		}
		
		try {
			registerService.regist(register);
		} catch (Exception e) {
			/* DuplicatedEmailError */
		}
	}
	
	private static void changePassword(String[] args) {
		ChangePasswordService changePasswordService = ctx.getBean("changePasswordService", ChangePasswordService.class);
		
		try {
			changePasswordService.changePassword(args[0], args[1], args[2]);
		} catch (Exception e) {
			/* EmailNotFoundError */
			/* WrongOldPasswordError */
		}
	}
}
