package com.movie.web.admin;

import java.util.ArrayList;

import com.movie.web.grade.GradeBean;
import com.movie.web.grade.GradeMemberBean;
import com.movie.web.member.MemberBean;

public interface AdminDAO {
	public AdminBean selectAdmin(AdminBean admin);
	
}
