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
				<form class="form-horizontal" action="#" method="post">
					<fieldset>
						<legend>法人顧客登録フォーム</legend>
						<div class="form-group">
	  						<label for="" class="control-label col-lg-2">企業名　：</label>
	  						<div class="col-lg-10">
	  							<input type="text" class="form-control" placeholder="CustomerName" />
	  						</div>
	  					</div>
					</fieldset>
				</form>
			</div>
		</section>
  	</jsp:attribute>
  </jsp:param>
</jsp:include>