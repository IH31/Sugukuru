<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ProductList.css">
<jsp:include page="../template/template.jsp">
	<jsp:param value="すぐくる" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">

		<div class="sliderSpacePL">
			<%
				/*
				request.getAttribute("product");

				*/
				//商品一覧の行部分
				for(int i=0;i<3;i++){
			%>
			<div class="productsList">
				<%
					for(int j=0;j<3;j++){
				%>
				<div class="productKvadrat">
					<div class="productKvadrat_image">
						<div class="productKvadrat_image"><img src="images/banners/pu-skr_001m.jpg"/></div>
						<div class="productName">サクラ・パンチ LGM-8A 白</div>
						<hr class="productName" /><br/><br/>
						<div class="priceAll"><span class="price">500￥</span><span class="tax">(税込)</span></div>
						<br/>
						<div class="review">
							<span class="fl">レビュー：</span><img src="${pageContext.request.contextPath}/assets/images/stars/3.png" />
						</div>
						<span class="fl2">(15件）</span>
						<div class="numberofOrder">注文数：100</div>
					</div>
				</div>
				<%
					}
				%>
				<div class="productKvadratRastoyaniye"></div>
			</div>
			<%
				}
			%>
		</div>

		<div class="NumperOfPage"></div>
		<br/><br/><br/>
		<div class="productListFutter">
			<hr /><br/>
			<center>Copyright 2015 &copy; All Rights Reserved.</center>
		</div>

		<div class="dveKartinkiSprava">
			<!--img class="oneBanner" src="images/banners/91434.jpg"/-->
		</div>

	</div>
	</jsp:attribute>
	</jsp:param>
</jsp:include>