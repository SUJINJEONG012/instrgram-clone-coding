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
	
	/*
	 * User오브젝트를 받는 toEntity()를 만들어주고 Building
	 * dto가 가지고있는 username,password,email,name 데이터기반으로 한 user객체가 생성
	 * dto가 가지고있는 데이터를 그대로 User오브젝트에 담아서 
	 * return 해주기 때문에 toEntity를 가지고 데이터를 불러오면 된다. 
	 * 
	 * */
	public User toEntity() {
		return User.builder()
				.username(username)
				.password(password)
				.email(email)
				.name(name)
				.build();
	}
}
