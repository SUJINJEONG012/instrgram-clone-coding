package cloneinstrgramstudy.service;

import javax.transaction.Transactional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import cloneinstrgramstudy.domain.User;

import cloneinstrgramstudy.repository.UserRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AuthService {

	private final UserRepository userRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Transactional
	public void join(User user) {
		
		String rawPassword = user.getPassword();
		String encPassword = bCryptPasswordEncoder.encode(rawPassword);
		
		System.out.print("encPassword !!!!!:::::::" + encPassword);
		user.setPassword(encPassword);
		user.setRole("USER");
		userRepository.save(user);		
	}
	
}
