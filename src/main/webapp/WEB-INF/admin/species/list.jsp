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
				种类列表
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="${basePath}/admin/index.html">DashBoard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/species/list.html">种类列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/species/add">创建机器人</a> 
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
						 <!-- <th></th> --> 
						<th  class="span2"><i class="icon-bookmark"></i>名称</th>
						<th class="span2"></th>
						 <th  class="span2"><i class="icon-bookmark"></i>是否启用</th>
						 <th   class="span3"><i class="icon-bookmark"></i>备注</th> 
						<th class="span3"></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="species" items="${beans}"> 
					    <tr>
							<!-- <td class=" "><span class="row-details"></span></td> -->
							<td class="span2"><a href="javascript:display(${species.speciesId})">${species.speciesName}(${species.children.size()})</a></td>
							<td class="span2"></td>
							 <td class="span2">
							 	<c:choose>
								   <c:when test="${species.active==0}">  
									    <p style="color:red">不启用</p>    
								   </c:when>
								   <c:otherwise> 
								   	        <p style="color:green">启用</p>
								   </c:otherwise>
								</c:choose>
							 </td> 
							 <td class="span3">${species.comment}</td> 
							<td class="span3"><a class="btn mini green-stripe" href="${basePath}/admin/species/edit?speciesId=${species.speciesId}">编辑</a>|
							<a class="btn mini green-stripe" href="${basePath}/admin/species/delete?speciesId=${species.speciesId}">删除</a></td>
						</tr>
						<!-- 添加子查询，显示下一级 -->
						<div class="childChannels" style="display: hidden;">
						 <c:forEach var="child" items="${species.children}">
				             <tr class="species${species.speciesId}  hiddendiv">
								<td class="span2"></td>
								<!-- <td class="span2"></td> -->
								<td class="span2">${child.speciesName}</td>
								<td class="span2">
								<c:choose> 
								  <c:when test="${child.active == 0}">不启用  </c:when>
								  <c:when test="${child.active == 1}">启用</c:when> 
								  </c:choose>
								 </td> 
								 <td class="span3">${child.comment}</td> 
								<td class="span3"><a class="btn mini green-stripe" href="${basePath}/admin/species/edit?channelId=${child.speciesId}">编辑</a>|
								<a class="btn mini green-stripe" href="${basePath}/admin/spceies/delete?channelId=${child.speciesId}">删除</a></td>
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
					<li class=""><a href="${basePath}/admin/species/list?curpage=1">首页</a></li> 
				</c:forEach>
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="${basePath}/admin/species/list?curpage=1">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="${basePath}/admin/species/list?curpage=${curpage-1}">Prev</a></li>
				   </c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2>5}">
						<c:forEach begin="1" end="${curpage-2>=5?5:curpage-3}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/species/list?curpage=${page}">${page}</a></li> 
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
								<li class="active"><a href="${basePath}/admin/species/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-4}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/species/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-5}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/species/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
					 <c:otherwise> 
							 <c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="active"><a href="${basePath}/admin/species/list?curpage=${page}">${page}</a></li> 
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
				      <li><a href="${basePath}/admin/species/list?curpage=${talpage}">Next</a></li>     
				   </c:when>
				   <c:otherwise> 
				      <li><a href="${basePath}/admin/species/list?curpage=${curpage+1}">Next</a></li>
				   </c:otherwise>
				</c:choose>
					<li class=""><a href="${basePath}/admin/species/list?curpage=${talpage}">尾页</a></li> 
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->   
<script>
function display(classtag){
	$('.species'+classtag).each(function(i){		 
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
		