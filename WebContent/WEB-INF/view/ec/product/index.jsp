<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,sugukuru.model.product.*"%>
<jsp:include page="../template/template.jsp">
	<jsp:param value="すぐくる" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
	
	<div class="product-list">
	<%
	ArrayList<Product> products = (ArrayList<Product>)request.getAttribute("products");
	if(products != null && products.size() > 0) {
		for(int idx = 0; idx < products.size(); idx++) {
			Product product = products.get(idx);
	%>
        <% if(idx % 3 == 0) { %>
        <div class="product-list-row">
        <% } %>
          <a href="${pageContext.request.contextPath}/ec/detail?id=<%= product.getProduct_id() %>">
            <div class="product-list-contents">
              <div class="product-img">
                <img src="${pageContext.request.contextPath}/assets/images/products/<%= product.getProduct_id() %>.jpg" alt="productImg">
              </div>
              <div class="product-name">
                <p><%= product.getProduct_name() %></p>
              </div>
              <div class="product-price">
                <p>¥<%= product.getPrice() %>(税込)</p>
              </div>
            </div>
          </a>
        <% if(idx % 3 == 0) { %>
        </div>
        <% } %>
	<%
		}
	} else {
	%>
		<p>商品がありません...</p>
	<%
	}
	%>  
    </div>
    
	</jsp:attribute>
	</jsp:param>
</jsp:include>