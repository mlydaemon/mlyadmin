<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
					<a href="${basePath}/admin/position/list.html">职位列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/position/edit?positionId=${bean.positionId}">${bean.positionName}编辑</a>
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
					<form action="${basePath}/admin/position/update" method="POST" class="form-horizontal">
						
						<input type="hidden" name="positionId" value="${bean.positionId}"/>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">职位名称</label>
									<div class="controls">
										<input type="text" name="positionName" value="${bean.positionName}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >部门名称</label>
									<div class="controls">
										<select name="departmentId"  class="span12 m-wrap" tabindex="1">
										<option value="0">请选择</option>
										<c:forEach var="department" items="${beans}"> 
									       <option <c:if test="${bean.departmentId eq department.departmentId}">selected="selected"</c:if> value="${department.departmentId}">${department.departmentName}</option>
									　　</c:forEach>											
										</select>
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="control-group">
									<label class="control-label">权限赋值</label>
									<div class="controls">
										<select multiple="multiple" id="permissions" name="permissions">
											<c:forEach var="channel" items="${channels}"> 
										       <optgroup label="${channel.channelName}">
											       <c:forEach var="child" items="${channel.children}">
											         <option   <c:if test="${fn:contains(bean.channelIds, child.channelId)}" >selected="selected"</c:if> value="${child.channelId}">${child.channelName}</option>
											       </c:forEach>	 
										       </optgroup>
										　　</c:forEach>	
										</select>
									</div>
								</div>
							</div>
						<%-- <div class="row-fluid">
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
						</div> --%>
						<!--/row-->
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/position/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		