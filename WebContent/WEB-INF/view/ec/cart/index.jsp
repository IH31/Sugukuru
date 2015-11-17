<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,sugukuru.model.product.*"%>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/css">
<jsp:include page="../template/template.jsp">
	<jsp:param value="すぐくる" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
	a
	</jsp:attribute>
	</jsp:param>
</jsp:include>