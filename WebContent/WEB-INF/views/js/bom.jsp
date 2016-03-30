<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="container" style="width: 1000px; margin: 0 auto;">
	<jsp:include page="../global/header.jsp" />
	<div>
		<h3>브라우저 객체</h3>
		<h4>Window</h4>
		<ul>
			<li>[1] 대화창
				<ul>
					<li><a href="#" onclick="javascript:win.alert()">경고창</a></li>
					<li><a href="#" onclick="javascript:win.confirm()">확인창</a></li>
					<li><a href="#" onclick="javascript:win.prompt()">입력창</a></li>
				</ul>
			</li>
			<li>[2] 팝업창
				<ul>
					<li><a href="#" onclick="javascript:win.open()">새창열기</a></li>
					<li>close() : 창닫기</li>
				</ul>
			</li>
		</ul>
		<h4>history 객체</h4>
		<ul>
			<li><a href="#" onclick="javascript:win.f5()">새로고침</a></li>
			<li><a href="#" onclick="javascript:win.goBack()">이전페이지</a></li>
		</ul>
		<h4>location 객체</h4>
		<ul>
			<li><a href="#" onclick="javascript:win.href()">홈으로 이동</a></li>
		</ul>
	</div>
</div>
<script type="text/javascript">
	var win = {
		alert : function() {
			alet('경고 메시만 전달');
		},
		confirm : function() {
			confirm('컴펌창은 확인/취소 버튼 존재');
		},
		prompt : function() {
			prompt('프럼프트 창은 값을 입력하는것이 가능');
		},
		open : function() {
			window.open('${context}/member/login.form.do');
		},
		href : function() {
			location.href('${context}/global/main.do');
		},
		f5 : function() {
			history.go(0);
		},
		goBack : function() {
			history.go(-1);
		},
	}
</script>