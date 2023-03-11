//package cloneinstrgramstudy.domain;
//
//import java.sql.Timestamp;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//import org.hibernate.annotations.CreationTimestamp;
//
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//@Entity
//public class Comment {
//
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY)
//	private int id;
//	
//	@Column(length=100, nullable=false)
//	private String content;
//	
//	@ManyToOne
//	@JoinColumn(name="imageId")
//	private Image image;
//	@ManyToOne
//	@JoinColumn(name="userId")
//	private User user;
//	@CreationTimestamp
//	private Timestamp createDate;
//	
//}
