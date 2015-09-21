<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../template/template.jsp">
  <jsp:param value="新規法人顧客登録｜すぐくる管理システム" name="siteTitle" />
  <jsp:param value="active" name="nav_user_active" />
  <jsp:param name="pageContents">
  	<jsp:attribute name="value">
		<section class="row">
			<h1>新規法人顧客登録</h1>
			<div class="jumbotron">
				<form class="form-horizontal" action="${pageContext.request.contextPath}/admin/customer/add" method="post">
					<fieldset>
						<legend>法人顧客登録フォーム</legend>
						<div class="form-group has-success has-feedback">
	  						<label for="" class="control-label col-lg-2">会社名　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="customerName" placeholder="すぐくる株式会社" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">　読み仮名　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="customerNameKana" placeholder="すぐくるかぶしきがいしゃ" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">部署名　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="departmentName" placeholder="総務部" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">担当者名　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="contactPersonName" placeholder="田中太郎" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">郵便番号　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="postalCode" placeholder="160-0023" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">住所　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="address" placeholder="東京都新宿西新宿1-7-3" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">電話番号　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="phoneNumber" placeholder="03-3344-1010" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">Email　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="email" placeholder="sugukuru@tokyo.hal.ac.jp" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">支払締日　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="payLimit" placeholder="30" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">割引率　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="discountRate" placeholder="15" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">与信限度額　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="creditLimit" placeholder="10000000" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">サービス開始日　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="serviceStart" placeholder="2015-10-01" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">サービス終了日　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="serviceEnd" placeholder="2016-10-01" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">利用アカウント数　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="account" placeholder="2" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">パスワード　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" name="password" placeholder="12345678" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<div class="col-lg-12">
	  							<button type="submit" class="btn btn-success col-lg-12">登録する</button>
	  						</div>
	  					</div>
					</fieldset>
				</form>
			</div>
		</section>
  	</jsp:attribute>
  </jsp:param>
</jsp:include>