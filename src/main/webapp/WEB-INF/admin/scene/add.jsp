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
				场景信息
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
					<form action="${basePath}/admin/scene/save" method="POST" class="form-horizontal">
						
						<h3 class="form-section">场景信息</h3>
						<div class="row-fluid">
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >场景名称</label>
									<div class="controls">
										<input type="text"  name="sceneName"   class="m-wrap span12"  placeholder="例如：聊天">
									</div>
								</div>
							</div> 
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >应用编码</label>
									<div class="controls">
										<input type="text"  name="application"  class="m-wrap span12"  placeholder="例如：RIDDLEGUESS">
									</div>
								</div>
							</div> 
							<!--/span-->
							
						</div>
						<!--/row-->
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">核心词库</label>
									<div class="controls">
										<input type="text" name="semantic" class="m-wrap span12"  placeholder="例如：RIDDLEGUESSCORE">
									</div>
								</div>
							</div>
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">是否启用</label>
									<div class="controls">
								       <select name="active" class="span12 m-wrap" tabindex="1">
										    <option value="">请选择</option>
											<option  value="1">启用</option>
											<option  value="0">禁用</option>
										</select>
									</div>
								</div>
							</div>
						</div>
						<div class="row-fluid">
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >备注</label>
									<div class="controls">
										<input type="text"  name="comment"  class="m-wrap span12" placeholder="例如：场景">
									</div>
								</div>
							</div> 
						</div> 
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
		