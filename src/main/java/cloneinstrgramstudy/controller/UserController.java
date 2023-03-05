package cloneinstrgramstudy.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cloneinstrgramstudy.config.auth.PrincipalDetails;
import cloneinstrgramstudy.domain.User;
import cloneinstrgramstudy.dto.CMRespDto;
import cloneinstrgramstudy.service.FollowService;
import cloneinstrgramstudy.service.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {

	private final UserService userService;
	private final FollowService followService;
	

		@PutMapping("/user/{id}")
		public @ResponseBody CMRespDto<?> profileUpdate(@PathVariable int id, User user, @AuthenticationPrincipal PrincipalDetails principalDetails){
			System.out.println(user);
			User userEntity = userService.회원수정(id, user);
			principalDetails.setUser(userEntity);
			return new CMRespDto<>(1, null);
		}	
	
}
