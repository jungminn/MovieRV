package org.movierv.kr;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.movierv.kr.service.MemberService;
import org.movierv.kr.vo.MemberVO;
import org.movierv.kr.service.ReviewService;
import org.movierv.kr.vo.ReviewVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Resource(name = "memberService")
	private MemberService memberService;
	
	@Resource(name = "reviewService")
	private ReviewService reviewService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/memberList")
    public String memberList(Model model) throws Exception {

        List<MemberVO> list = memberService.selectMemberList();
        logger.info(list.toString());

        model.addAttribute("list", list);

        return "memberList";
    }
	
	@RequestMapping(value = "/reviewList")
    public String reviewList(Model model) throws Exception {

        List<ReviewVO> list = reviewService.selectReviewList();
        logger.info(list.toString());

        model.addAttribute("list", list);

        return "reviewList";
    }
}
