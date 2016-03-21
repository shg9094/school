<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="context" value="<%=request.getContextPath()%>"></c:set>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="UTF-8" />
	<title></title>
</head>
<body>
	<table>
	<tr>
			<td></td>
			<td>
				<h2>로그아웃</h2>
			</td>
			<td>
				<input type="submit" name=id value="" <a href="index.jsp"></a>/>	
			</td>
	</table>
	<table>
		<tr>
			<td rowspan="4"></td>
			<td>
				<h2>아이디</h2>
			</td>
			<td>
				<input type="text" name=id value="" />	
			</td>
		</tr>
		<tr>
			<td>
				<h2>이름</h2>
			</td>
			<td>
				<input type="text" name=name value="" />	
			</td>
		</tr>
		<tr>
			<td>
				<h2>비밀번호</h2>
			</td>
			<td>
				<input type="password" name=password value="" />	
			</td>
		</tr>
		<tr>
			<td>
				<h2>주소</h2>
			</td>
			<td>
				<input type="text" name=addr value="" />	
			</td>
		</tr>
		<tr>
			<td>
				<input type="button" name = "file" value="" />
			</td>
			<td>
				<h2>생년월일</h2>
			</td>
			<td>
				<input type="date" name=birth value="" />	
			</td>
		</tr>
	</table>
</body>
</html>  