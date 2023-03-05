package cloneinstrgramstudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import cloneinstrgramstudy.domain.Follow;

public interface FollowRepository extends JpaRepository<Follow, Integer> {
	// insert, delete(Transational 을 붙여줘야함)
	// update (Modifying을 써줘야함)
	
	//@Modifying
	@Modifying
	@Query(value="INSERT INTO follow(fromUserId, toUserId, createDate) VALUES(:fromUserId, :toUserId,now())", nativeQuery = true)
	 int mFollow(int fromUserId, int toUserId);
}
