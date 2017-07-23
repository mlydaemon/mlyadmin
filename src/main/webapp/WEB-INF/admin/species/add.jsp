<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				种类信息
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
					<form action="${basePath}/admin/species/save" method="POST" class="form-horizontal">
						
						<h3 class="form-section">种类信息</h3>
						<div class="row-fluid">
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >种类名称</label>
									<div class="controls">
										<input type="text"  name="speciesName"   class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">父类</label>
									<div class="controls">
										<select>
										<option value="0">请选择</option>
										<c:forEach var="species" items="${beans}"> 
										       <option value="${species.speciesId}">${species.speciesName}</option>
										　　</c:forEach>											
										</select>
										<!-- <input type="text" name="parentId"  class="m-wrap span12" placeholder="Chee Kin"> -->
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
									<label class="control-label">是否启用</label>
									<div class="controls">
										<select name="active" class="span12 m-wrap">
										    <option value="0">请选择</option>
											<option value="1">启用</option>
											<option value="0">不启用</option>
										</select>
									</div>
								</div>
							</div>
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >备注</label>
									<div class="controls">
										<input type="text"  name="comment"  class="m-wrap span12" placeholder="dd/mm/yyyy">
									</div>
								</div>
							</div> 
						</div>
						<!--/row-->
						 
						
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/species/list.html" class="btn">Cancel</a>
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
		