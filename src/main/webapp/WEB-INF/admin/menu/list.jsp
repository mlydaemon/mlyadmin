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
				菜单列表
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="${basePath}/admin/index.html">DashBoard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/menu/list.html">菜单列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<%-- <li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/channel/add">创建栏目</a> 
					<i class="icon-angle-down"></i>
				</li>
				 --%>
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
					    
						<th><i class="icon-briefcase"></i>菜单名称</th>
						<th></th>
						<th class="hidden-phone"><i class="icon-question-sign"></i> 菜单路径</th>
						<th><i class="icon-bookmark"></i> 外部链接</th>
						
						<th><i class="icon-briefcase"></i>类别</th>
						<th><i class="icon-bookmark"></i> 排序</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="menu" items="${beans}"> 
					    <tr >
							<td><a href="javascript:display(${menu.menuId})">${menu.menuName}</a></td>
							<td></td>
							<td class="hidden-phone">${menu.menuPath}</td>
							<td>${menu.link}</td>
							<td><c:choose> 
							  <c:when test="${menu.display == 0}">   
							    功能  
							  </c:when>
							  <c:when test="${menu.display == 1}">   
							   菜单  
							  </c:when> 
							  <c:when test="${menu.display == 2}">   
							    分类  
							  </c:when>  
							  </c:choose>
							  </td> 
							<td>${menu.priority}</td>							
							<%-- <td><a class="btn mini green-stripe" href="${basePath}/admin/channel/edit?channelId=${channel.channelId}">编辑</a>|
							<a class="btn mini green-stripe" href="${basePath}/admin/channel/delete?channelId=${channel.channelId}">删除</a></td> --%>
						</tr>
						<div class="childChannels" style="display: hidden;">
						 <c:forEach var="child" items="${menu.children}">
				             <tr class="channel${menu.menuId}  hiddendiv">
								<td></td>
								<td><a href="#">${child.menuName}</a></td>
								<td class="hidden-phone">${child.menuPath}</td>
								<td>${child.link}</td>
								<td><c:choose> 
								  <c:when test="${child.display == 0}">功能  </c:when>
								  <c:when test="${child.display == 1}">菜单   </c:when> 
								  <c:when test="${child.display == 2}">分类 </c:when>  
								  </c:choose>
								 </td> 
								<td>${child.priority}</td>							
								<%-- <td><a class="btn mini green-stripe" href="${basePath}/admin/channel/edit?channelId=${child.channelId}">编辑</a>|
								<a class="btn mini green-stripe" href="${basePath}/admin/channel/delete?channelId=${child.channelId}">删除</a></td> --%>
							</tr>
				         </c:forEach>
				         </div>	
					</c:forEach>
					
				</tbody>

			</table>
            <div class="space5"></div>
            <div class="pagination pagination-right">
				<ul>
					<li class=""><a href="${basePath}/admin/menu/list?curpage=1">首页</a></li> 
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="${basePath}/admin/menu/list?curpage=1">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="${basePath}/admin/menu/list?curpage=${curpage-1}">Prev</a></li>
				   </c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2>5}">
						<c:forEach begin="1" end="${curpage-2>=5?5:curpage-3}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/menu/list?curpage=${page}">${page}</a></li> 
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
							<li class="active"><a href="${basePath}/admin/menu/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
					<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
						<c:forEach begin="${curpage-2<1?1:talpage-4}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
							<li class="active"><a href="${basePath}/admin/menu/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
					<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
						<c:forEach begin="${curpage-2<1?1:talpage-5}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
							<li class="active"><a href="${basePath}/admin/menu/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
					 <c:otherwise> 
							 <c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/menu/list?curpage=${page}">${page}</a></li> 
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
				      <li><a href="${basePath}/admin/menu/list?curpage=${talpage}">Next</a></li>     
				   </c:when>
				   <c:otherwise> 
				      <li><a href="${basePath}/admin/menu/list?curpage=${curpage+1}">Next</a></li>
				   </c:otherwise>
				</c:choose>
					<li class=""><a href="${basePath}/admin/menu/list?curpage=${talpage}">尾页</a></li> 
				</ul>
			</div>
			</div>
		</div>
	</div>
<!-- END PAGE CONTAINER-->    
<script>
function display(classtag){
	$('.channel'+classtag).each(function(i){		 
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