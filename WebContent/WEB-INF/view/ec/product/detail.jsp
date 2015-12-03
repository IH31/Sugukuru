<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="sugukuru.model.product.*" %>
<jsp:include page="../template2/template.jsp">
	<jsp:param value="すぐくる｜商品詳細" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
		<div class="product-detail">
		<%
		Product product = (Product)request.getAttribute("product");
		if(product != null) {
		%>
			<div class="product-detail-imgGroup">
				<div class="detail-img">
					<img src="${pageContext.request.contextPath}/assets/images/products/<%= product.getProduct_id() %>.jpg"
						alt="<%= product.getProduct_name() %>">
				</div>
				<div class="detail-name">
					<div class="name-label">
						<h2><%= product.getProduct_name() %></h2>
					</div>
					<div class="price-label">
						<p>販売価格(税込)	<span class="price-red">￥<%= product.getPrice() %></span></p>
					</div>
					<div class="date-label">
						<p>在庫：あり</p>
						<p>お届け日：最短３日でお届けします。</p>
					</div>
				</div>
				<div class="detail-cart">
					<div class="cart-form">
						<form action="${pageContext.request.contextPath}/ec/detail" method="get">
							<fieldset>
								<div class="cart-label-group">
									<label>数量 :</label><input type="text" name="cartAddNum" value="1">
									<input type="hidden" name="cartAddId" value="<%= product.getProduct_id() %>">
								</div>
								<button type="submit">カートに入れる</button>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
			
			<div class="product-detail-descriptionGroup">
				<h2><%= product.getProduct_name() %>の商品情報</h2>
				<div class="detail-table">
					<table>
						<tbody>
							<tr>
								<th>商品の特徴</th><td>ここには商品の特徴が入ります。</td>
							</tr>
							<tr>
								<th>商品の主な仕様</th><td>ここには商品の主な仕様が入ります。</td>
							</tr>
							<tr>
								<th>JANコード</th><td>ここにはJANコードが入ります。</td>
							</tr>
							<tr>
								<th>備考</th><td>ここには備考が入ります。</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		<%
		} else {
		%>
		<h2>商品がありません...</h2>
		<%
		}
		%>
		</div>
  	</jsp:attribute>
	</jsp:param>
</jsp:include>