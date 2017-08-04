<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- BEGIN PAGE LEVEL STYLES --> 
<link href="${basePath}/media/css/datepicker.css" rel="stylesheet" type="text/css" />
<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				语义列表
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="${basePath}/admin/index.html">Dashboard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/question/list.html">语义列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/question/add">添加语义</a> 
					<i class="icon-angle-down"></i>
				</li>
				
			</ul>
			<!-- END PAGE TITLE & BREADCRUMB-->
		</div>
	</div>
	<!-- END PAGE HEADER-->
	<div class="row-fluid">
	<div class="span12 booking-search">
		<form action="${basePath}/admin/question/list" method="GET">
			<div class="clearfix margin-bottom-10">
				<label>Distanation</label>
				<div class="input-icon left">
					<i class="icon-map-marker"></i>
					<input class="m-wrap span12" type="text" placeholder="Canada, Malaysia, Russia ...">
				</div>
			</div>
			<div class="clearfix margin-bottom-20">
				<div class="control-group pull-left margin-right-20">
					<label class="control-label">Check-in:</label>
					<div class="controls">
						<div class="input-append date date-picker" data-date="12-02-2012" data-date-format="dd-mm-yyyy" data-date-viewmode="years">
							<input style="height:34px" class="span9 m-wrap m-ctrl-medium date-picker" size="16" type="text" value="12-02-2012" /><span class="add-on"><i class="icon-calendar"></i></span>
						</div>
					</div>
				</div>
				<div class="control-group pull-left">
					<label class="control-label">Check-out:</label>
					<div class="controls">
						<div class="input-append date date-picker" data-date="102/2012" data-date-format="mm/yyyy" data-date-viewmode="years" data-date-minviewmode="months">
							<input style="height:34px" class="span9 m-wrap m-ctrl-medium date-picker" size="16" type="text" value="02/2012" /><span class="add-on"><i class="icon-calendar"></i></span>
						</div>
					</div>
				</div>
				<div class="control-group pull-left">
					<label class="control-label">How Many:</label>
					<div class="controls">
						<div class="input-icon left">
							<i class="icon-user"></i>
							<input style="height:34px"  class="span11 m-wrap" type="text" placeholder="1 Room, 2 Adults, 0 Children">
						</div>
					</div>
				</div>
				<div class="control-group booking-option pull-left">
						<label class="control-label">Choose Option</label>
						<div class="controls controls-uniform">
							<label class="radio">
							<input type="radio" name="optionsRadios2" value="option1" />
							Option1
							</label>
							<label class="radio">
							<input type="radio" name="optionsRadios2" value="option2" checked />
							Option2
							</label>  
						</div>
					</div>
			</div>
			<button type="submit" class="btn blue btn-block">SEARCH <i class="m-icon-swapright m-icon-white"></i></button>
		</form>
	</div>
	<!--end booking-search-->
	</div>
	<div class="row-fluid">
		<div class="portlet-body" style="display: block;">
			<table class="table table-striped table-bordered table-advance table-hover">
				<thead>
					<tr>
						<!-- <th><i class="icon-briefcase"></i>语义ID</th> -->
						<th><i class="icon-briefcase"></i>机器人账号</th>
						<th><i class="icon-bookmark"></i>机器人名称</th>
						 <th><i class="icon-bookmark"></i>内容</th>
						 <th><i class="icon-bookmark"></i>语义</th>
						 <th><i class="icon-bookmark"></i>当前词库</th>
						 <!-- <th><i class="icon-bookmark"></i>跳转词库</th> -->
						 <!-- <th><i class="icon-bookmark"></i>模式</th> -->
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="question" items="${beans}"> 
					    <tr>
							<%-- <td><a href="#">${question.questionId}</a></td> --%>
							<td><a href="#">${question.account}</a></td>
							<td>${question.application}</td>
							 <td>${question.content}</td> 
							 <td>${question.command}</td> 
							 <td>${question.classify}</td> 
							<%--  <td>${question.nextclassify}</td>  --%>
							 <%-- <td>${question.pattern}</td>  --%>
							<td><a class="btn mini green-stripe" href="${basePath}/admin/question/edit?questionId=${question.questionId}">编辑</a>|
							<a class="btn mini green-stripe" href="${basePath}/admin/question/delete?questionId=${question.questionId}">删除</a></td>
						</tr>
					</c:forEach>
					
				</tbody>

			</table>
            <div class="space5"></div>
            <div class="pagination pagination-right">
				<ul>
					<li class=""><a href="${basePath}/admin/question/list?curpage=1">首页</a></li> 
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="${basePath}/admin/question/list?curpage=1">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="${basePath}/admin/question/list?curpage=${curpage-1}">Prev</a></li>
				   </c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2>5}">
						<c:forEach begin="1" end="${curpage-2>=5?5:curpage-3}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/question/list?curpage=${page}">${page}</a></li> 
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
								<li class="active"><a href="${basePath}/admin/question/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-4}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/question/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-5}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/question/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
					 <c:otherwise> 
							 <c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/question/list?curpage=${page}">${page}</a></li> 
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
				      <li><a href="${basePath}/admin/question/list?curpage=${talpage}">Next</a></li>     
				   </c:when>
				   <c:otherwise> 
				      <li><a href="${basePath}/admin/question/list?curpage=${curpage+1}">Next</a></li>
				   </c:otherwise>
				</c:choose>
					<li class=""><a href="${basePath}/admin/question/list?curpage=${talpage}">尾页</a></li> 
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
<script src="${basePath}/media/js/search.js"></script> 
<script src="${basePath}/media/js/bootstrap-datepicker.js"  type="text/javascript"></script>
<script>
	jQuery(document).ready(function() {    
	   Search.init();
	});
</script>		