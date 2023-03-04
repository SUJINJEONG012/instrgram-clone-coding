package cloneinstrgramstudy.controller;

import org.springframework.stereotype.Controller;

import cloneinstrgramstudy.service.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class UserController {

	private final UserService userService;
	
}
