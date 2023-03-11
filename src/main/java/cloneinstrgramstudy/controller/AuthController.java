package cloneinstrgramstudy.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cloneinstrgramstudy.domain.User;
import cloneinstrgramstudy.dto.UserJoinReqDto;
import cloneinstrgramstudy.service.AuthService;
import cloneinstrgramstudy.utils.Script;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/auth")
public class AuthController {

	private static final Logger log = LoggerFactory.getLogger(AuthController.class);
	
	private final AuthService authService;
	
	@GetMapping("/login")
	public String loginForm() {
		return "/auth/loginForm";
	}
	
	@GetMapping("/join")
	public String joinForm() {
		return "/auth/joinForm";
	}
	
	//회원가입 
	//회원가입할 때 비밀번호 해쉬해야함
	@PostMapping("/join")
	public @ResponseBody String join(UserJoinReqDto userJoinReqDto){
	    // 로그로 내가입력한 값 확인해보기
		log.info(userJoinReqDto.toString());
	    
	    // User Object에 userJoinReqDto데이터를 삽입
		// User Objectdp userJoinReqDto에서 방금 만들었던 toEntity데이터를 넣는다.
		
		User user = userJoinReqDto.toEntity();
		log.info("user.toEntity : " + user.toString());
		
		
		//회원가입 저장 로직
		// authService.join(userJoinReqDto.toEntity());
		authService.join(user);
		
	  
	   return Script.href("성공 ", "/auth/login");
	}
	
}
