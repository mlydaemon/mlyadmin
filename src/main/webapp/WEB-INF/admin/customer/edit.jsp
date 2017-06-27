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
					<form action="${basePath}/admin/customer/update" method="POST" class="form-horizontal">
						<input type="hidden" name="customerId" value="${bean.memberId}"/>
						
						<h3 class="form-section">基本信息</h3>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">姓名</label>
									<div class="controls">
										<input type="text" name="nickname" value="${bean.nickname}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >生日</label>
									<div class="controls">
										<input type="text"  name="birthday"  value="${bean.birthday}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<!--/row-->
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">性别</label>
									<div class="controls">
										<select class="m-wrap span12" name="gender">
											<option value="">Male</option>
											<option value="">Female</option>
										</select>
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">等级</label>
									<div class="controls">
										<select class="span12 select2_category"  data-placeholder="Choose a Category" tabindex="1">
											<option value=""></option>
											<option value="Category 1">Category 1</option>
											<option value="Category 2">Category 2</option>
											<option value="Category 3">Category 5</option>
											<option value="Category 4">Category 4</option>
										</select>
									</div>
								</div>
							</div>
							
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">QQ</label>
									<div class="controls">
										<input type="text" name="qq"   value="${bean.qq}"  class="m-wrap span12"> 
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >邮箱</label>
									<div class="controls">
										<input type="text" name="email"    value="${bean.email}"   class="m-wrap span12"> 
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">手机</label>
									<div class="controls">
										<input type="text" name="mobile"   value="${bean.mobile}"  class="m-wrap span12"> 
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >电话</label>
									<div class="controls">
										<input type="text" name="phone"   value="${bean.phone}"   class="m-wrap span12"> 
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						
						<div class="row-fluid">
							<div class="span12 ">
								<div class="control-group">
									<label class="control-label">个人介绍</label>
									<div class="controls">
										<input type="text" name="intro"   value="${bean.intro}"  class="m-wrap span12" >
									</div>
								</div>
							</div>
						</div>
						
						<!--/row-->
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/customer/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		