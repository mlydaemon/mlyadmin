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
					<form action="${basePath}/member/account/modify" method="POST" class="form-horizontal">
					
						<h3 class="form-section">通讯地址</h3>
						<!--/row-->                   
						<div class="row-fluid">
							<div class="span12 ">
								<div class="control-group">
									<label class="control-label">街道</label>
									<div class="controls">
										<input type="text" name="street" value="${bean.street}" class="m-wrap span12" >
									</div>
								</div>
							</div>
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">市</label>
									<div class="controls">
										<input type="text" name="city" value="${bean.city}" class="m-wrap span12"> 
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >省</label>
									<div class="controls">
										<input type="text"  name="province" value="${bean.province}"  class="m-wrap span12"> 
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<!--/row-->           
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">邮编</label>
									<div class="controls">
										<input type="text" name="zipcode" value="${bean.zipcode}" class="m-wrap span12"> 
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">国家</label>
									<div class="controls">
										<input type="text" name="country" value="${bean.country}" class="m-wrap span12"> 
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
		