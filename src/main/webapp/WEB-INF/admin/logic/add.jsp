<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="${basePath}/media/css/datepicker.css" rel="stylesheet" type="text/css" />
<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/select2_metro.css">
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/jquery.tagsinput.css">
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
					<a href="${basePath}/admin/index.html">DashBoard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/logic/list.html">逻辑列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/logic/add">创建逻辑</a>
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
					<form action="${basePath}/admin/logic/save" method="POST" class="form-horizontal">
						
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">逻辑名称</label>
									<div class="controls">
										<input type="text" name="logicName"  class="m-wrap span12" placeholder="例如：字谜谜面">
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
											<c:forEach var="scene" items="${beans}"> 
										       <option value="${scene.sceneId}">${scene.sceneName}</option>
										　　</c:forEach>											
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
									<label class="control-label" >语义词库</label>
									<div class="controls">
										<input type="text"  name="semantic"   class="m-wrap span12" placeholder="例如：RIDDLEGUESSCONUNDRUM">
									</div>
								</div>
							</div> 
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >逻辑命令</label>
									<div class="controls">
										<input type="text"  name="command"   class="m-wrap span12" placeholder="例如：字谜谜面">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>
						<!--/row-->
						<div class="row-fluid">
							 <div class="span12 ">
								<div class="control-group">
									<label class="control-label" >逻辑编码</label>
									<div class="controls">
										<input type="text"  name="code"  class="m-wrap span12" placeholder="例如；GUIDANCE">
									</div>
								</div>
							</div> 
							 
						</div>
						<!--/row-->
						<div class="row-fluid">
							<div class="span12 ">
								<div class="control-group">
									<label class="control-label">备注</label>
									<div class="controls">
									  <textarea name="comment"  class="large m-wrap" rows="3"></textarea>
									</div>
								</div>
							</div>
						</div>
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
<!-- <script type="text/javascript">
      $('#controls').datetimepicker({
        format: 'MM/dd/yyyy hh:mm',
        language: 'en',
        pickDate: true,
        pickTime: true,
        hourStep: 1,
        minuteStep: 15,
        secondStep: 30,
        inputMask: true
      });
    </script>  -->
		