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
					<h2 style="background:blue;color:#fff"><span class="title">我的账户中心</span></h2>
					<!-- END RESPONSIVE QUICK SEARCH FORM -->
				</li>
				<li class="start ${((channel eq 'riddle'))?'active':''}">
					<a href="charts.html">
					<!-- <a href="${basePath}/admin/task/list.html"> -->
					<i class="icon-cogs"></i> 
					<span class="title">任务管理</span>
					<span class="selected arrow "></span>
					</a>
						<ul class="sub-menu">
						<li class="${channel eq 'riddle'?'active':''}"><a href="${basePath}/admin/riddle/list.html">谜语管理</a></li>
					</ul>
				</li>
				<li class="start ${((channel eq 'question')or(channel eq 'application')or(channel eq 'answer'))?'active':''}">
					<a href="charts.html">
					<!-- <a href="${basePath}/admin/task/list.html"> -->
					<i class="icon-cogs"></i> 
					<span class="title">机器人管理</span>
					<span class="selected arrow "></span>
					</a>
						 <ul class="sub-menu">
						<li class="${channel eq 'question'?'active':''}"><a href="${basePath}/admin/question/list.html">语义管理</a></li>
						<li class="${channel eq 'answer'?'active':''}"><a href="${basePath}/admin/answer/list.html">应答管理</a></li>
						<li class="${channel eq 'application'?'active':''}"><a href="${basePath}/admin/application/list.html">应用管理</a></li>
					    </ul> 
				</li>
				<li class="start ${channel eq 'customer'?'active':''}">
				
					<a href="${basePath}/admin/customer/list.html">
					<i class="icon-cogs"></i> 
					<span class="title">会员管理</span>
					<span class="selected arrow "></span>
					</a>
				</li>
				<li class="${channel eq 'article'?'active':''}">
					<a href="${basePath}/admin/article/list.html">
					<i class="icon-cogs"></i> 
					<span class="title">内容管理</span>
					<span class="arrow "></span>
					</a>
				</li>
				<%-- <li class="${channel eq 'article'?'active':''}">
					<a href="${basePath}/admin/article/list.html">
					<i class="icon-cogs"></i> 
					<span class="title">公告管理</span>
					<span class="arrow "></span>
					</a>
				</li>
				<li class="${channel eq 'article'?'active':''}">
					<a href="${basePath}/admin/article/list.html">
					<i class="icon-cogs"></i> 
					<span class="title">内容管理</span>
					<span class="arrow "></span>
					</a>
				</li> --%>
				<li class="last ${((channel eq 'channel')or(channel eq 'menu')or(channel eq 'function')or(channel eq 'riddleClassify')or(channel eq 'department')or(channel eq 'position')or(channel eq 'user'))?'active':''}">
					<a href="charts.html">
					<i class="icon-cogs"></i> 
					<span class="title">系统设置</span>
					<span class="arrow open"></span>
					</a>
					<ul class="sub-menu">
						<li class="${channel eq 'channel'?'active':''}"><a href="${basePath}/admin/channel/list.html">栏目管理</a></li>
						<li class="${channel eq 'function'?'active':''}"><a href="${basePath}/admin/function/list.html">功能管理</a></li>
						<li class="${channel eq 'menu'?'active':''}"><a href="${basePath}/admin/menu/list.html">菜单管理</a></li>
						<li class="${channel eq 'department'?'active':''}"><a href="${basePath}/admin/department/list.html">部门管理</a></li>
						<li class="${channel eq 'position'?'active':''}"><a href="${basePath}/admin/position/list.html">职位管理</a></li>
						<li class="${channel eq 'user'?'active':''}"><a href="${basePath}/admin/user/list.html">用户管理</a></li>
						<li class="${channel eq 'riddleClassify'?'active':''}"><a href="${basePath}/admin/riddleClassify/list.html">谜语类别</a></li>
					</ul>	
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