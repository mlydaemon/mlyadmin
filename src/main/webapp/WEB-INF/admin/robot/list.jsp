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
				机器人信息列表
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="${basePath}/admin/index.html">Dashboard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/robot/list.html">谜语类别列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/robot/add">创建机器人信息</a> 
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
						<!-- <th><i class="icon-briefcase"></i>身份ID</th> -->
						<th><i class="icon-briefcase"></i>昵称</th>
						<th></th>
						<th><i class="icon-bookmark"></i>机器人账号</th>
						 <!-- <th><i class="icon-bookmark"></i>类型</th> -->
						 <!-- <th><i class="icon-bookmark"></i>生日</th> -->
						 <!-- <th><i class="icon-bookmark"></i>性别</th>
						 <th><i class="icon-bookmark"></i>出生地</th> -->
						 <th></th>
						 <th><i class="icon-bookmark"></i>备注</th>
						 <th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="robot" items="${beans}"> 
					    <tr>
							<%-- <td><a href="#">${robot.robotId}</a></td> --%>
							 <td><a href="javascript:display(${robot.robotId})">${robot.nickname}(${robot.speciesName})</a></td>
							 <td></td>
							 <td>${robot.account}</td>
							 <%-- <td>${robot.speciesId}</td> 
							 <td>${robot.birthday}</td> 
							 <td>${robot.gender}</td> 
							 <td>${robot.comefrom}</td> 
							 <td>${robot.intro}</td>  --%>
							 <td></td>
							  <td>${robot.comment}</td>
							  <td>
								   <div class="btn-group">
										<button class="btn red dropdown-toggle" data-toggle="dropdown">操作 <i class="icon-angle-down"></i></button>
										<ul class="dropdown-menu" style="min-width: 80px;">
											<li><a href="${basePath}/admin/robot/edit?robotId=${robot.robotId}">编辑</a></li>
											<li><a href="${basePath}/admin/robot/delete?robotId=${robot.robotId}">删除</a></li>
											<li class="divider"></li>
											<li><a href="${basePath}/admin/robot/scene?robotId=${robot.robotId}">场景管理</a></li>
											<li><a href="${basePath}/admin/robot/app?robotId=${robot.robotId}">应用管理</a></li>
										</ul>
									</div>
								</td>
							<%-- <td><a class="btn mini green-stripe" href="${basePath}/admin/robot/edit?robotId=${robot.robotId}">编辑</a>|
							<a class="btn mini green-stripe" href="${basePath}/admin/robot/delete?robotId=${robot.robotId}">删除</a></td> --%>
						</tr>
						<div class="childChannels" style="display: hidden;">
							<c:forEach var="scene" items="${robot.scenes}">
								<tr class="scene${robot.robotId}  hiddendiv">
								     <td></td>
									 <td><a href="${basePath}/admin/robot/trainSceneCore?application=${scene.application}&robotAccount=${robot.account}&semantic=${scene.semantic}">${scene.sceneName}</a></td>
									 <td>${scene.application}</td>
									 <td><c:forEach var="logic" items="${scene.logics}"><a href="${basePath}/admin/robot/trainLogicCore?application=${scene.application}&robotAccount=${robot.account}&semantic=${logic.semantic}">${logic.logicName}</a>|</c:forEach></td>
									 <td>${scene.comment}</td>
									 <td></td>
								 </tr>
							</c:forEach>
						</div>
					</c:forEach>
					
				</tbody>

			</table>
            <div class="space5"></div>
            <div class="pagination pagination-right">
				<ul>
					<li class=""><a href="${basePath}/admin/robot/list?curpage=1">首页</a></li> 
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="${basePath}/admin/robot/list?curpage=1">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="${basePath}/admin/robot/list?curpage=${curpage-1}">Prev</a></li>
				   </c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2>5}">
						<c:forEach begin="1" end="${curpage-2>=5?5:curpage-3}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/robot/list?curpage=${page}">${page}</a></li> 
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
								<li class="active"><a href="${basePath}/admin/robot/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-4}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/robot/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-5}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/robot/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
					 <c:otherwise> 
							 <c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/robot/list?curpage=${page}">${page}</a></li> 
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
				      <li><a href="${basePath}/admin/robot/list?curpage=${talpage}">Next</a></li>     
				   </c:when>
				   <c:otherwise> 
				      <li><a href="${basePath}/admin/robot/list?curpage=${curpage+1}">Next</a></li>
				   </c:otherwise>
				</c:choose>
					<li class=""><a href="${basePath}/admin/robot/list?curpage=${talpage}">尾页</a></li> 
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
<script>
function display(classtag){
	$('.scene'+classtag).each(function(i){		 
		 if($(this).hasClass('showdiv')){
			 $(this).removeClass('showdiv');
			 $(this).addClass('hiddendiv');
		 }else if($(this).hasClass('hiddendiv')){
			 $(this).addClass('showdiv');
			 $(this).removeClass('hiddendiv');
		 }
	});
}
</script>			