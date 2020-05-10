package org.movierv.kr.service.dao;

import java.util.List;
import org.movierv.kr.vo.MemberVO;

public interface MemberDAO {
	List<MemberVO> selectMemberList() throws Exception;
}
