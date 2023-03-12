package cloneinstrgramstudy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cloneinstrgramstudy.repository.FollowRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class FollowService {

	@Autowired
	private FollowRepository followRepository;
	
	@Transactional
	public int 팔로우(int fromUserId, int toUserId) {
		return followRepository.mFollow(fromUserId, toUserId);
	}
}
