<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../template/template.jsp">
  <jsp:param value="法人顧客管理｜すぐくる管理システム" name="siteTitle" />
  <jsp:param value="active" name="nav_user_active" />
  <jsp:param name="pageContents">
  	<jsp:attribute name="value">
  	<section class="row">
  		<h1>受注一覧</h1>
  		<div class="col-lg-12">
	  		<div class="jumbotron">
	  			<form class="form-horizontal" action="#" method="post">
	  				<fieldset>
	  					<legend>受注検索フォーム</legend>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-3">企業名/個人顧客名　：</label>
	  						<div class="col-lg-9">
	  							<input type="text" class="form-control" placeholder="CustomerName" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-3">担当者名　：</label>
	  						<div class="col-lg-9">
	  							<input type="text" class="form-control" placeholder="PhoneNumber" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2 col-lg-offset-3">納品状況　：</label>
	  						<div class="col-lg-2">
		  						<input type="radio" value="0" name="order_state"/>
		  						<label>納品済み</label>
		  						<input type="radio" value="1" name="order_state"/>
		  						<label>未納品</label>
	  						</div>
	  						<label for="" class="control-label col-lg-2">支払い状況　：</label>
	  						<div class="col-lg-3">
		  						<input type="radio" value="0" name="pay_state"/>
		  						<label>入金確認済み</label>
		  						<input type="radio" value="1" name="pay_state"/>
		  						<label>入金未確認</label>
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<div class="col-lg-12">
	  							<button type="submit" class="btn btn-success col-lg-12">検索する</button>
	  						</div>
	  					</div>
	  				</fieldset>
	  			</form>
	  		</div>
	  	</div>
  	</section>
  	<section class="row">
  		<table class="table table-striped table-hover">
  			<thead>
  				<tr>
  					<th>受注ＩＤ</th>
  					<th>企業名/個人顧客名</th>
  					<th>担当者名</th>
  					<th>価格</th>
  					<th>納品期限</th>
  					<th>納品状況</th>
  					<th>支払い期限</th>
  					<th>支払い状況</th>
  				</tr>
  			</thead>
  			<tbody>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社あさってくる</td>
  					<td>たなか</td>
  					<td>200000円</td>
  					<td>11/30</td>
  					<td>済</td>
  					<td>12/10</td>
  					<td>未</td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>織田信長</td>
  					<td>個人</td>
  					<td>20000円</td>
  					<td>11/30</td>
  					<td>済</td>
  					<td>12/10</td>
  					<td>未</td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社あさってくる</td>
  					<td>たなか</td>
  					<td>200000円</td>
  					<td>11/30</td>
  					<td>済</td>
  					<td>12/10</td>
  					<td>未</td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>織田信長</td>
  					<td>個人</td>
  					<td>20000円</td>
  					<td>11/30</td>
  					<td>済</td>
  					<td>12/10</td>
  					<td>未</td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社あさってくる</td>
  					<td>たなか</td>
  					<td>200000円</td>
  					<td>11/30</td>
  					<td>済</td>
  					<td>12/10</td>
  					<td>未</td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>織田信長</td>
  					<td>個人</td>
  					<td>20000円</td>
  					<td>11/30</td>
  					<td>済</td>
  					<td>12/10</td>
  					<td>未</td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社あさってくる</td>
  					<td>たなか</td>
  					<td>200000円</td>
  					<td>11/30</td>
  					<td>済</td>
  					<td>12/10</td>
  					<td>未</td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>織田信長</td>
  					<td>個人</td>
  					<td>20000円</td>
  					<td>11/30</td>
  					<td>済</td>
  					<td>12/10</td>
  					<td>未</td>
  				</tr>
  			</tbody>
  		</table>
  	</section>
  	</jsp:attribute>
  </jsp:param>
</jsp:include>