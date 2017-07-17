<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				谜语信息
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
					<form action="${basePath}/admin/riddle/update" method="POST" class="form-horizontal">
						
						<input type="hidden" name="riddleId" value="${bean.riddleId}"/>
						<h3 class="form-section">谜语信息</h3>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">小主人</label>
									<div class="controls">
										<input type="text" name="account" value="${bean.account}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >谜面</label>
									<div class="controls">
										<input type="text"  name="conundrum"  value="${bean.conundrum}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">谜幕</label>
									<div class="controls">
										<input type="text" name="mystery" value="${bean.mystery}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >提示</label>
									<div class="controls">
										<input type="text"  name="reminder"  value="${bean.reminder}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<!--/row-->
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">谜底</label>
									<div class="controls">
										<input type="text" name="answer" value="${bean.answer}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >描述</label>
									<div class="controls">
										<input type="text"  name="explains"  value="${bean.explains}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">分类</label>
									<div class="controls">
										<input type="text" name="classify" value="${bean.classify}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
						</div>
							<!--/span-->
							<%-- <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >创建时间</label>
									<div class="controls">
										<input type="text"  name="createdTime"  value="${bean.createdTime}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> --%>
							<!--/span-->
						<%-- <div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">更新时间</label>
									<div class="controls">
										<input type="text" name="updateTime" value="${bean.updateTime}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
						</div> --%>
						<!--/row-->
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/riddle/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		