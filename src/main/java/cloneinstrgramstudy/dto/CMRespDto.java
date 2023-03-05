package cloneinstrgramstudy.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//공통응답

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CMRespDto<T> {
	private int statuscode;
	private T data;

}
