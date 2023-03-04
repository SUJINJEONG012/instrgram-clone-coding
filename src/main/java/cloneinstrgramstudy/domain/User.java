package cloneinstrgramstudy.domain;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length =255, unique = true)
	private String username;
	
	@JsonIgnore //json 파싱 불가능하게 아예 막음
	private String password;
	
	private String name; //이름
	
	
	private String website; //자기 홈페이지
	private String bio; // 자기소개 
	private String email;
	private String phone;
	private String gender;
	
	private String profileImage;
	private String provider; //제공자, google, facebook, naver 구분/ provider가 null이면 기본 로그인
	
	private String role; // USER.ADMIN
	
	
	@CreationTimestamp // 자동으로 만든 시간이 들어감
	private Timestamp createDate;


	

	
}
