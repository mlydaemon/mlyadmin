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
				文章列表
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="#">感谢您注册**网</a> 
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/customer/add">添加文章</a> 
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
					    <th><i class="icon-briefcase"></i>序号</th>
						<th><i class="icon-briefcase"></i>文章标题</th>
						<th><i class="icon-briefcase"></i>副标题</th>
						<th><i class="icon-briefcase"></i>所属栏目</th>
						<th><i class="icon-question-sign"></i> 审核状态</th>
						<th><i class="icon-bookmark"></i> 描述</th>
						<th><i class="icon-bookmark"></i> 浏览次数</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="content" items="${beans}" varStatus="status"> 
					    <tr>
					        <td>${status.index+1}</td>
							<td><a href="#">${content.title}</a></td>
							<td><a href="#">${content.shortTitle}</a></td>
							<td><a href="#">${content.channelName}</a></td>
							<td class="hidden-phone">
								 <c:choose>
								   <c:when test="${content.status== 1}">审核中</c:when>
								    <c:when test="${content.status== 2}">审核通过</c:when>
								    <c:when test="${content.status== 3}">回收站</c:when>
								   <c:otherwise>
								               草稿 
								   </c:otherwise>
								</c:choose>
							</td>
							<td>${content.description}</td>
							<td>${content.viewsDay}</td>
							<td><a class="btn mini green-stripe" href="${basePath}/admin/article/edit?contentId=${content.contentId}">编辑</a></td>
						</tr>
					</c:forEach>
					
				</tbody>

			</table>
            <div class="space5"></div>
            <div class="pagination pagination-right">
				<ul>
					<li class=""><a href="${basePath}/admin/channel/list?curpage=1">首页</a></li> 
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="${basePath}/admin/channel/list?curpage=1">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="${basePath}/admin/channel/list?curpage=${curpage-1}">Prev</a></li>
				   </c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2>5}">
						<c:forEach begin="1" end="${curpage-2>=5?5:curpage-3}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/channel/list?curpage=${page}">${page}</a></li> 
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
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/channel/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
					<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
						<c:forEach begin="${curpage-2<1?1:talpage-4}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/channel/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
					<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
						<c:forEach begin="${curpage-2<1?1:talpage-5}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/channel/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
					 <c:otherwise> 
							 <c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/channel/list?curpage=${page}">${page}</a></li> 
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
				      <li><a href="${basePath}/admin/channel/list?curpage=${talpage}">Next</a></li>     
				   </c:when>
				   <c:otherwise> 
				      <li><a href="${basePath}/admin/channel/list?curpage=${curpage+1}">Next</a></li>
				   </c:otherwise>
				</c:choose>
					<li class=""><a href="${basePath}/admin/channel/list?curpage=${talpage}">尾页</a></li> 
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		