<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
					<form action="${basePath}/admin/scene/update" method="POST" class="form-horizontal">
						
						<input type="hidden" name="sceneId" value="${bean.sceneId}"/>
						<h3 class="form-section">场景信息</h3>
						<div class="row-fluid">
							
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >场景名称</label>
									<div class="controls">
										<input type="text"  name="sceneName"  value="${bean.sceneName}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >应用</label>
									<div class="controls">
										<input type="text"  name="application"  value="${bean.application}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
						
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">核心词库</label>
									<div class="controls">
										<input type="text" name="semantic" value="${bean.semantic}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">是否启用</label>
									<div class="controls">
										<input type="text" name="active" value="${bean.active}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
						</div>
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">备注</label>
									<div class="controls">
										<input type="text" name="comment" value="${bean.comment}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
						<!--/row-->
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
		