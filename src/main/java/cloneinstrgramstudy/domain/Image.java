package cloneinstrgramstudy.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Image {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String caption; //내용 
	private String postImageUrl;
	
	@JsonIgnoreProperties({"images"})
	@ManyToOne // 당연히 기본은 EAGER
	@JoinColumn(name="userId")
	private User user; // 자식이외래키의 주인, 한명의 유저는 여러개의 이미지를 기잘 수 있음
	
	@CreationTimestamp // 자동으로 현재시간 담김
	private Timestamp createDate;
	
	
}
