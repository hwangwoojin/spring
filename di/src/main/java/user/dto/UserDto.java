package user.dto;

import java.time.LocalDateTime;

public class UserDto {
	private long id;
	private String email;
	private String password;
	private String name;
	private LocalDateTime registerDateTime;
	
	public UserDto(String email, String password, String name, LocalDateTime registerDateTime) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.registerDateTime = registerDateTime;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void changePassword(String oldPassword, String newPassword) {
		if (!oldPassword.equals(password)) {
			throw new Error("WrongPasswordException");
		}
	}
}
