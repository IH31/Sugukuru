<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="template/template.jsp">
	<jsp:param value="すぐくる|商品詳細" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
    <div class="productDetail">
  		<div class="col-md-4">
        <img src="${pageContext.request.contextPath}/assets/data0/images/productImage/pro_sample.jpg" alt="商品イメージ" title="商品イメージ"/>
      </div>
      <div class="product col-md-8">
        <div class="">
          aaaa
        </div>
      </div>
  	</jsp:attribute>
	</jsp:param>
</jsp:include>