<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"></jsp:include>
<div class="mg_auto"style="width:1000px">
<body>
	회원가입 폼
	<form action="${context}/member/login.do" >
	<table>
		<tr>
			<td>
				<h2>아이디</h2>
			</td>
			<td>
				<input type="text" autofocus="autofocus" required="required"/>
			</td>
		</tr>
		<tr>
			<td>
				<h2>비밀번호</h2>
			</td>
			<td>
				<input type="password"autofocus="autofocus" required="required"/>
			</td>
		</tr>
		<tr>
			<td>
				<h2>비밀번호 확인</h2>
			</td>
			<td>
				<input type="password" autofocus="autofocus" required="required"/>
			</td>
		</tr>
		<tr>
			<td>
				<h2>이름</h2>
			</td>
			<td>
				<input type="text" autofocus="autofocus" required="required"/>
			</td>
		</tr>
		<tr>
			<td>
				<h2>주소</h2>
			</td>
			<td>
				<input type="text" autofocus="autofocus" required="required"/>
			</td>
		</tr>
		<tr>
			<td>
				<h2>생년월일</h2>
			</td>
			<td>
				<input type="text" autofocus="autofocus" required="required"/>
			</td>
		</tr>
		</table>
	
	<div>
			<input type="submit" value = "확인"/>
			<input type="reset" value = "취소"/>
	</div>
	</form>
	<form action="${context}/global/main.do">
      <input type="submit" value="홈으로" />
   </form>
   </body>
</div>
<jsp:include page="../global/footer.jsp"/>
</html>