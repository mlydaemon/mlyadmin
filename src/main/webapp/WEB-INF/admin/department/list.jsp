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
				部门列表
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="#">感谢您注册**网</a> 
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/department/add">创建部门</a> 
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
						<th><i class="icon-briefcase"></i>部门名称</th>
						<!-- <th class="hidden-phone"><i class="icon-question-sign"></i> 上级部门</th> -->
						<th><i class="icon-bookmark"></i> 外部链接</th>
						<!-- <th><i class="icon-bookmark"></i> 排序</th> -->
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="department" items="${beans}"> 
					    <tr>
							<td><a href="#">${department.departmentName}</a></td>
							<%-- <td class="hidden-phone">${department.parentName}</td> --%>
							<td>${department.link}</td>
							<%-- <td>${department.priority}</td> --%>
							<td><a class="btn mini green-stripe" href="${basePath}/admin/department/edit?departmentId=${department.departmentId}">编辑</a>|
							<a class="btn mini green-stripe" href="${basePath}/admin/department/delete?departmentId=${department.departmentId}">删除</a></td>
						</tr>
					</c:forEach>
					
				</tbody>

			</table>
            <div class="space5"></div>
            <div class="pagination pagination-right">
				<ul>
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="${basePath}/admin/department/list?curpage=1">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="${basePath}/admin/department/list?curpage=${curpage-1}">Prev</a></li>
				   </c:otherwise>
				</c:choose>
					<c:forEach begin="1" end="${talpage}" var="page" >
					    
					    <c:choose>
					   <c:when test="${page== curpage}">  
					     <li class="active"><a href="${basePath}/admin/department/list?curpage=${page}">${page}</a></li>     
					   </c:when>
					   <c:otherwise> 
					      <li><a href="${basePath}/admin/department/list?curpage=${page}">${page}</a></li>
					   </c:otherwise>
					</c:choose>
					</c:forEach>
					
					<c:choose>
					   <c:when test="${curpage== talpage}">  
					      <li><a href="${basePath}/admin/department/list?curpage=${talpage}">Next</a></li>     
					   </c:when>
					   <c:otherwise> 
					      <li><a href="${basePath}/admin/department/list?curpage=${curpage+1}">Next</a></li>
					   </c:otherwise>
					</c:choose>
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		