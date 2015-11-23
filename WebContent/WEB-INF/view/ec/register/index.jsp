<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,sugukuru.model.product.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>すぐくる｜登録</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/sugukuru2.png" type="image/x-icon">
        <meta name="description" content="Интерактивное руководство по началу работы в Brackets.">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/TopPage.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/Registration.css">
    
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/engine0/style.css" />
	</head>
    <body>
        <div class="RegisterTop"><center><img src="${pageContext.request.contextPath}/assets/images/sugukuru_logo3.png"></center></div>
        <div class="formStyle">
            <center><br>
                <p class="pp"><b>すぐくる</b>をはじめよう　　　　　　　　　　　　　　　　　　</p>
            <form id="data">
                <input placeholder="名字" name="family_name" form="data"></br>
                <input placeholder="名前" name="first_name" form="data"></br>
                <input placeholder="電子メール" name="email" form="data"></br>
                <input type="password" placeholder="パスワード" name="password" form="data"></br>
                <input type="password" placeholder="パスワードの確認" name="password_check" form="data"></br>
                <input type="submit" value="新規登録" form="data"></p>
                <div class="policy">

                    アカウントを登録すると、利用規約とクッキーの利用を含むプライバシーポリシーに同意したものとみなされます。他のユーザーはメールアドレスまた                       は電話番号からあなたを探すことができます。
</div>
            </form>
            </center>
        </div>
    </body>
</html>