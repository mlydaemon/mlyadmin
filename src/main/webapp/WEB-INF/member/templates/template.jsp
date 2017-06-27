<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><tiles:insertAttribute name="title" /></title>
<jsp:include page="include.jsp"></jsp:include>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed">
	<tiles:insertAttribute name="header" />
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar nav-collapse collapse">
			<!-- BEGIN SIDEBAR MENU -->        
			<ul class="page-sidebar-menu">
				<li class="margin-top-20">
					
				</li>
				<li>
					<!-- BEGIN RESPONSIVE QUICK SEARCH FORM -->
					<h2><span class="title">我的账户中心</span></h2>
					<!-- END RESPONSIVE QUICK SEARCH FORM -->
				</li>
				<li class="start active ">
					<a href="${basePath}/member/account/index.html">
					<i class="icon-home"></i> 
					<span class="title">我的账户</span>
					<span class="selected"></span>
					</a>
				</li>
				<li class="">
					<a href="${basePath}/member/account/edit/basic.html">
					<i class="icon-cogs"></i> 
					<span class="title">基本信息</span>
					<span class="arrow "></span>
					</a>
				</li>
				<li class="">
					<a href="${basePath}/member/account/edit/signature.html">
					<i class="icon-cogs"></i> 
					<span class="title">个性签名</span>
					<span class="arrow "></span>
					</a>
				</li>
				<li class="">
					<a href="${basePath}/member/account/edit/portrait.html">
					<i class="icon-cogs"></i> 
					<span class="title">会员头像</span>
					<span class="arrow "></span>
					</a>
				</li>
				<li class="">
					<a href="${basePath}/member/account/edit/address.html">
					<i class="icon-cogs"></i> 
					<span class="title">通讯地址</span>
					<span class="arrow "></span>
					</a>
				</li>
				<li class="last">
					<a href="${basePath}/member/account/repassword.html">
					<i class="icon-cogs"></i> 
					<span class="title">修改密码</span>
					<span class="arrow "></span>
					</a>
				</li>
			</ul>
			<!-- END SIDEBAR MENU -->
		</div>
		<!-- END SIDEBAR -->
		<!-- BEGIN PAGE -->
		<div class="page-content">
		   <tiles:insertAttribute name="body" />
		</div>
		<!-- END PAGE -->
	</div>
	<!-- END CONTAINER -->
	
	<tiles:insertAttribute name="footer" />
	</body>
<!-- END BODY -->
</html>