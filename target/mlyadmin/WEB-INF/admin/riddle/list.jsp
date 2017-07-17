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
				谜语列表
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="#">感谢您注册**网</a> 
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/riddle/add">添加谜语</a> 
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
						<th><i class="icon-briefcase"></i>谜语ID</th>
						<th><i class="icon-briefcase"></i>小主人</th>
						<th><i class="icon-bookmark"></i>谜面</th>
						 <!-- <th><i class="icon-bookmark"></i>谜幕</th> -->
						 <th><i class="icon-bookmark"></i>提示</th>
						 <th><i class="icon-bookmark"></i>谜底</th>
						 <th><i class="icon-bookmark"></i>描述</th>
						 <th><i class="icon-bookmark"></i>分类</th>
						 <!-- <th><i class="icon-bookmark"></i>创建时间</th>
						 <th><i class="icon-bookmark"></i>更新时间</th> -->
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="riddle" items="${beans}"> 
					    <tr>
							<td><a href="#">${riddle.riddleId}</a></td>
							<td><a href="#">${riddle.account}</a></td>
							<td>${riddle.conundrum}</td>
							 <%-- <td>${riddle.mystery}</td>  --%>
							 <td>${riddle.reminder}</td> 
							 <td>${riddle.answer}</td> 
							 <td>${riddle.explains}</td> 
							 <td>${riddle.classify}</td> 
							 <%-- <td>${riddle.createdTime}</td> 
							 <td>${riddle.updateTime}</td>  --%>
							<td><a class="btn mini green-stripe" href="${basePath}/admin/riddle/edit?riddleId=${riddle.riddleId}">编辑</a>|
							<a class="btn mini green-stripe" href="${basePath}/admin/riddle/delete?riddleId=${riddle.riddleId}">删除</a></td>
						</tr>
					</c:forEach>
					
				</tbody>

			</table>
            <div class="space5"></div>
            <div class="pagination pagination-right">
				<ul>
				<c:forEach begin="1" end="1" var = "page">
					<li class=""><a href="${basePath}/admin/riddle/list?curpage=1">首页</a></li> 
				</c:forEach>
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="${basePath}/admin/riddle/list?curpage=1">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="${basePath}/admin/riddle/list?curpage=${curpage-1}">Prev</a></li>
				   </c:otherwise>
				</c:choose>
				
				<c:choose>
						<c:when test="${curpage+2<5&&curpage-2<talpage-5&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:5}" var = "page">
								<li class="active"><a href="${basePath}/admin/riddle/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-4}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/riddle/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-5}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/riddle/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
					 <c:otherwise> 
							 <c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/riddle/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
					</c:otherwise>
				</c:choose>
					<c:choose>
					   <c:when test="${curpage== talpage}">  
					      <li><a href="${basePath}/admin/riddle/list?curpage=${talpage}">Next</a></li>     
					   </c:when>
					   <c:otherwise> 
					      <li><a href="${basePath}/admin/riddle/list?curpage=${curpage+1}">Next</a></li>
					   </c:otherwise>
					</c:choose>
					<c:forEach begin="1" end="1" var = "page">
					<li class=""><a href="${basePath}/admin/riddle/list?curpage=${talpage}">尾页</a></li> 
				</c:forEach>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		