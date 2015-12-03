<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>すぐくる｜ログイン</title>
		<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/sugukuru2.png" type="image/x-icon">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/Registration.css">
        <link href="${pageContext.request.contextPath}/assets/js/validetta/validetta.css" rel="stylesheet" type="text/css" media="screen" >
		<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/validetta/validetta.js"></script>
	</head>
    <body>
        <div class="RegisterTop"><center><a href="${pageContext.request.contextPath}/ec">
        <img src="${pageContext.request.contextPath}/assets/images/sugukuru_logo3.png"></a></center></div>        
        <div class="formStyle">
            <center><br>
                <p class="pp"><b>すぐくる</b>へログイン　　　　　　　　　　　　　　　　　　</p>
            <form id="login-form" action="${pageContext.request.contextPath}/ec/login" method="post">
                <input placeholder="メールアドレス" name="email" data-validetta="required,email" form="login-form"></br>
                <input type="password" placeholder="パスワード" name="password" data-validetta="required" form="login-form"></br>
                <input type="submit" value="ログイン" form="login-form">
            </form>
            </center>
        </div>
        <%
        ArrayList<String> msg = (ArrayList<String>)request.getAttribute("msg");
        if(msg != null) {
        %>	
        <div class="login-success">
        	<% for(String ms : msg) { %>
        	<p><%= ms %></p>
       		<% } %>
        </div>
        <% } %>
        <%
        ArrayList<String> errmsg = (ArrayList<String>)request.getAttribute("errmsg");
        if(errmsg != null) {
        %>	
        <div class="login-err">
        	<% for(String err : errmsg) { %>
        	<p><%= err %></p>
       		<% } %>
        </div>
        <% } %>
       	<script>
    	$(document).ready(function() {
    	    $("#login-form").validetta();
    	});
       	</script>
    </body>
</html>