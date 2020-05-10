package org.movierv.kr.vo;

import java.util.Date;

public class ReviewVO {
	private int reviewnum;
	private String usermail;
	private String username;
	private String content;
	private int star;
	private String moviecd;
	private int hitcount;
	private Date regdate;
	
	public int getReviewnum() {
		return reviewnum;
	}
	public void setReviewnum(int reviewnum) {
		this.reviewnum = reviewnum;
	}
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public String getMoviecd() {
		return moviecd;
	}
	public void setMoviecd(String moviecd) {
		this.moviecd = moviecd;
	}
	public int getHitcount() {
		return hitcount;
	}
	public void setHitcount(int hitcount) {
		this.hitcount = hitcount;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	@Override
	public String toString() {
		return "ReviewVO [reviewnum=" + reviewnum + ", usermail=" + usermail + ", username=" + username + ", content="
				+ content + ", star=" + star + ", moviecd=" + moviecd + ", hitcount=" + hitcount + ", regdate="
				+ regdate + "]";
	}
}
