<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link href="${basePath}/media/css/datepicker.css" rel="stylesheet" type="text/css" />
<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/select2_metro.css">
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/jquery.tagsinput.css">
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
			         逻辑信息
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="${basePath}/admin/index.html">DashBoard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/logic/list.html">逻辑列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/logic/edit?logicId=${bean.logicId}">${bean.logicName}编辑</a>
					<i class="icon-angle-right"></i>
				</li>
			</ul>
			<!-- END PAGE TITLE & BREADCRUMB-->
		</div>
	</div>
	<!-- END PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
		
		 <div class="portlet box ">
				<div class="portlet-body form">
					<!-- BEGIN FORM-->
					<form action="${basePath}/admin/logic/update" method="POST" class="form-horizontal">
						
						<input type="hidden" name="logicId" value="${bean.logicId}"/>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">逻辑名称</label>
									<div class="controls">
										<input type="text" name="logicName" value="${bean.logicName}" class="m-wrap span12" placeholder="例如：字谜谜面">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">场景名称</label>
									<div class="controls">
										<select name="sceneId"  class="span12 m-wrap" tabindex="1">
										    <option value="0">选择类型</option>
											<c:forEach var="scene" items="${beans}"> 
										       <option <c:if test="${bean.sceneId eq scene.sceneId}" >selected="selected"</c:if> value="${scene.sceneId}">${scene.sceneName}</option>
										　　</c:forEach>											
										</select>
									</div>
								</div>
							</div>
							<!--/span-->
							
						</div>
						<div class="row-fluid">
						    <!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >语义词库</label>
									<div class="controls">
										<input type="text"  name="semantic"  value="${bean.semantic}"  class="m-wrap span12" placeholder="例如：RIDDLEGUESSCONUNDRUM">
									</div>
								</div>
							</div> 
							<!--/span-->
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >逻辑命令</label>
									<div class="controls">
										<input type="text"  name="command"  value="${bean.command}"  class="m-wrap span12" placeholder="例如：字谜谜面">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span12 ">
								<div class="control-group">
									<label class="control-label">逻辑编码</label>
									<div class="controls">
										<input type="text" name="code" value="${bean.code}" class="m-wrap span12" placeholder="例如：CONUNDRUM">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span12 ">
								<div class="control-group">
									<label class="control-label">备注</label>
									<div class="controls">
									     <textarea name="comment"  class="large m-wrap" rows="3">${bean.comment}</textarea>
									</div>
								</div>
							</div>
						</div>	
						<!--/row-->
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/logic/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		