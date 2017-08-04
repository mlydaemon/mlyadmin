<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				逻辑信息
			</h3>
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="${basePath}/admin/index.html">DashBoard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/logic/list.html">逻辑列表</a>
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/logic/add">创建逻辑</a>
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
					<form action="${basePath}/admin/logic/save" method="POST" class="form-horizontal">
						
						<div class="row-fluid">
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">逻辑名称</label>
									<div class="controls">
										<input type="text" name="logicName"  class="m-wrap span12" placeholder="例如：字谜谜面">
									</div>
								</div>
							</div>
							<!--/span-->
							<div class="span6 ">
								<div class="control-group">
									<label class="control-label">场景名称</label>
									<div class="controls">
										<select name="sceneId"  class="span12 m-wrap" tabindex="1">
										   <option value="0">请选择</option>
										   <option  value="1">监控器</option>
									       <option  value="2">简况信息</option>
									       <option  value="3">猜字谜</option>
										</select>
									</div>
								</div>
							</div>
							<!--/span-->
						</div>
						<!--/row-->
						<div class="row-fluid">	
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >语义词库</label>
									<div class="controls">
										<input type="text"  name="semantic"   class="m-wrap span12" placeholder="例如：RIDDLEGUESSCONUNDRUM">
									</div>
								</div>
							</div> 
							<!--/span-->
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >语义标识</label>
									<div class="controls">
										<input type="text"  name="command"   class="m-wrap span12" placeholder="例如：RIDDLEGUESSCONUNDRUM">
									</div>
								</div>
							</div> 
							<!--/span-->
						</div>
						<!--/row-->
						<div class="row-fluid">
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >逻辑编码</label>
									<div class="controls">
										<input type="text"  name="code"  class="m-wrap span12" placeholder="例如：CONUNDRUM">
									</div>
								</div>
							</div> 
							 <div class="span6 ">
								<div class="control-group">
									<label class="control-label" >备注</label>
									<div class="controls">
										<input type="text"  name="comment"  class="m-wrap span12" placeholder="例如：谜面">
									</div>
								</div>
							</div> 
						</div>
						<!--/row-->
						<div class="form-actions">
							<button type="submit" class="btn blue"><i class="icon-ok"></i> Save</button>
							<a href="${basePath}/admin/logic/list.html" class="btn">Cancel</a>
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
		