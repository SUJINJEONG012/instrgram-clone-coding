package cloneinstrgramstudy.service;

import org.springframework.stereotype.Service;

import cloneinstrgramstudy.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

	private final UserRepository userRepository;
	
	
	
}
