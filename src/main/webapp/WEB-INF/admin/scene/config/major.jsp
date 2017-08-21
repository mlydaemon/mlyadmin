<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link href="${basePath}/media/css/datepicker.css" rel="stylesheet" type="text/css" />
<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/select2_metro.css">
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/jquery.tagsinput.css">
<script type="text/javascript" src="${basePath}/media/js/select2.min.js"></script>
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
				<form action="${basePath}/admin/scene/upmajor" method="POST" >
				   <input type="hidden" name="sceneId" value="${bean.sceneId}"/>
				   <div class="row-fluid" style="background: #fafafa;"  class="form-horizontal">
				        <!--/span-->
						<div class="span2 ">
							<div class="control-group">
								<label class="control-label" >场景名称</label>
								<div class="controls">
									<input type="text" id="sceneName" value="${bean.sceneName}"  class="m-wrap span12" placeholder="例如：聊天">
								</div>
							</div>
						</div>
						<div class="span2 ">
							<div class="control-group">
								<label class="control-label" >应用编码</label>
								<div class="controls">
									<input type="text" id="application"  value="${bean.application}"  class="m-wrap span12" placeholder="例如：RIDDLEGUESS">
								</div>
							</div>
						</div>
						<!--/span-->
						<div class="span2 ">
							<div class="control-group">
								<label class="control-label">核心词库</label>
								<div class="controls">
									<input type="text" id="semantic" value="${bean.semantic}" class="m-wrap span12" placeholder="例如：RIDDLEGUESSCORE">
								</div>
							</div>
						</div>
						<!--/span-->
						<div class="span2 ">
							<div class="control-group">
								<label class="control-label">等级</label>
								<div class="controls">
									<input type="text" id="level" value="${bean.level}" class="m-wrap span12" placeholder="例如：MASTER">
								</div>
							</div>
						</div>
						<!--/span-->
						<div class="span2 ">
							<div class="control-group">
								<label class="control-label">备注</label>
								<div class="controls">
									<input type="text"  value="${bean.comment}" class="m-wrap span12" placeholder="例如：MASTER">
								</div>
							</div>
						</div>
				   </div> 
					<!--/row-fluid-->
					<div class="row-fluid">
						  <!--/span-->
						  <div class="span10">
							<div class="control-group">
								<label class="control-label" >MAJOR逻辑</label>
								<div class="controls">
								   <select name="logicode"  class="span12 m-wrap" tabindex="1">
								       <option value="">选择逻辑</option>
									   <c:forEach var="logic" items="${bean.logics}"> 
										       <option <c:if test="${bean.major eq logic.code}" >selected="selected"</c:if> value="${logic.code}">${logic.logicName}(${logic.command}):${logic.comment}</option>
										</c:forEach>	
									</select>
								</div>
								
						 	</div>
						  </div>
						  <!--/span-->
						  <!--/span-->
						  <div class="span2 ">
							  <div class="control-group">
									<label class="control-label" >&nbsp;</label>
									<div class="controls">
									    <button type="submit" class="btn blue btn-block" >提交 <i class="m-icon-swapright m-icon-white"></i></button>
									</div>
							  </div>
						  </div>
						  <!--/span-->
					</div>
                  </form>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->   
