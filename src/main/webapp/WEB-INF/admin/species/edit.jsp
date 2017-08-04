<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
					<a href="${basePath}/admin/index.html">DashBoard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/species/list.html">种类列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/species/edit?speciesId=${bean.speciesId}">${bean.speciesName}编辑</a>
					<i class="icon-angle-right"></i>
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
					<form action="${basePath}/admin/species/update" method="POST" class="form-horizontal">
						
						<input type="hidden" name="speciesId" value="${bean.speciesId}"/>
						<div class="row-fluid">
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >种类名称<span class="required">*</span></label>
									<div class="controls">
										<input type="text"  name="speciesName"  value="${bean.speciesName}"  class="m-wrap span12" placeholder="机器人类别，例如：动物">
									    <span class="help-block">类别名称，不重复</span>
									</div>
								</div>
							</div> 
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">父类</label>
									<div class="controls">
										<select name="parentId">
										 <option value="0">请选择</option>
										 <c:forEach var="species" items="${beans}"> 
									       <option  <c:if test="${bean.parentId eq species.speciesId}" >selected="selected"</c:if> value="${species.speciesId}">${species.speciesName}</option>
									　　	 </c:forEach>	
										</select>
									    <span class="help-block">默认为顶级分类，顶级分类不做为机器人分类类别</span>									
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">是否启用</label>
									<div class="controls">
										<label class="radio">
										 <div class="radio hover"><span><input type="radio" <c:if test="${bean.active == 1}">checked</c:if>  name="active" value="1"></span></div>启用
										</label>
										<label class="radio">
										 <div class="radio hover"><span><input type="radio"<c:if test="${bean.active == 0}">checked</c:if> name="active" value="0"></span></div>不启用
										</label>
										<span class="help-block">启用后可供机器人创建时选择</span>
									</div>
								</div>
							</div>
							<!--/span-->
						
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">备注</label>
									<div class="controls">
										<input type="text" name="comment" value="${bean.comment}" class="m-wrap span12" placeholder="说明:机器人类别说明">
									    <span class="help-block">机器人分类说明</span>
									</div>
								</div>
							</div>
							<!--/span-->
							<!--/span-->
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
		