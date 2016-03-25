<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>성적관리 페이지</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
	<link rel="stylesheet" href="${context}/css/global.css" type="text/css " />
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
</head>
<body>
<header style="whidth: 100%;margin: 0 auto">
<nav class="navbar navbar-inverse">
	<div class="container-fluid">
	
		
		<div>
			
		</div>
	</div>
</nav>
 <h3 style="color: white; text-align: center"></h3>
		<a href="${context}/global/main.do">한빛 성적 관리</a>
<ul class="nav nav-pills">

  <li role="presentation" class="dropdown" style="margin-left:100px">
    <a class="dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
      자바스크립트 <span class="caret"></span>
    </a>
    <ul class="dropdown-menu">
    
    </ul>
    <ul class ="dropdown-menu">
    	<li><a href="${context}/javascript/hello.do">자바스크립트 소개</a></li>
    	<li><a href="${context}/javascript/var.do">변수</a></li>
    	<li><a href="${context}/javascript/oprerator.do">연산자</a></li>
    	<li><a href="${context}/javascript/function.do">함수</a></li>
    	<li><a href="${context}/javascript/object.do">객체</a></li>
    	<li><a href="${context}/javascript/bom.do">BOM</a></li>
    	<li><a href="${context}/javascript/dom.do">DOM</a></li>
    	<li><a href="${context}/javascript/form.do">form 태그</a></li>
    	<li><a href="${context}/javascript/closure.do">클로제</a></li>
    	<li><a href="${context}/javascript/pattern.do">패턴</a></li>
     </ul>
  </li>
</ul>
</header>
