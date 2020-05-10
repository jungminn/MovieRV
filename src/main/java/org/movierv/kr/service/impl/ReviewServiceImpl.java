package org.movierv.kr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import org.movierv.kr.service.ReviewService;
import org.movierv.kr.service.dao.ReviewDAO;
import org.movierv.kr.vo.ReviewVO;

@Service("reviewService")
public class ReviewServiceImpl implements ReviewService {
	@Autowired
	private ReviewDAO reviewMapper;

	@Override
	@Transactional
	public List<ReviewVO> selectReviewList() throws Exception {
		return reviewMapper.selectReviewList();
	}

}
