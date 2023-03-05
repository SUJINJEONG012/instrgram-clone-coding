package cloneinstrgramstudy.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import cloneinstrgramstudy.config.auth.PrincipalDetails;
import cloneinstrgramstudy.dto.ImageReqDto;
import cloneinstrgramstudy.service.ImageService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ImageController {
	
	private final ImageService imageService;
	
	
	@PostMapping("/image")
	public String image(ImageReqDto imageReqDto, @AuthenticationPrincipal PrincipalDetails principalDetails) {
		//imageService.사진업로드(imageReqDto,principalDetails);
		System.out.println("ddddddd ?????");
		return "redirect:user/"+principalDetails.getUser().getId();
	}
	
	
}
