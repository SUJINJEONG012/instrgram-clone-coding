package cloneinstrgramstudy.dto;

import org.springframework.web.multipart.MultipartFile;

import cloneinstrgramstudy.domain.Image;
import cloneinstrgramstudy.domain.User;
import lombok.Data;

@Data
public class ImageReqDto {
	private MultipartFile file;
	private String caption;
	private String tags;
	
	public Image toEntity(String postImageUrl, User userEntity) {
		
		return Image.builder()
				.caption(caption)
				.postImageUrl(postImageUrl)
				.user(userEntity)
				.build();
	}
}
