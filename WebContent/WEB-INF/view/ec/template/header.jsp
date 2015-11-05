<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <title>${param.siteTitle}</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/sugukuru2.png" type="image/x-icon">
        <meta name="description" content="Интерактивное руководство по началу работы в Brackets.">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/TopPage.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/SearchBox.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/MenuListAndSlider.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/PopUpKireiMatomeTry.css">
    
	<!-- Start WOWSlider.com HEAD section --> <!-- add to the <head> of your page -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/assets/engine0/style.css" />
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/engine0/jquery.js"></script>
	<!-- End WOWSlider.com HEAD section --></head>
    <body>
    <div class="topUnderTop">dff</div>
        <div class="topMain"><div class="logo_img"><img src="${pageContext.request.contextPath}/assets/images/sugukuru_logo3.png"></div>
        <form class="form-wrapper cf">
            <input type="text" placeholder="私は探しているのは…" required>
            
                <div class="strelka">            
            <select name="favourite_sport" size="1">


                <option value="all" selected="selected">全てのカテゴリー </option>
                <option value="gyoumu_youhin">事務用品</option>
                <option value="bunbogu">文房具</option>
                <option value="file">ファイル</option>
                <option value="file">トナー</option>
                
            </select>
            </div>
            <button type="submit"><img src="${pageContext.request.contextPath}/assets/images/search-kensaku3.png"/><!--検索--></button>
        </form>
            <div class="LoginAndCart">
                <table>
                    <td><img src="${pageContext.request.contextPath}/assets/images/user-alt-128_3.png"/><p><b><a href="${pageContext.request.contextPath}/ec/login">ログイン</a></b> | <a href="${pageContext.request.contextPath}/ec/register">登録</a></p></td>
                    <td><img src="${pageContext.request.contextPath}/assets/images/1072768_color2.png"/><p><a href="#">カート</a></p></td>
                </table>
        </div>
    </div>