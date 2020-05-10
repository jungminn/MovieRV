package org.movierv.kr.vo;

public class MemberVO {
	private String usermail;
	private String userpwd;
	private String username;
	private String originalfile;
	private String savedfile;
	public String getUsermail() {
		return usermail;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public String getUserpwd() {
		return userpwd;
	}
	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getOriginalfile() {
		return originalfile;
	}
	public void setOriginalfile(String originalfile) {
		this.originalfile = originalfile;
	}
	public String getSavedfile() {
		return savedfile;
	}
	public void setSavedfile(String savedfile) {
		this.savedfile = savedfile;
	}
	@Override
	public String toString() {
		return "MemberVO [usermail=" + usermail + ", userpwd=" + userpwd + ", username=" + username + ", originalfile="
				+ originalfile + ", savedfile=" + savedfile + "]";
	}
}
