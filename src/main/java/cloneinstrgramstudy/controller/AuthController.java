package cloneinstrgramstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cloneinstrgramstudy.dto.UserJoinReqDto;
import cloneinstrgramstudy.service.AuthService;
import cloneinstrgramstudy.utils.Script;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/auth")
public class AuthController {

	private final AuthService authService;
	
//	@GetMapping("/login")
//	public String loginForm() {
//		return "auth/loginForm";
//	}
	
	@GetMapping("/join")
	public String joinForm() {
		return "auth/joinForm";
	}
	
	//회원가입 
	//회원가입할 때 비밀번호 해쉬해야함
	@PostMapping("/join")
	public @ResponseBody String join(UserJoinReqDto userJoinReqDto){
	   authService.join(userJoinReqDto.toEntity());
	   return Script.href("성공 ", "/auth/loginForm");
	}
	
}
