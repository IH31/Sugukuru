<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,sugukuru.model.product.*,sugukuru.cart.*"%>
<jsp:include page="../template2/template.jsp">
	<jsp:param value="すぐくる｜注文完了" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
		<div class="cart-content">
		  <div class="cart-title">
		    <p>注文完了</p>
		  </div>
		  <div class="cart-item-list">
			  <h2>注文が完了致しました！</h2>
		  </div>
		</div>
	</jsp:attribute>
	</jsp:param>
</jsp:include>