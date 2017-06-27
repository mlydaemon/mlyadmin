<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
					<form action="${basePath}/admin/account/repassword" class="form-horizontal">
						<h3 class="form-section">修改密码</h3>
						
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">当前密码</label>
									<div class="controls">
										<input type="text" name="password" class="m-wrap span12"> 
									</div>
								</div>
							</div>
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">修改密码</label>
									<div class="controls">
										<input type="text" name="repassword" class="m-wrap span12"> 
									</div>
								</div>
							</div>
						</div>
						<div class="row-fluid">
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >修改密码</label>
									<div class="controls">
										<input type="text" name="repassword1"   class="m-wrap span12"> 
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						
						
						<!--/row-->
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<button type="button" class="btn">Cancel</button>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		