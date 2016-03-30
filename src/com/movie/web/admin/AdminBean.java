package com.movie.web.admin;

import com.movie.web.MemberBean;

public class AdminBean extends MemberBean{
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
}