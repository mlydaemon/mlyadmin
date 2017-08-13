<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				应答信息
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
					<form action="${basePath}/admin/answer/save" method="POST" class="form-horizontal">
						
						<h3 class="form-section">语义信息</h3>
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
									<label class="control-label" >机器人名称</label>
									<div class="controls">
										<input type="text"  name="application"   class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>
						<!--/row-->
						<div class="row-fluid">
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >问题</label>
									<div class="controls">
										<input type="text"  name="question"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">内容</label>
									<div class="controls">
										<input type="text" name="content" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
						</div>
						<!--/row-->
						<div class="row-fluid">
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >语义</label>
									<div class="controls">
										<input type="text"  name="semantic"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">模式</label>
									<div class="controls">
										<input type="text" name="pattern" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
						</div>
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/answer/list.html" class="btn">Cancel</a>
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
		