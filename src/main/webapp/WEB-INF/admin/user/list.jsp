<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				栏目列表
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="${basePath}/admin/index.html">Dashboard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/user/list.html">用户列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/user/add">添加用户</a> 
					<i class="icon-angle-down"></i>
				</li>
				
			</ul>
			<!-- END PAGE TITLE & BREADCRUMB-->
		</div>
	</div>
	<!-- END PAGE HEADER-->
	<div class="row-fluid">
		<div class="portlet-body" style="display: block;">
			<table class="table table-striped table-bordered table-advance table-hover">
				<thead>
					<tr>
						<th><i class="icon-briefcase"></i>用户名</th>
						<th class="hidden-phone"><i class="icon-question-sign"></i> 用户账号</th>
						<th><i class="icon-bookmark"></i> 手机号码</th>
						<th><i class="icon-bookmark"></i> 角色名称</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${beans}"> 
					    <tr>
							<td><a href="#">${user.nickname}</a></td>
							<td class="hidden-phone">${user.account}</td>
							<td>${user.phone}</td>
							<td>${user.positionNames}</td>
							<td><a class="btn mini green-stripe" href="${basePath}/admin/user/edit?account=${user.account}">授权</a>|
							<a class="btn mini green-stripe" href="${basePath}/admin/user/delete?userId=${user.userId}">删除</a></td>
						</tr>
					</c:forEach>
					
				</tbody>

			</table>
            <div class="space5"></div>
            <div class="pagination pagination-right">
				<ul>
				<c:forEach begin="1" end="1" var = "page">
					<li class=""><a href="${basePath}/admin/user/list?curpage=1">首页</a></li> 
				</c:forEach>
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="${basePath}/admin/user/list?curpage=1">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="${basePath}/admin/user/list?curpage=${curpage-1}">Prev</a></li>
				   </c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2>5}">
						<c:forEach begin="1" end="${curpage-2>=5?5:curpage-3}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/user/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage-2>5}">
						<li class=""><a href="#">……</a></li> 
					</c:when>
				</c:choose>
				<c:choose>
						<c:when test="${curpage+2<5&&curpage-2<talpage-5&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:5}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/user/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-4}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/user/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-5}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/user/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
					 <c:otherwise> 
							 <c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/user/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
					</c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2<talpage-5}">
						<li class=""><a href="#">……</a></li> 
					</c:when>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2<talpage}">
						<c:forEach begin="${curpage+2<talpage-4?talpage-4:curpage+3}" end="${talpage}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/riddle/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
				</c:choose>
				<c:choose>
				   <c:when test="${curpage== talpage}">  
				      <li><a href="${basePath}/admin/user/list?curpage=${talpage}">Next</a></li>     
				   </c:when>
				   <c:otherwise> 
				      <li><a href="${basePath}/admin/user/list?curpage=${curpage+1}">Next</a></li>
				   </c:otherwise>
				</c:choose>
					<li class=""><a href="${basePath}/admin/user/list?curpage=${talpage}">尾页</a></li> 
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		