<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				机器人信息
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="${basePath}/admin/index.html">Dashboard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/robot/list.html">谜语类别列表</a>
					<i class="icon-angle-right"></i>
				</li>
			</ul>
			<!-- END PAGE TITLE & BREADCRUMB-->
		</div>
	</div>
	<!-- END PAGE HEADER-->
	<div class="row-fluid">
		 <div class="portlet box ">
				<div class="portlet-body form">
					<!-- BEGIN FORM-->
					<form action="${basePath}/admin/robot/save" method="POST" class="form-horizontal">
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
										       <option value="${species.speciesId}">${species.speciesName}(${species.parentName})</option>
										　　</c:forEach>											
										</select>
									</div>
								</div>
							</div> 
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">生日</label>
									<div class="controls">
										<div class="input-append date date-picker" data-date="2017-08-01" data-date-format="yyyy-mm-dd" data-date-viewmode="years">
											<input style="height:34px" name="birthday" class="span9 m-wrap m-ctrl-medium date-picker" size="16" type="text" value="2017-08-01" /><span class="add-on"><i class="icon-calendar"></i></span>
										</div>
										<!-- <input type="text" name="birthday" class="m-wrap span12" placeholder="Chee Kin"> -->
									</div>
								</div>
							</div>
						</div>
						<div class="row-fluid">
						   <div class="span6 ">
								<div class="control-group">
									<label class="control-label">出生地</label>
									<div class="controls">
										<input type="text" name="comefrom" class="m-wrap span12" placeholder="出生地">
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
										<label class="radio">
										 <div class="radio hover"><span><input type="radio"  name="active" value="1"></span></div>男
										</label>
										<label class="radio">
										 <div class="radio hover"><span><input type="radio" name="active" value="0"></span></div>女
										</label>
									</div>
								</div>
							</div> 
						</div>
						<div class="row-fluid">
						   <div class="span12 ">
								<div class="control-group">
									<label class="control-label" >爱好</label>
									<div class="controls">
										<input type="hidden"  name="hobby" id="select2_sample5" class="span12 select2" value="">
									</div>
								</div>
							</div>
						</div>
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
							<a href="${basePath}/admin/robot/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
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
		