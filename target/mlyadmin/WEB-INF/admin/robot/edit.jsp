<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
					<form action="${basePath}/admin/robot/update" method="POST" class="form-horizontal">
						
						<input type="hidden" name="robotId" value="${bean.robotId}"/>
						<h3 class="form-section">机器人信息</h3>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">机器人账号</label>
									<div class="controls">
										<input type="text" name="account" value="${bean.account}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >机器人昵称</label>
									<div class="controls">
										<input type="text"  name="nickname"  value="${bean.nickname}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">类型</label>
									<div class="controls">
										<input type="text" name="speciesId" value="${bean.speciesId}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">生日</label>
									<div class="controls">
										<input type="text" name="birthday" value="${bean.birthday}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<!--/span-->
						</div>
						<!--/row-->
						<div class="row-fluid">
						
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >性别</label>
									<select name="gender" class="span12 m-wrap" tabindex="1">
										    <option value="0">请选择</option>
											<option  <c:if test="${bean.gender == 0}">selected = "selected"</c:if> value="0">女</option>
											<option  <c:if test="${bean.gender == 1}">selected = "selected"</c:if>value="1">男</option>
									</select>
									<%-- <div class="controls">
										<input type="text"  name="gender"  value="${bean.gender}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div> --%>
								</div>
							</div>
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">出生地</label>
									<div class="controls">
										<input type="text" name="comefrom" value="${bean.comefrom}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<!--/span-->
						</div>
						<!--/row-->
						<div class="row-fluid">
						
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >介绍</label>
									<div class="controls">
										<input type="text"  name="intro"  value="${bean.intro}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
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
						</div>
						<!--/row-->
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
		