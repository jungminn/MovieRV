package org.movierv.kr.service;

import java.util.List;
import org.movierv.kr.vo.ReviewVO;

public interface ReviewService {
	List<ReviewVO> selectReviewList() throws Exception;
}