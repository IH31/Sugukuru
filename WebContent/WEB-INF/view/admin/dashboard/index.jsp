<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="../template/template.jsp">
  <jsp:param value="ログインページ" name="siteTitle" />
  <jsp:param name="pageContents">
  	<jsp:attribute name="value">
  	<section class="row">
  		<div class="jumbotron">
  			<h1>ダッシュボード</h1>
  			<p>This is a simple hero unit, a simple jumbotron-style 
  			component for calling extra attention to featured content or information.</p>
  			<p class="text-right"><a href="https://bootswatch.com/lumen/" class="btn btn-primary btn-lg">Learn more</a></p>
  		</div>
  	</section>
  	<section class="row">
  		<aside class="col-lg-4">
  			<div class="alert alert-dismissible alert-info">
			  <button type="button" class="close" data-dismiss="alert">×</button>
			  <strong>Heads up!</strong> This <a href="#" class="alert-link">alert needs your attention</a>, but it's not super important.
			</div>
  		</aside>
  		<aside class="col-lg-4">
  			<div class="panel panel-default">
			  <div class="panel-heading">Panel heading</div>
			  <div class="panel-body">
			    Panel content
			  </div>
			</div>
  		</aside>
  		<aside class="col-lg-4">
			<ul class="nav nav-tabs">
			  <li class="active"><a href="#home" data-toggle="tab">Home</a></li>
			  <li><a href="#profile" data-toggle="tab">Profile</a></li>
			  <li class="disabled"><a>Disabled</a></li>
			  <li class="dropdown">
			    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
			      Dropdown <span class="caret"></span>
			    </a>
			    <ul class="dropdown-menu">
			      <li><a href="#dropdown1" data-toggle="tab">Action</a></li>
			      <li class="divider"></li>
			      <li><a href="#dropdown2" data-toggle="tab">Another action</a></li>
			    </ul>
			  </li>
			</ul>
  		</aside>
  	</section>
  	</jsp:attribute>
  </jsp:param>
</jsp:include>