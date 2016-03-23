<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
	<meta charset=UTF-8" />
	<title>404에러</title>
</head>
<body>
	<!--
	Http프로토콜은  응답상태의 코드를 이용하여
	서버의 처리 결과를 알려주며,
	주요 응답상태코드로는 다음과 같은 것들이 존재
	200-ok
	400-문법에러
	401-접근불가(관리자만 가능)
	404-url에 따른 페이지존재하지 않음
	405-요청된 메서드는 허용 불가(GET/POST방식일때)
	500-서버 내부 에러...jsp에서 Exception발생
	503- 거버부하 예)디도스
	JSP가 정상적으로 실행되는 응답코드로는 200이 전송
	-->
	<div>
		<img src="${context }/img/error/error404.jpg"alt="404에러"/>
	</div>
</body>
</html>