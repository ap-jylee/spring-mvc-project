package com.cbnu.sample.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cbnu.sample.entity.Member;
import com.cbnu.sample.mapper.MemberMapper;

@Service
public class MemberService {
	
	private final MemberMapper memberMapper;
	
	public MemberService(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}

	public List<Member> getMembers() {
		return memberMapper.findAll();
	}

	public Member getMember(String id) {
		return memberMapper.findOne(id);
	}

}
