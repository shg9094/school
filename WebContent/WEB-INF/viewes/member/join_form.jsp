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
	회원가입 폼
	<table>
		<tr>
			<td>
				<h2>아이디</h2>
			</td>
			<td>
				<input type="text" />
			</td>
		</tr>
		<tr>
			<td>
				<h2>비밀번호</h2>
			</td>
			<td>
				<input type="password" />
			</td>
		</tr>
		<tr>
			<td>
				<h2>비밀번호 확인</h2>
			</td>
			<td>
				<<input type="password" />
			</td>
		</tr>
		<tr>
			<td>
				<h2>이름</h2>
			</td>
			<td>
				<input type="text" />
			</td>
		</tr>
		<tr>
			<td>
				<h2>주소</h2>
			</td>
			<td>
				<input type="text" />
			</td>
		</tr>
		<tr>
			<td>
				<h2>생년월일</h2>
			</td>
			<td>
				<input type="text" />
			</td>
		</tr>
	</table>
	<div>
			<input type="button" value:확인/>
	</div>
	<div>
			<input type="button" value:취소/>
	</div>
</body>
</html>