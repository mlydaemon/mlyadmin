<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				谜语类别信息
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="#">感谢您注册**网</a> 
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
					<form action="${basePath}/admin/riddleClassify/save" method="POST" class="form-horizontal">
						
						<h3 class="form-section">谜语类别信息</h3>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">谜语类型</label>
									<div class="controls">
										<input type="text" name="classify"  class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >分类优先级</label>
									<div class="controls">
										<input type="text"  name="priority"   class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">是否为空</label>
									<div class="controls">
										<input type="text"  name="hascontent"   class="m-wrap span12" placeholder="dd/mm/yyyy">
										<%-- <select name="parentId"  class="span12 m-wrap" tabindex="1">
										<option value="0">请选择</option>
										<c:forEach var="channel" items="${beans}"> 
									       <option value="${channel.channelId}">${channel.channelName}</option>
									　　</c:forEach>											
										</select> --%>
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">是否显示</label>
									<div class="controls">
										<input type="text"  name="display"   class="m-wrap span12" placeholder="dd/mm/yyyy">
										<!-- <select name="display" class="span12 m-wrap">
										    <option value="0">请选择</option>
											<option value="1">功能</option>
											<option value="2">菜单</option>
											<option value="3">分类</option>
										</select> -->
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<!--/row-->
						
						<div class="row-fluid">
							<div class="span6 ">
								<!-- <div class="control-group">
									<label class="control-label">外部链接</label>
									<div class="controls">
										<input type="text" name="link" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div> -->
							</div>
							<!--/span-->
							<div class="span6 ">
								<!-- <div class="control-group">
									<label class="control-label" >排序</label>
									<div class="controls">
										<input type="text"  name="priority"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div> -->
							</div>
							<!--/span-->
						</div>
						<!--/row-->
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/riddleClassify/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		