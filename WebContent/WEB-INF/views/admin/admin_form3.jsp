<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="../global/header.jsp"/>
<div id="parent"style="background-color:yellow;width:500px;height:500px;">
	<div id = "son1">this예제</div>
	<div id = "son1">parent()예제</div>
	<div id = "son1">sibling()예제</div>
</div>
<script>
	$ (function() {
		$('parent')
		$('son1').css('background-color','red');
		$('son2').css('background-color','yellow').css('width','100px').css('height','100px');
		$('son3').css('background-color','yellow').css('width','100px').css('height','100px');
		$('son4').css('background-color','yellow').css('width','100px').css('height','100px');
		$('#son1').click(function() {
			$(this).css('background-color','red');
		});
		$('#son2').click(function() {
			$(this).parent().css('background-color','red');
		});
		$('#son3').click(function() {
			$(this).siblings().css('background-color','red');
		});
	});
</script>