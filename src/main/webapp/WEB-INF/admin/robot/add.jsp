<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="${basePath}/media/css/datepicker.css" rel="stylesheet" type="text/css" />
<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				机器人信息
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
					<form action="${basePath}/admin/robot/save" method="POST" class="form-horizontal">
						
						<h3 class="form-section">机器人信息</h3>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">机器人账号</label>
									<div class="controls">
										<input type="text" name="account"  class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >昵称</label>
									<div class="controls">
										<input type="text"  name="nickname"   class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>
						<!--/row-->
						<div class="row-fluid">
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >类型</label>
									<div class="controls">
										<select name="speciesId"  class="span12 m-wrap" tabindex="1">
										<option value="0">选择类型</option>
											<c:forEach var="species" items="${beans}"> 
										       <option value="${species.speciesId}">${species.speciesName}</option>
										　　</c:forEach>											
										</select>
									</div>
								</div>
							</div> 
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">生日</label>
									<div class="controls">
									<div class="input-append date date-picker" data-date="12-02-2012" data-date-format="dd-mm-yyyy" data-date-viewmode="years">
										<input style="height:34px" class="span9 m-wrap m-ctrl-medium date-picker" size="16" type="text" value="12-02-2012" /><span class="add-on"><i class="icon-calendar"></i></span>
									</div>
										<!-- <input type="text" name="birthday" class="m-wrap span12" placeholder="Chee Kin"> -->
									</div>
								</div>
							</div>
						</div>
						<!--/row-->
						<div class="row-fluid">
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >性别</label>
										<div class="controls">
											<select name="gender" class="span12 m-wrap" tabindex="1">
											    <option value="">请选择</option>
												<option  value="0">女</option>
												<option  value="1">男</option>
											</select>
										</div>
								</div>
							</div> 
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">出生地</label>
									<div class="controls">
										<input type="text" name="comefrom" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
						</div>
						<div class="row-fluid">
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >爱好</label>
									<div class="controls">
										<input type="text"  name="hobby"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">备注</label>
									<div class="controls">
										<input type="text" name="comment" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
						</div>
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/robot/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->   
<script src="${basePath}/media/js/search.js"></script> 
<script src="${basePath}/media/js/bootstrap-datepicker.js"  type="text/javascript"></script>
<script>
	jQuery(document).ready(function() {    
	   Search.init();
	});
</script>	
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
		