<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../template/template.jsp">
  <jsp:param value="法人顧客管理｜すぐくる管理システム" name="siteTitle" />
  <jsp:param value="active" name="nav_user_active" />
  <jsp:param name="pageContents">
  	<jsp:attribute name="value">
  	<section class="row">
  		<h1>法人顧客一覧</h1>
  		<div class="col-lg-12">
	  		<div class="jumbotron">
	  			<form action="post" class="form-horizontal">
	  				<fieldset>
	  					<legend>顧客検索フォーム</legend>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">企業名　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" placeholder="CustomerName" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">電話番号　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" placeholder="PhoneNumber" />
	  						</div>
	  					</div>
	  					<div class="form-group">
	  						<label for="" class="control-label col-lg-2">取引実績　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" placeholder="" />
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
  					<th>ユーザＩＤ</th>
  					<th>企業名</th>
  					<th>担当者名</th>
  					<th>電話番号</th>
  					<th>メールアドレス</th>
  					<th>view | update</th>
  				</tr>
  			</thead>
  			<tbody>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社すぐくる</td>
  					<td>たなか</td>
  					<td>03-3333-3333</td>
  					<td>sugukuru@hal.ac.jp</td>
  					<td><a href="">view</a> | <a href="">update</a></td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社すぐくる</td>
  					<td>たなか</td>
  					<td>03-3333-3333</td>
  					<td>sugukuru@hal.ac.jp</td>
  					<td><a href="">view</a> | <a href="">update</a></td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社すぐくる</td>
  					<td>たなか</td>
  					<td>03-3333-3333</td>
  					<td>sugukuru@hal.ac.jp</td>
  					<td><a href="">view</a> | <a href="">update</a></td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社すぐくる</td>
  					<td>たなか</td>
  					<td>03-3333-3333</td>
  					<td>sugukuru@hal.ac.jp</td>
  					<td><a href="">view</a> | <a href="">update</a></td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社すぐくる</td>
  					<td>たなか</td>
  					<td>03-3333-3333</td>
  					<td>sugukuru@hal.ac.jp</td>
  					<td><a href="">view</a> | <a href="">update</a></td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社すぐくる</td>
  					<td>たなか</td>
  					<td>03-3333-3333</td>
  					<td>sugukuru@hal.ac.jp</td>
  					<td><a href="">view</a> | <a href="">update</a></td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社すぐくる</td>
  					<td>たなか</td>
  					<td>03-3333-3333</td>
  					<td>sugukuru@hal.ac.jp</td>
  					<td><a href="">view</a> | <a href="">update</a></td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社すぐくる</td>
  					<td>たなか</td>
  					<td>03-3333-3333</td>
  					<td>sugukuru@hal.ac.jp</td>
  					<td><a href="">view</a> | <a href="">update</a></td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社すぐくる</td>
  					<td>たなか</td>
  					<td>03-3333-3333</td>
  					<td>sugukuru@hal.ac.jp</td>
  					<td><a href="">view</a> | <a href="">update</a></td>
  				</tr>
  				<tr>
  					<td>A12345</td>
  					<td>株式会社すぐくる</td>
  					<td>たなか</td>
  					<td>03-3333-3333</td>
  					<td>sugukuru@hal.ac.jp</td>
  					<td><a href="">view</a> | <a href="">update</a></td>
  				</tr>
  			</tbody>
  		</table>
  	</section>
  	</jsp:attribute>
  </jsp:param>
</jsp:include>