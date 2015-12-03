<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,sugukuru.model.product.*,sugukuru.cart.*"%>
<jsp:include page="../template2/template.jsp">
	<jsp:param value="すぐくる｜カート" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
		<div class="cart-content">
		  <div class="cart-title">
		    <p>あなたのカート</p>
		  </div>
		  <div class="cart-item-list">
		  <%
		  	ArrayList<CartItem> cartItems = (ArrayList<CartItem>)request.getAttribute("cart");
		  	if(cartItems != null && cartItems.size() > 0) {
		  		int sumPrice = 0;
		  		int sumCnt = 0;
		  		for(CartItem cartItem:cartItems) {
		  			sumPrice += cartItem.getProduct().getPrice() * cartItem.getNum();
		  			sumCnt += cartItem.getNum();
		  	%>
		    <div class="cart-item">
		      <div class="item-img">
		        <img src="${pageContext.request.contextPath}/assets/images/products/<%= cartItem.getProduct().getProduct_id() %>.jpg" alt="img" />
		      </div>
		      <div class="item-title">
		        <p>
		          <%= cartItem.getProduct().getProduct_name() %>
		        </p>
		        <p class="item-title-detail">
		          商品詳細：ここに商品詳細が入ります。
		        </p>
		      </div>
		      <div class="item-price">
		        <div class="item-price-num">
		          <div class="item-price-num-group">
		            <label for="">個数：</label><br>
		            <hr>
		            <input type="text" name="num" value="<%= cartItem.getNum() %>">個
		          </div>
		          <div class="item-price-num-group">
		            <label for="">価格：</label>
		            <hr>
		            <p>¥<%= cartItem.getProduct().getPrice() %>／個</p>
		          </div>
		        </div>
		        <div class="item-price-sum">
		          <p>
		            小計価格：<span class="price-red">¥<%= cartItem.getProduct().getPrice() * cartItem.getNum() %></span>
		          </p>
		        </div>
		        <div class="item-del-btn">
		        	<button><a href="${pageContext.request.contextPath}/ec/cart?cartDelId=<%= cartItem.getProduct().getProduct_id() %>">カートから削除する</a></button>
		        </div>
		      </div>
		    </div>
		  <%
		  	}
		  %>
		  <div class="cart-cash">
		  	<p>合計（<%= sumCnt %>点）:<span class="price-red">¥<%= sumPrice %></span></p>
		  	<button><a href="${pageContext.request.contextPath}/ec/pay/step1">確認画面へ</a></button>
		  </div>
		  <%
		  } else {
		  %>
		  	<p>商品が追加されていません...</p>
		  <%
		  }
		  %>
		</div>
	</div>
	</jsp:attribute>
	</jsp:param>
</jsp:include>