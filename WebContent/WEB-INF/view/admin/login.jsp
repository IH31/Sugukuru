<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ja">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="https://bootswatch.com/lumen/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<title>すぐくる管理システム｜ログインページ</title>
</head>
<body>
<article class="container" style="padding-top: 100px;">
	<div class="jumbotron col-md-6 col-md-offset-3">
	  <h1 style="font-size:3em; font-weight: light;">管理ログイン</h1>
	  <hr />
	  <form action="${pageContext.request.contextPath}/test" class="form-horizontal" method="post">
	  	<fieldset>
	  		<div class="form-group">
   				<label for="inputEmail" class="control-label col-md-2">Email</label>
   				<div class="col-md-10">
   					<input type="text" class="form-control" id="inputEmail"
   						placeholder="メールアドレス" required autofocus>
	  			</div>
	  		</div>
	  		<div class="form-group">
   				<label for="inputPassword" class="control-label col-md-2">Password</label>
   				<div class="col-md-10">
   					<input type="text" class="form-control" id="inputPassword"
   						placeholder="パスワード" required>
	  			</div>
	  		</div>
	  		<div class="form-group">
	  			<div class="col-md-12">
  					<button class="btn btn-lg btn-success col-md-12">ログインする</button>
	  			</div>
	  		</div>
	  	</fieldset>
	  </form>
	</div>
</article>
<footer class="text-center">
	<p>Copyright &copy; 2015 すぐくる.Inc</p>
</footer>