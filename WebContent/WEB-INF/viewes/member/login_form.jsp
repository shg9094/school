<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="<%=request.getContextPath()%>"></c:set>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>
		<h2>로그인</h2>
		<form action="${context}/member/Login.do" name ="frm" value="get">
		<table>
			<tr>
				<td>
					<h3>아이디</h3>
				</td>
				<td>
				 	<input type="text" name="id" value="" autofocus="autofocus" required="required"  />
				</td>
			</tr>
			<tr>
				<td>
					<h3>비밀번호</h3>
				</td>
				<td>
					<input type="password" name="password" value="" autofocus="autofocus" required="required"/>
				</td>
			</tr>
		</table>
		<div>
			<input type="sumit" value:로그인/>
			<input type="reset" value:취소/>
		</div>
	</form>
	</div>
	<div><h4>아이디가 없으면 , 계정 생성 하시오</h4>
		<a href="${context}/member/join_form.do ">회원가입</a>
	</div>
	
</body>
</html>