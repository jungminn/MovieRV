package org.movierv.kr.service.dao;

import java.util.List;
import org.movierv.kr.vo.ReviewVO;

public interface ReviewDAO {
	List<ReviewVO> selectReviewList() throws Exception;
}
