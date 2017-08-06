<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				知识库信息
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
					<form action="${basePath}/admin/repository/save" method="POST" class="form-horizontal">
						
						<h3 class="form-section">谜语信息</h3>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">雇主</label>
									<div class="controls">
										<input type="text" name="account"  class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >场景</label>
									<div class="controls">
										<input type="text"  name="application"   class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">语义</label>
									<div class="controls">
										<input type="text" name="semantic" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >指令</label>
									<div class="controls">
										<input type="text"  name="command"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>
						<!--/row-->
							<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">内容</label>
									<div class="controls">
										<input type="text" name="content" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >主参ID</label>
									<div class="controls">
										<input type="text"  name="masterId"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>	<div class="row-fluid">
							<div class="span12 ">
								<div class="control-group">
									<label class="control-label">创建时间</label>
									<div class="controls">
										<div class="input-append date date-picker" data-date="2017-08-01" data-date-format="yyyy-mm-dd" data-date-viewmode="years">
											<input style="height:34px" name="createTime" class="span9 m-wrap m-ctrl-medium date-picker" size="16" type="text" value="2017-08-01" /><span class="add-on"><i class="icon-calendar"></i></span>
										</div>
									</div>
								</div>
							</div>
							<!--/span-->
							<!--  <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >创建时间</label>
									<div class="controls">
										<input type="text"  name="createdTime"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							/span
						</div>	<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">更新时间</label>
									<div class="controls">
										<input type="text" name="updateTime" class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> -->
							<!--/span-->
						</div>
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/repository/list.html" class="btn">Cancel</a>
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
		