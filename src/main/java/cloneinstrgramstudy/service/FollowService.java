package cloneinstrgramstudy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cloneinstrgramstudy.repository.FollowRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FollowService {

	private final FollowRepository followRepository;
	
	@Transactional
	public int 팔로우(int fromUserId, int toUserId) {
		return followRepository.mFollow(fromUserId, toUserId);
	}
}
