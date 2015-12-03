<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,sugukuru.model.product.*,sugukuru.cart.*"%>
<jsp:include page="../template2/template.jsp">
	<jsp:param value="すぐくる｜確認画面" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
		<div class="cart-content">
		  <div class="cart-title">
		    <p>確認画面</p>
		  </div>
		  <div class="cart-item-list">
		  <div class="pay-flow-list">
		  	<div class="flow-step flow-active">
		  		<p>注文内容確定</p>
		  	</div>
		  	<div class="flow-allow">
		  		<span>→</span>
		  	</div>
		  	<div class="flow-step">
		  		<p>お届け先入力</p>
		  	</div>
		  	<div class="flow-allow">
		  		<span>→</span>
		  	</div>
		  	<div class="flow-step">
		  		<p>支払い方法選択</p>
		  	</div>
		  	<div class="flow-allow">
		  		<span>→</span>
		  	</div>
		  	<div class="flow-step">
		  		<p>注文完了</p>
		  	</div>
		  </div>
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
		            <label><%= cartItem.getNum() %>個</label>
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
		      </div>
		    </div>
		  <%
		  	}
		  %>
		  <div class="cart-cash">
		  	<p>合計（<%= sumCnt %>点）:<span class="price-red">¥<%= sumPrice %></span></p>
		  	<button><a href="${pageContext.request.contextPath}/ec/pay/step2">注文を確定する</a></button>
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