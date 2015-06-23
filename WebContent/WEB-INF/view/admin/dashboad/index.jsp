<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../template/template.jsp">
  <jsp:param value="ログインページ" name="siteTitle" />
  <jsp:param name="pageContents">
  	<jsp:attribute name="value">
  		<p>ログインしました</p>
  	</jsp:attribute>
  </jsp:param>
</jsp:include>