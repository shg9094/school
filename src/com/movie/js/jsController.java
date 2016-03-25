package com.movie.js;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import global.Command;
import global.CommandFactory;
import global.DispatcherServlet;
import global.Separator;
import member.MemberBean;

/**
 * Servlet implementation class javascriptController
 */
@WebServlet({"/js/hello.do","/js/bom.do","/js/closure.do","/js/dom.do",
		"/js/form.do","/js/function.do","/js/object.do","../js/operator.do",
		"/js/pattern.do","/js/var.do"})
public class jsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException ,IOException {
		DispatcherServlet.doSomthing(request, response, CommandFactory.createCommand(Separator.extrack(request)[0], Separator.extrack(request)[1]).getView());
	}

}
