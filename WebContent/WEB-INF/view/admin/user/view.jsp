<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../template/template.jsp">
  <jsp:param value="ユーザ情報" name="siteTitle" />
  <jsp:param value="active" name="nav_user_active" />
  <jsp:param name="pageContents">
  	<jsp:attribute name="value">
  		<h1>ユーザ情報</h1>
  		<div class="well col-lg-6">
		  <p><strong>ユーザＩＤ：</strong>A12345</p>
		  <p><strong>企業名：</strong>株式会社すぐくる</p>
		  <p><strong>担当者名：</strong>たなか</p>
		  <p><strong>電話番号：</strong>03-3333-3333</p>
		  <p><strong>メールアドレス：</strong>sugukuru@hal.ac.jp</p>
		  <p><strong>最終取引：</strong>2015/06/25</p>
		  <p class="text-center"><a href="" class="btn btn-primary">Back</a></p>
		</div>
  	</jsp:attribute>
  </jsp:param>
</jsp:include>