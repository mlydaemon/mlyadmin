<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- BEGIN PAGE LEVEL STYLES --> 
<link href="${basePath}/media/css/datepicker.css" rel="stylesheet" type="text/css" />
<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<!-- BEGIN PAGE CONTAINER-->
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				应答列表
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="#">感谢您注册**网</a> 
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/answer/add">创建应答</a> 
					<i class="icon-angle-down"></i>
				</li>
				
			</ul>
			<!-- END PAGE TITLE & BREADCRUMB-->
		</div>
	</div>
	<!-- END PAGE HEADER-->
	<div class="row-fluid">
	<div class="span12 booking-search">
		<form id="searchForm" action="${basePath}/admin/answer/list" method="POST" >
			<input id="count" name="count"  type="hidden" value="20"/>
			<input id="curpage" name="curpage"  type="hidden" value="1"/>
			<div class="clearfix margin-bottom-10">
				<label>关键词</label>
				<div class="input-icon left">
					<i class="icon-map-marker"></i>
					<input id="keywords" name="keywords" value="${keywords}" class="m-wrap span12" type="text" placeholder="例如：检索,猜字谜">
				</div>
			</div>
			<div class="clearfix margin-bottom-20">
				<div class="control-group pull-left margin-right-20">
					<label class="control-label">录入时间开始:</label>
					<div class="controls">
						<div class="input-append date date-picker" data-date="2017-06-06" data-date-format="yyyy-mm-dd" data-date-viewmode="years">
							<input id="startTime" name="startTime"  style="height:34px" class="span9 m-wrap m-ctrl-medium date-picker" size="16" type="text" value="${startTime}" placeholder="例如：2017-06-06" /><span class="add-on"><i class="icon-calendar"></i></span>
						</div>
					</div>
				</div>
				<div class="control-group pull-left">
					<label class="control-label">录入时间结束:</label>
					<div class="controls">
						<div class="input-append date date-picker" data-date="2017-06-06" data-date-format="yyyy-mm-dd" data-date-viewmode="years" data-date-minviewmode="months">
							<input id="endTime" name="endTime"  style="height:34px" class="span9 m-wrap m-ctrl-medium date-picker" size="16" type="text" value="${endTime}" placeholder="例如：2017-06-06" /><span class="add-on"><i class="icon-calendar"></i></span>
						</div>
					</div>
				</div>
				<div class="control-group pull-left">
					<label class="control-label">应用编码:</label>
					<div class="controls">
						<div class="input-icon left">
							<i class="icon-user"></i>
							<input  id="application"  name="application" value="${application}" style="height:34px"  class="span11 m-wrap" type="text"  placeholder="例如：检索">
						</div>
					</div>
				</div>
				<div class="control-group pull-left">
					<label class="control-label">词库:</label>
					<div class="controls">
						<div class="input-icon left">
							<i class="icon-user"></i>
							<input  id="semantic" name="semantic" value="${semantic}" style="height:34px"  class="span11 m-wrap" type="text" placeholder="例如：MONITORRETRIEVE">
						</div>
					</div>
				</div>
			</div>
			<button type="button"  onclick="searchAnswer('1')" class="btn blue btn-block">SEARCH <i class="m-icon-swapright m-icon-white"></i></button>
	     </form>
	</div>
	<!--end booking-search-->
	</div>
	<div class="row-fluid">
		<div class="portlet-body" style="display: block;">
			<table class="table table-striped table-bordered table-advance table-hover">
				<thead>
					<tr>
						<!-- <th><i class="icon-briefcase"></i>应答ID</th> -->
						<!-- <th><i class="icon-briefcase"></i>机器人账号</th> -->
						<th><i class="icon-bookmark"></i>机器人名称</th>
						 <th class="span3"><i class="icon-bookmark"></i>问题</th>
						 <th class="span4"><i class="icon-bookmark"></i>内容</th>
						 <th><i class="icon-bookmark"></i>语义库</th>
						 <th><i class="icon-bookmark"></i>录入时间</th>
						 <th><i class="icon-bookmark"></i>模式</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="answer" items="${beans}"> 
					    <tr>
							<%-- <td><a href="#">${answer.answerId}</a></td> --%>
							<%-- <td><a href="#">${answer.account}</a></td> --%>
							<td>${answer.application}</td>
							 <td class="span3">${answer.question}</td> 
							 <td class="span4">${answer.content}</td> 
							 <td>${answer.semantic}</td> 
							 <td>${answer.createTime}</td> 
							 <td>${answer.pattern}</td> 
							<td><a class="btn mini green-stripe" href="${basePath}/admin/answer/edit?answerId=${answer.answerId}">编辑</a>|
							<a class="btn mini green-stripe" href="${basePath}/admin/answer/delete?answerId=${answer.answerId}">删除</a></td>
						</tr>
					</c:forEach>
					
				</tbody>

			</table>
            <div class="space5"></div>
            <div class="pagination pagination-right">
				<ul>
					<li class=""><a href="javascript:searchAnswer('1')">首页</a></li> 
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="javascript:searchAnswer('1')">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="javascript:searchAnswer('${curpage-1}')">Prev</a></li>
				   </c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2>5}">
						<c:forEach begin="1" end="${curpage-2>=5?5:curpage-3}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="javascript:searchAnswer('${page}')">${page}</a></li> 
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
								<li class="${curpage==page?'active':''}"><a href="javascript:searchAnswer('${page}')">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-4}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="javascript:searchAnswer('${page}')">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-5}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="javascript:searchAnswer('${page}')">${page}</a></li> 
							</c:forEach>
						</c:when>
					 <c:otherwise> 
							 <c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="javascript:searchAnswer('${page}')">${page}</a></li> 
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
							<li class="${curpage==page?'active':''}"><a href="javascript:searchAnswer('${page}')">${page}</a></li> 
						</c:forEach>
					</c:when>
				</c:choose>
				<c:choose>
				   <c:when test="${curpage== talpage}">  
				      <li><a href="javascript:searchAnswer('${talpage}')">Next</a></li>     
				   </c:when>
				   <c:otherwise> 
				      <li><a href="javascript:searchAnswer('${curpage+1}')">Next</a></li>
				   </c:otherwise>
				</c:choose>
					<li class=""><a href="javascript:searchAnswer('${talpage}')">尾页</a></li> 
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
<!-- END PAGE CONTAINER-->    
<script src="${basePath}/media/js/search.js"></script> 
<script src="${basePath}/media/js/bootstrap-datepicker.js"  type="text/javascript"></script>
<script>
	jQuery(document).ready(function() {    
	   Search.init();
	}); 
	function searchAnswer(curpage){
		$("#curpage").val(curpage);
		$("#searchForm").submit();
	}
</script>			