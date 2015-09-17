<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="template/template.jsp">
	<jsp:param value="すぐくる" name="siteTitle" />
	<jsp:param name="pageContents">
	<jsp:attribute name="value">
	
	<!--
		コンテンツ部分 
	 -->
	<div id="wowslider-container0">
	<div class="ws_images"><ul>
		<li><a href="sample.html"><img src="${pageContext.request.contextPath}/assets/data0/images/20121009_a2510e.jpg" alt="すぐくるのおすすめ" title="すぐくるのおすすめ" id="wows0_0"/></a></li>
		<li><a href="sample.html"><img src="${pageContext.request.contextPath}/assets/data0/images/background.jpg" alt="すぐくるのおすすめ" title="すぐくるのおすすめ" id="wows0_1"/></a></li>
		<li><a href="sample.html"><img src="${pageContext.request.contextPath}/assets/data0/images/internettube_v201.png" alt="Network cables" title="Network cables" id="wows0_2"/></a></li>
	</ul></div>
	</div>
	

  	</jsp:attribute>
	</jsp:param>
</jsp:include>