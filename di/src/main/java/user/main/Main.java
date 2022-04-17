package user.main;

import user.dto.RegisterDto;
import user.service.ChangePasswordService;
import user.service.RegisterService;

public class Main {
	private static Assembler assembler = new Assembler();
	
	public static void main(String[] args) {
		/* ... */
	}
	
	private static void registerUser(String[] args) {
		RegisterService registerService = assembler.getRegisterService();
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
		ChangePasswordService changePasswordService = assembler.getChangePasswordService();
		
		try {
			changePasswordService.changePassword(args[0], args[1], args[2]);
		} catch (Exception e) {
			/* EmailNotFoundError */
			/* WrongOldPasswordError */
		}
	}
}
