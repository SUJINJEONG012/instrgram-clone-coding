package cloneinstrgramstudy.repository;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import cloneinstrgramstudy.domain.Follow;


public interface FollowRepository extends JpaRepository<Follow, Integer> {

	@Transactional // javax 의 트랜잭션, 서비스에서는 프레임워크
	
	@Query(value = "INSERT INTO Follow(fromUserId, toUserId, createDate) VALUES(?1fromUserId, ?2toUserId,now())", nativeQuery = true)
	int mFollow(int fromUserId, int toUserId); // prepareStatement updateQuery() => -1, 0, 1 응답의 결과 그래서 int로 받기

	
}
