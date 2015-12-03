<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,sugukuru.model.product.*,sugukuru.cart.*"%>
<jsp:include page="../template2/template.jsp">
	<jsp:param value="すぐくる｜お届け先入力" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
		<div class="cart-content">
		  <div class="cart-title">
		    <p>お届け先入力画面</p>
		  </div>
		  <div class="cart-item-list">
			  <div class="pay-flow-list">
			  	<div class="flow-step">
			  		<p>注文内容確定</p>
			  	</div>
			  	<div class="flow-allow">
			  		<span>→</span>
			  	</div>
			  	<div class="flow-step flow-active">
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
			  <div class="pay-address-form">
			  	<form id="pay-address" action="${pageContext.request.contextPath}/ec/pay/step3" method="post">
			  		<fieldset>
				  		<div class="pay-form-group">
				  			<label>お届け先名義人（漢字）：</label>
				  			<input type="text" name="customerName" placeholder="例：田中太郎" data-validetta="required" required autofocus>
				  		</div>
				  		<div class="pay-form-group">
				  			<label>お届け先名義人（カナ）：</label>
				  			<input type="text" name="kana" placeholder="例：タナカタロウ" data-validetta="required" required>
				  		</div>
				  		<div class="pay-form-group">
				  			<label>お届け先郵便番号：</label>
				  			<input type="text" name="postalCode" placeholder="例：1234567" data-validetta="required,number,maxLength[7],minLength[7]" required>
				  		</div>
				  		<div class="pay-form-group">
				  			<label>お届け先住所：</label>
				  			<input type="text" name="address" placeholder="例：東京都新宿区新宿1-1-1" data-validetta="required" required>
				  		</div>
				  		<div class="pay-form-group">
				  			<label>電話番号：</label>
				  			<input type="text" name="telephone" placeholder="例：08012345678" data-validetta="required,number,maxLength[11],minLength[10]" required>
				  		</div>
				  		<div class="pay-form-group">
				  			<label>E-MAIL：</label>
				  			<input type="text" name="email" placeholder="例：example@gmail.com" data-validetta="required,email" required>
				  		</div>
				  		<div class="pay-form-group">
				  			<button type="submit">支払い方法選択へ</button>
				  		</div>
			  		</fieldset>
			  	</form>
			  </div>
		</div>
	</div>
	<script>
	$(document).ready(function() {
	    $("#pay-address").validetta();
	});
	</script>
	</jsp:attribute>
	</jsp:param>
</jsp:include>