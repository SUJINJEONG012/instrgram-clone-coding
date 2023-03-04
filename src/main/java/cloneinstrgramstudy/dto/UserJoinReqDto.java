package cloneinstrgramstudy.dto;

import cloneinstrgramstudy.domain.User;
import lombok.Data;

// 유저 값 받을 DTO
@Data
public class UserJoinReqDto {

	private String username;
	private String password;
	private String email;
	private String name;
	
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(password)
				.email(email)
				.name(name)
				.build();
	}
}
