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
        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/index.css">
    </head>
<body>
<header class="topMain">
  <div class="logo_img"><img src="${pageContext.request.contextPath}/assets/images/sugukuru_logo3.png"></div>
  <form class="form-wrapper cf">
    <input type="text" placeholder="私が探しているのは…" required>
    <div class="strelka">
      <select name="favourite_sport" size="1">
        <option value="all" selected="selected">全てのカテゴリー </option>
        <option value="gyoumu_youhin">事務用品</option>
        <option value="bunbogu">文房具</option>
        <option value="file">ファイル</option>
        <option value="file">トナー</option>
      </select>
    </div>
  <button type="submit"><img src="${pageContext.request.contextPath}/assets/images/search-kensaku3.png"/></button>
  </form>
  <div class="LogInCart2">
    <a href="#"><img src="${pageContext.request.contextPath}/assets/images/ic_perm_identity_black_24dp.png" class="login"/>
    ログイン</a>
    <a href="#"><img src="${pageContext.request.contextPath}/assets/images/ic_add_shopping_cart_black_24dp.png" class="cart"/>
    カート</a>
  </div>
</header>