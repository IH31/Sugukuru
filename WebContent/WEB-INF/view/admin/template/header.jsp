<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script src="http://code.jquery.com/jquery-latest.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://bootswatch.com/lumen/bootstrap.min.css">
	<title>${param.siteTitle}</title>
</head>
<body>
<header>
	<nav class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
	            <a href="${pageContext.request.contextPath}/admin" class="navbar-brand">すぐくる管理システム</a>
	        </div>
	        <div id="navbar" class="navbar-collapse collapse">
	          <ul class="nav navbar-nav">
	            <li class="${param.nav_user_active} dropdown">
	            	<a href="#" class="dropdown-toggle" data-toggle="dropdown" id="dropdownMenu1">顧客管理<b class="caret"></b></a>
	            	<ul class="dropdown-menu" aria-labelledby="dropdownMenu1">
	            		<li><a href="#">新規法人登録</a></li>
	            		<li class="divider"></li>
	                	<li><a href="${pageContext.request.contextPath}/admin/customer">法人顧客一覧</a></li>
	                	<li><a href="${pageContext.request.contextPath}/admin/consumer">個人顧客一覧</a></li>
	                </ul>
	            </li>
	            <li class="${param.nav_product_active}"><a href="#about">商品管理</a></li>
	            <li class="${param.nav__active}"><a href="#contact">#####</a></li>
	            <li class="${param.nav__active}"><a href="#contact">#####</a></li>
	            <li class="${param.nav__active}"><a href="#contact">#####</a></li>
	          </ul>
	          <ul class="nav navbar-nav navbar-right">
	            <li><a href="#">ログアウト</a></li>
	          </ul>
        	</div>
		</div>
	</nav>
</header>
<article class="container">