<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../template/template.jsp">
  <jsp:param value="受注情報｜すぐくる管理システム" name="siteTitle" />
  <jsp:param value="active" name="nav_user_active" />
  <jsp:param name="pageContents">
  	<jsp:attribute name="value">
  		<h1></h1>
  		<div class="well col-lg-6">
		  <p><strong>受注ＩＤ：</strong>A12345</p>
		  <p><strong>企業名/個人名：</strong>株式会社すぐくる</p>
		  <p><strong>担当者名：</strong>たなか</p>
		  <p><strong>価格：</strong>200000</p>
		  <p><strong>納品期限：</strong>2015/11/25</p>
		  <p><strong>納品状況：</strong>済</p>
		  <p><strong>支払い期限：</strong>2015/11/30</p>
		  <p><strong>支払い状況：</strong>未</p>
		  <p class="text-center"><a href="${pageContext.request.contextPath}/admin/order" class="btn btn-primary">Back</a></p>
		</div>
  	</jsp:attribute>
  </jsp:param>
</jsp:include>