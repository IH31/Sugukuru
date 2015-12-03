<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,sugukuru.model.product.*,sugukuru.cart.*"%>
<jsp:include page="../template2/template.jsp">
	<jsp:param value="すぐくる｜お届け先入力" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
		<div class="cart-content">
		  <div class="cart-title">
		    <p>支払い方法選択画面</p>
		  </div>
		  <div class="cart-item-list">
			  <div class="pay-flow-list">
			  	<div class="flow-step">
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
			  	<div class="flow-step flow-active">
			  		<p>支払い方法選択</p>
			  	</div>
			  	<div class="flow-allow">
			  		<span>→</span>
			  	</div>
			  	<div class="flow-step">
			  		<p>注文完了</p>
			  	</div>
			  </div>
			  <div class="pay-credit-form">
			  	<form method="post" action="${pageContext.request.contextPath}/ec/pay/step4">
			  		<fieldset>
				  	<div class="credit-radio-group">
				  		<div class="radio-title">
				  			<input type="radio" name="payment" values="1" checked><label>：クレジットカードでお支払い</label>
				  		</div>
				  		<div class="credit-form-group">
				  			<div class="credit-form-text">
					  			クレジットカード番号：<input type="text" placeholder="例：1234567890123456">
					  		</div>
					  		<div class="credit-form-text">
					  			名義人：<input type="text" placeholder="例：TANAKATAROU">
					  		</div>
					  		<div class="credit-form-text">
					  			有効期限：<input type="text" placeholder="例：08">/<input type="text" placeholder="例：19">
					  		</div>
					  		<div class="credit-form-text">
						  		セキュリティコード：<input type="text" placeholder="例：345">	
						  	</div>
					  	</div>
				  	</div>
				  	<div class="credit-radio-group">
				  		<div class="radio-title">
				  			<input type="radio" name="payment" values="2"><label>：銀行振込でお支払い</label>
				  		</div>
				  	</div>
				  	<div class="credit-radio-group">
				  		<div class="radio-title">
				  			<input type="radio" name="payment" values="3"><label>：代金引換でお支払い</label>
				  		</div>
				  	</div>
				  	<button type="submit">注文を完了する</button>
				  	</fieldset>
			  	</form>
			  </div>
		</div>
	</div>
	</jsp:attribute>
	</jsp:param>
</jsp:include>