<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link rel="stylesheet" href="https://bootswatch.com/lumen/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/productDetail.css">
<jsp:include page="template/template.jsp">
	<jsp:param value="すぐくる|商品詳細" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
		    <div class="productDetail col-md-12">
		  		<div class="productImage col-md-4">
		        	<img src="${pageContext.request.contextPath}/assets/images/productImage/pro_sample.jpg" alt="商品イメージ" title="商品イメージ"/>
		        	<div>
		        		title
		        	</div>
		     	</div>
		      	<div class="product col-md-8">
		        	<div class="">
		          		<h2>商品名</h2>
		          		<label>販売価格：</label>
		        	</div>
		        	<div>
		        	</div>
		      	</div>
		    </div>
	   </div>
  	</jsp:attribute>
	</jsp:param>
</jsp:include>