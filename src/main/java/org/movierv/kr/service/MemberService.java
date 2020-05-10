package org.movierv.kr.service;

import java.util.List;
import org.movierv.kr.vo.MemberVO;

public interface MemberService {
	List<MemberVO> selectMemberList() throws Exception;
}