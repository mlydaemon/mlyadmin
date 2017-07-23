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
			         逻辑信息
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
					<form action="${basePath}/admin/logic/update" method="POST" class="form-horizontal">
						
						<input type="hidden" name="logicId" value="${bean.logicId}"/>
						<h3 class="form-section">逻辑信息</h3>
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
										   <option value="0">请选择</option>
									       <option <c:if test="${bean.sceneId eq 1}">selected="selected"</c:if> value="1">监控器</option>
									       <option <c:if test="${bean.sceneId eq 2}">selected="selected"</c:if> value="2">简况信息</option>
									       <option <c:if test="${bean.sceneId eq 3}">selected="selected"</c:if> value="3">猜字谜</option>
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
									<label class="control-label" >语义标识</label>
									<div class="controls">
										<input type="text"  name="command"  value="${bean.command}"  class="m-wrap span12" placeholder="例如：RIDDLEGUESSCONUNDRUM">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">逻辑编码</label>
									<div class="controls">
										<input type="text" name="code" value="${bean.code}" class="m-wrap span12" placeholder="例如：CONUNDRUM">
									</div>
								</div>
							</div>
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">备注</label>
									<div class="controls">
										<input type="text" name="comment" value="${bean.comment}" class="m-wrap span12" placeholder="例如：谜面">
									</div>
								</div>
							</div>
							<!--/span-->
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
		