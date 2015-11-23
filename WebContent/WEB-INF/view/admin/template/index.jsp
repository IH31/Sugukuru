<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="./template.jsp">
  <jsp:param value="ログインページ" name="siteTitle" />
  <jsp:param name="pageContents">
  	<jsp:attribute name="value">
  		<h1>ログイン</h1>
  	</jsp:attribute>
  </jsp:param>
</jsp:include>