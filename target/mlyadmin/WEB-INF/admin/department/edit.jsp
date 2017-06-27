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
					<form action="${basePath}/admin/department/update" method="POST" class="form-horizontal">
						
						<input type="hidden" name="departmentId" value="${bean.departmentId}"/>
						<h3 class="form-section">基本信息</h3>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">部门名称</label>
									<div class="controls">
										<input type="text" name="departmentName" value="${bean.departmentName}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<%-- <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >上级部门</label>
									<div class="controls">
										<input type="text"  name="parentId"  value="${bean.parentId}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> --%>
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">外部链接</label>
									<div class="controls">
										<input type="text" name="link" value="${bean.link}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<%-- <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >排序</label>
									<div class="controls">
										<input type="text"  name="priority"  value="${bean.priority}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> --%>
							<!--/span-->
						</div>
						<!--/row-->
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/department/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		