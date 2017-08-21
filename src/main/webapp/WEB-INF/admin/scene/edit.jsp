<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link href="${basePath}/media/css/datepicker.css" rel="stylesheet" type="text/css" />
<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/select2_metro.css">
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/jquery.tagsinput.css">
<script type="text/javascript" src="${basePath}/media/js/select2.min.js"></script>
<script src="${basePath}/media/js/form-components.js"></script> 
<script >
	jQuery(document).ready(function() {       
	  $("#select2_sample5").select2({
		      tags: ["看书", "看电影", "猜字谜", "旅游", "登山"]
	    });
	});
</script> 
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				场景信息
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
					<form action="${basePath}/admin/scene/update" method="POST" class="form-horizontal">
						
						<input type="hidden" name="sceneId" value="${bean.sceneId}"/>
						<h3 class="form-section">场景信息</h3>
						<div class="row-fluid">
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >场景名称</label>
									<div class="controls">
										<input type="text"  name="sceneName"  value="${bean.sceneName}"  class="m-wrap span12" placeholder="例如：聊天">
									</div>
								</div>
							</div> 
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >应用编码</label>
									<div class="controls">
										<input type="text"  name="application"  value="${bean.application}"  class="m-wrap span12" placeholder="例如：RIDDLEGUESS">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
						
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">核心词库</label>
									<div class="controls">
										<input type="text" name="semantic" value="${bean.semantic}" class="m-wrap span12" placeholder="例如：RIDDLEGUESSCORE">
									</div>
								</div>
							</div>
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">是否启用</label>
									<div class="controls">
									   <select name="active" class="span12 m-wrap" tabindex="1">
										    <option value="">请选择</option>
											<option <c:if test="${bean.active eq 1}">selected="selected"</c:if>  value="1">启用</option>
											<option <c:if test="${bean.active eq 0}">selected="selected"</c:if>  value="0">禁用</option>
										</select>
									</div>
								</div>
							</div>
						</div>
						<div class="row-fluid">
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >等级</label>
									<div class="controls">
									     <select name="level" class="span12 m-wrap" tabindex="1">
											<option <c:if test="${bean.level eq 'MASTER'}">selected="selected"</c:if> value="MASTER">MASTER</option>
											<option <c:if test="${bean.level eq 'SLAVE'}">selected="selected"</c:if> value="SLAVE">SLAVE</option>
											<option <c:if test="${bean.level eq 'DAEMON'}">selected="selected"</c:if>  value="DAEMON">DAEMON</option>
											<option <c:if test="${bean.level eq 'DEMAND'}">selected="selected"</c:if>  value="DEMAND">DEMAND</option>
										 </select>
									</div>
								</div>
							</div> 
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >执行者</label>
									<div class="controls">
										<input type="text"  name="performer"  value="${bean.performer}"  class="m-wrap span12" placeholder="例如：RIDDLEGUESS">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
							 <div class="span12 ">
								<div class="control-group">
									<label class="control-label" >处理者</label>
									<div class="controls">
										<input type="text"  name="processor"  value="${bean.processor}"  class="m-wrap span12" placeholder="例如：聊天">
									</div>
								</div>
							</div> 
						</div>
						<div class="row-fluid">
						   <div class="span12 ">
								<div class="control-group">
									<label class="control-label" >关键词</label>
									<div class="controls">
										<input type="hidden"  name="keywords" id="select2_sample5" class="span12 select2" value="${bean.keywords}">
									</div>
								</div>
							</div>
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
							<a href="${basePath}/admin/scene/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		