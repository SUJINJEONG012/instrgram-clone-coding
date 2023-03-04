package cloneinstrgramstudy.config.auth;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cloneinstrgramstudy.domain.User;
import cloneinstrgramstudy.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class PrincipalDetailsService implements UserDetailsService {

	private final UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("로그인 진행중");
		
		User principal = userRepository.findByUsername(username);
		
		if (principal == null) {			
			return null;
		} else {
			return new PrincipalDetails(principal); //리턴시에 SecuriryContextHolder 폴더 내 Authentication 객체 내부에 담김
		}
	}
}
