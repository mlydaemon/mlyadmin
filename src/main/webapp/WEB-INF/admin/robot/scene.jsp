<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="${basePath}/media/css/datepicker.css" rel="stylesheet" type="text/css" />
<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<link href="${basePath}/media/css/pricing-tables.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/select2_metro.css">
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/jquery.tagsinput.css">
<script type="text/javascript" src="${basePath}/media/js/select2.min.js"></script>
<script src="${basePath}/media/js/form-components.js"></script> 
<script >
	jQuery(document).ready(function() {       
	  $("#select2_sample5").select2({
	          tags: ["看书", "看电影", "猜字谜", "旅游", "登山"]
	        });
	});
</script> 
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
					<a href="${basePath}/admin/index.html">Dashboard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/robot/list.html">机器人列表</a>
					<i class="icon-angle-right"></i>
				</li>
			</ul>
			<!-- END PAGE TITLE & BREADCRUMB-->
		</div>
	</div>
	<!-- END PAGE HEADER-->
	<div class="row-fluid">
		 <div class="portlet box ">
				<div class="portlet-body form">
					<!-- BEGIN FORM-->
					<input type="hidden" name="robotId" value="${bean.robotId}"/>
					<div class="row-fluid">
						<div class="span2 ">
							<div class="control-group">
								<label class="control-label">机器人账号</label>
								<div class="controls">
									<input type="text" name="account" value="${bean.account}" class="m-wrap span12" placeholder="Chee Kin">
								</div>
							</div>
						</div>
						<!--/span-->
						 <div class="span2 ">
							<div class="control-group">
								<label class="control-label" >机器人昵称</label>
								<div class="controls">
									<input type="text"  name="nickname"  value="${bean.nickname}"  class="m-wrap span12" >
								</div>
							</div>
						</div> 
						<!--/span-->
						<div class="span2 ">
							<div class="control-group">
								<label class="control-label">类型</label>
								<div class="controls">
									<input type="text"  name="speciesName"  value="${bean.speciesName}"  class="m-wrap span12" >
								</div>
							</div>
						</div>
						<div class="span3 ">
							<div class="control-group">
								<label class="control-label" >爱好</label>
								<div class="controls">
									<input type="hidden"  name="hobby" id="select2_sample5" class="span12 select2" value="${bean.hobby}">
								</div>
							</div>
						</div>
						<div class="span3 ">
							<div class="control-group">
								<label class="control-label">备注</label>
								<div class="controls">
								     ${bean.comment}
								</div>
							</div>
						</div>
					</div>
					<!-- END FORM-->                
				</div>
			</div>
			<!-- 场景管理 -->
			 <div class="portlet box" style="background-color: #eee;">
				 <div class="portlet-title" >
					<div class="caption" style="color:#3d3d3d!important"><i class="icon-reorder"></i>场景管理</div>
				 </div>
				<div class="portlet-body ">
					
					<c:forEach var="scene" items="${beans}"  varStatus="status"> 
					   <c:if test="${status.index%4==0}"><div class="row-fluid margin-bottom-40"></c:if>
						<div class="span3 pricing hover-effect">
							<div class="pricing-head">
								<h3>${scene.sceneName}<span>${scene.comment}</span></h3>
							</div>
							<ul class="pricing-content unstyled">
								<li><i class="icon-tags"></i>${scene.application}</li>
								<li><i class="icon-asterisk"></i>${scene.semantic}</li>
								<li><i class="icon-heart"></i> 逻辑数量</li>
								<li><i class="icon-star"></i> ${(scene.active eq 1)?"启用":"禁用"}</li>
								<li><i class="icon-shopping-cart"></i>受欢迎程度</li>
							</ul>
							<div class="pricing-footer">
								<c:choose>
								   <c:when test="${(scene.sceneId eq 1 or scene.sceneId eq 2)}">  
								        <span  class="btn grey">默认场景</span> 
								   </c:when>
								   <c:when test="${(scene.sceneId gt 2) and (scene.robotId ne null)}">  
								         <span onclick="rdswitch(this,'${bean.robotId}','${scene.sceneId}')" class="btn grey">
										 关闭<i class="m-icon-swapright m-icon-white"></i>
										</span>
								   </c:when>
								   <c:otherwise> 
		                                <span onclick="rdswitch(this,'${bean.robotId}','${scene.sceneId}')" class="btn green">
										 开启<i class="m-icon-swapright m-icon-white"></i>
										</span> 
									</c:otherwise>
								</c:choose>
							</div>
						</div>
						<c:if test="${status.index%4==3}"></div></c:if>
					 </c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
<!-- END PAGE CONTAINER-->    
<script src="${basePath}/media/js/search.js"></script> 
<script src="${basePath}/media/js/bootstrap-datepicker.js"  type="text/javascript"></script>
<script>
	function rdswitch(obj,robotId,sceneId){
		var status = 1;
		if(obj.className=='btn grey'){
			status =2;
		}
		var formData = new FormData();
	    formData.append("robotId", robotId);
	    formData.append("sceneId", sceneId);
	    formData.append("status", status);
	    $.ajax({  
	         url: '${basePath}/admin/robot/rcswitch' ,  
	         type: 'POST',  
	         data: formData,  
	         contentType: false,  
	         processData: false,  
	         success: function (returndata) {  
	        	 var results = JSON.parse(returndata);
	        	 console.log(results);
	        	 if(results.success>=1){
	        		 if(obj.className=='btn green'){
	        			 obj.textContent='关闭';
	        			 obj.className ="btn grey";
        			 }else{
        			     obj.textContent='开启';
	        		     obj.className ="btn green";
        			 }
	        	 }
	         },  
	         error: function (returndata) {  
	             alert(returndata);  
	         }  
	    });  
	}
</script>		