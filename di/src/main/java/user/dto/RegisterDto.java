package user.dto;

public class RegisterDto {
	private String email;
	private String password;
	private String confirmPassword;
	private String name;
	
	public RegisterDto(String[] args) {
		email = args[0];
		password = args[1];
		confirmPassword = args[2];
		name = args[3];
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return name;
	}
	
	public boolean isPasswordEqualToConfirmPassword() {
		return password.equals(confirmPassword);
	}
}
