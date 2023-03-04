package cloneinstrgramstudy.config.auth;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import cloneinstrgramstudy.domain.User;
import lombok.Data;

@Data
public class PrincipalDetails implements UserDetails {
	
	private static final long serialVersionUID = 1L;
	private User user;
	
	public PrincipalDetails(User user) {
		this.user = user;
	}
	
	public PrincipalDetails(User user, Map<String, Object> attributes) {
		this.user = user;
		
	}
	
	

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {	
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {	
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
        //해당 User의 권한을 리턴하는 곳 getRole을 바로 return 할수 없음
		Collection<GrantedAuthority> collectors = new ArrayList<>(); // 자바 유틸꺼임, collectors에 권한을 넣어줘야함
		collectors.add(()-> "USER_"+ user.getRole().toString()); // collectors 에 리턴되서 들어간다.
		//컬렉터에 GrantedAuthority타입을 넣어줘야한다.
  

		
		return collectors;
	}
	
	
}
