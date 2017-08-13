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
				场景列表
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="${basePath}/admin/index.html">Dashboard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/scene/list.html">场景列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/scene/add">创建场景信息</a> 
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
						<!-- <th><i class="icon-briefcase"></i>场景ID</th> -->
						<th><i class="icon-bookmark"></i>场景名称</th>
						<th></th>
						 <th><i class="icon-bookmark"></i>应用编码</th>
						 <th><i class="icon-bookmark"></i>核心词库</th>
						 <th><i class="icon-bookmark"></i>等级</th>
						 <th><i class="icon-bookmark"></i>关键词</th>
						  <th><i class="icon-bookmark"></i>是否启用</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="scene" items="${beans}"> 
					    <tr>
							<%-- <td><a href="#">${scene.sceneId}</a></td> --%>
							 <td><a href="javascript:display(${scene.sceneId})">${scene.sceneName}</a></td>
							 <td></td>
							 <td>${scene.application}</td> 
							 <td>${scene.semantic}</td> 
							 <td>${scene.level}</td> 
							 <td>${scene.keywords}</td>
							  <td>${scene.active==1?"启用":"禁用"}</td> 
							 <td>
							     <div class="btn-group">
									  <button class="btn red dropdown-toggle" data-toggle="dropdown">操作 <i class="icon-angle-down"></i></button>
									  <ul class="dropdown-menu" >
									      <li><a href="${basePath}/admin/scene/preview?sceneId=${scene.sceneId}">预览</a></li>
										  <li><a href="${basePath}/admin/scene/edit?sceneId=${scene.sceneId}">编辑</a></li>
										  <li><a href="${basePath}/admin/scene/delete?sceneId=${scene.sceneId}">删除</a></li>
										  <li class="divider"></li>
										  <c:if  test="${scene.major!=null}">
										  	 <li><a href="${basePath}/admin/repository/add?sceneId=${scene.sceneId}">添加知识库</a></li>
										  </c:if>
										  <c:if  test="${scene.major==null}">
										  <li style="background-color: #d8d8d8;"><a>添加知识库</a></li>
										  </c:if>
										  <li><a href="${basePath}/admin/scene/config/major?sceneId=${scene.sceneId}">MAJOR配置</a></li>
										  <li><a href="${basePath}/admin/scene/config/keywords?sceneId=${scene.sceneId}">语义配置</a></li>
										  <li><a href="${basePath}/admin/scene/config/replys?sceneId=${scene.sceneId}">应答配置</a></li>
									  </ul>
								  </div>
							</td> 
						</tr>
						<div class="childChannels" style="display: hidden;">
							<c:forEach var="logic" items="${scene.logics}">
							<tr class="logic${scene.sceneId}  hiddendiv">
							     <td></td>
								 <td>${logic.logicName}</td>
								 <td>${logic.code}</td> 
								 <td>${logic.semantic}</td> 
							     <td>${scene.major eq logic.code?"MAJOR":""}</td>
								 <td></td>
								 <td>启用</td>
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
				<c:forEach begin="1" end="1" var = "page">
					<li class=""><a href="${basePath}/admin/scene/list?curpage=1">首页</a></li> 
				</c:forEach>
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="${basePath}/admin/scene/list?curpage=1">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="${basePath}/admin/scene/list?curpage=${curpage-1}">Prev</a></li>
				   </c:otherwise>
				</c:choose>
				
				<c:choose>
						<c:when test="${curpage+2<5&&curpage-2<talpage-5&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:5}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/scene/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-4}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/scene/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-5}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/scene/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
					 <c:otherwise> 
							 <c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/scene/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
					</c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2<talpage-5}">
						<li class=""><a href="#">……</a></li> 
					</c:when>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2<=talpage-5}">
						<c:forEach begin="${talpage-4}" end="${talpage}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/scene/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
				</c:choose>
				<c:choose>
				   <c:when test="${curpage== talpage}">  
				      <li><a href="${basePath}/admin/scene/list?curpage=${talpage}">Next</a></li>     
				   </c:when>
				   <c:otherwise> 
				      <li><a href="${basePath}/admin/scene/list?curpage=${curpage+1}">Next</a></li>
				   </c:otherwise>
				</c:choose>
					<li class=""><a href="${basePath}/admin/scene/list?curpage=${talpage}">尾页</a></li> 
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
<script>
function display(classtag){
	$('.logic'+classtag).each(function(i){		 
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