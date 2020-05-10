package org.movierv.kr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.movierv.kr.service.MemberService;
import org.movierv.kr.service.dao.MemberDAO;
import org.movierv.kr.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberMapper;

	@Override
	@Transactional
	public List<MemberVO> selectMemberList() throws Exception {
		return memberMapper.selectMemberList();
	}

}
