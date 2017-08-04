<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				账户信息
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="${basePath}/admin/index.html">DashBoard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/channel/list.html">栏目列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/channel/edit?channelId=${bean.channelId}">${bean.channelName}编辑</a> 
					<i class="icon-angle-down"></i>
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
					<form action="${basePath}/admin/channel/update" method="POST" class="form-horizontal">
						
						<input type="hidden" name="channelId" value="${bean.channelId}"/>
						<h3 class="form-section">基本信息</h3>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">栏目名称</label>
									<div class="controls">
										<input type="text" name="channelName" value="${bean.channelName}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >栏目路径</label>
									<div class="controls">
										<input type="text"  name="channelPath"  value="${bean.channelPath}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">分类</label>
									<div class="controls">
										<select name="parentId"  class="span12 m-wrap">
										<option value="0">请选择</option>
										 <c:forEach var="channel" items="${beans}"> 
									       <option  <c:if test="${bean.parentId eq channel.channelId}" >selected="selected"</c:if> value="${channel.channelId}">${channel.channelName}</option>
									　　</c:forEach>											
										</select>
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
							
								<div class="control-group">
									<label class="control-label">类型</label>
									<div class="controls">
										<select name="display" class="span12 m-wrap" tabindex="1">
										    <option value="0">请选择</option>
											<option  <c:if test="${bean.display == 1}">selected = "selected"</c:if> value="0">功能</option>
											<option  <c:if test="${bean.display == 2}">selected = "selected"</c:if>value="1">菜单</option>
											<option  <c:if test="${bean.display == 3}">selected = "selected"</c:if>value="2">分类</option>
										</select>
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<!--/row-->
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">外部链接</label>
									<div class="controls">
										<input type="text" name="link" value="${bean.link}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >排序</label>
									<div class="controls">
										<input type="text"  name="priority"  value="${bean.priority}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<!--/row-->
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/channel/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		