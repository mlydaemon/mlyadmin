<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
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
					<form action="${basePath}/admin/user/update" method="POST" class="form-horizontal">
						<input type="hidden" name="userId" value="${bean.userId}"/>
						<h3 class="form-section">基本信息</h3>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">账号</label>
									<div class="controls">
										<input type="text" name="account" value="${bean.account}"   class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label" >密码</label>
									<div class="controls">
										<input type="text"  name="password" value="${bean.password}"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">昵称</label>
									<div class="controls">
										<input type="text" name="nickname" value="${bean.nickname}" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">手机</label>
									<div class="controls">
										<input type="text" name="phone" value="${bean.phone}"  class="m-wrap span12"> 
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<!--/row-->
						
						<div class="row-fluid">
							<div class="span12 ">
								<div class="control-group">
										<label class="control-label">权限赋值</label>
										<div class="controls">
											<select multiple="multiple" id="positions" name="positions">
												<c:forEach var="department" items="${beans}"> 
												  <c:if test="${!empty department.positions}">
												       <optgroup label="${department.departmentName}">
													       <c:forEach var="position" items="${department.positions}">
													         <option <c:if test="${fn:contains(bean.positionIds, position.positionId)}" >selected="selected"</c:if> value="${position.positionId}">${position.positionName}</option>
													       </c:forEach>	 
												       </optgroup>
											       </c:if>
											　　</c:forEach>	
											</select>
										</div>
									</div>
							</div>
						</div>
						
						<!--/row-->
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/user/list.html" class="btn">Cancel</a>
						</div>
					</form>
					<!-- END FORM-->                
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->    
		