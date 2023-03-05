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
			System.out.println(" 어떤이름으로로그인 : " + principal);
			System.out.println(" 어떤이름으로로그인 : " + username);
			return new PrincipalDetails(principal); //리턴시에 SecuriryContextHolder 폴더 내 Authentication 객체 내부에 담김
		}
	}
	/* UserDetailsService가 이미 Ioc에 등록되어있는데 Ioc는 싱클톤 패턴이라서 
	 * PrincipalDetailsService을 띄우면중복이 되는데 뒤에거는 갈아 엎어버린다.
	 */

}
