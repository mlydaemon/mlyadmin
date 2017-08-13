<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<link href="${basePath}/media/css/datepicker.css" rel="stylesheet" type="text/css" />
<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/select2_metro.css">
<link rel="stylesheet" type="text/css" href="${basePath}/media/css/jquery.tagsinput.css">
<script type="text/javascript" src="${basePath}/media/js/select2.min.js"></script>
<script src="${basePath}/media/js/form-components.js"></script> 
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
					<a href="${basePath}/admin/index.html">Dashboard</a> 
					<i class="icon-angle-right"></i>
				</li>
				<li>
					<a href="${basePath}/admin/scene/list.html">场景列表</a>
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
				   <div class="row-fluid" style="background: #fafafa;"  class="form-horizontal">
				        <!--/span-->
						<div class="span2">
							<div class="control-group">
								<label class="control-label" >场景名称</label>
								<div class="controls">
									<input type="text" id="sceneName" value="${bean.sceneName}"  class="m-wrap span12" placeholder="例如：聊天">
								</div>
							</div>
						</div>
						<div class="span2">
							<div class="control-group">
								<label class="control-label" >应用编码</label>
								<div class="controls">
									<input type="text" id="application"  value="${bean.application}"  class="m-wrap span12" placeholder="例如：RIDDLEGUESS">
								</div>
							</div>
						</div>
						<!--/span-->
						<div class="span2 ">
							<div class="control-group">
								<label class="control-label">核心词库</label>
								<div class="controls">
									<input type="text" id="semantic" value="${bean.semantic}" class="m-wrap span12" placeholder="例如：RIDDLEGUESSCORE">
								</div>
							</div>
						</div>
						<!--/span-->
						<div class="span1 ">
							<div class="control-group">
								<label class="control-label">等级</label>
								<div class="controls">
									<input type="text" id="level" value="${bean.level}" class="m-wrap span12" placeholder="例如：MASTER">
								</div>
							</div>
						</div>
						<!--/span-->
						<div class="span1">
							<div class="control-group">
								<label class="control-label">是否启用</label>
								<div class="controls">
									<input type="text"  value="${bean.active==1?'启用':'禁用'}" class="m-wrap span12">
								</div>
							</div>
						</div>
						<!--/span-->
						<div class="span3 ">
							<div class="control-group">
								<label class="control-label">备注</label>
								<div class="controls">
									<input type="text"  value="${bean.comment}" class="m-wrap span12" >
								</div>
							</div>
						</div>
				   </div> 
					<!--/row-fluid-->
					<div class="row-fluid">
						<div class="span6">
							<div class="portlet box grey">
							    <div class="portlet-title">
									<div class="caption"><i class="icon-reorder"></i>语义</div>
								</div>
								<table class="table table-striped table-bordered table-advance table-hover">
									<thead>
										<tr>
											<!-- <th><i class="icon-briefcase"></i>语义ID</th> -->
											<th class="span5"><i class="icon-briefcase"></i>关键词</th>
											<th class="span5"><i class="icon-bookmark"></i>精确度</th>
										</tr>
									</thead>
									<tbody id="semantics">
										
									</tbody>
								</table>
		                    </div>
	                    </div>
	                    <div class="span6">
							<div class="portlet box grey">
								<div class="portlet-title">
									<div class="caption"><i class="icon-reorder"></i>应答</div>
								</div>
								<table class="table table-striped table-bordered table-advance table-hover">
									<thead>
										<tr>
											<th class="span2"><i class="icon-briefcase"></i>关键词</th>
											<th class="span2"><i class="icon-bookmark"></i>精确度</th>
											<th class="span6"><i class="icon-bookmark"></i>应答</th>
										</tr>
									</thead>
									<tbody id="replys">
										
									</tbody>
								</table>
		                    </div>
	                    </div>
                    </div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->   
<script type="text/javascript">
window.onload=function(){ 
	loadSemantics();
	loadReplys();
}
function loadReplys(){
	var application  = $("#application").val();
	var semantic  = $("#semantic").val();
    var formData = new FormData();
    formData.append("application", application);
    formData.append("semantic", semantic);
	$.ajax({  
        url: '${basePath}/admin/reply/achieve',  
        type: 'POST',  
        data: formData,  
        contentType: false,  
        processData: false,  
        success: function (returndata) {  
       	 var replys = JSON.parse(returndata).beans;
       	 //var results = $("#results");
       	 $("#replys").empty();
       	 $.each(replys,function(index,value){
       		 var str='<tr >';
		     str+='<td class="span1"><a href="#">'+value.keyword+'</a></td>';
		     str+='<td class="span2">'+value.precision+'</td> ';
		     str+='<td class="span2">'+value.content+'</td> ';
		     str+='</tr>';
		     $("#replys").append(str);
       	});
        },  
        error: function (returndata) {  
            alert(returndata);  
        }  
   });  
}
function loadSemantics(){
	var application  = $("#application").val();
	var semantic  = $("#semantic").val();
    var formData = new FormData();
    formData.append("application", application);
    formData.append("semantic", semantic);
	$.ajax({  
        url: '${basePath}/admin/semantic/achieve',  
        type: 'POST',  
        data: formData,  
        contentType: false,  
        processData: false,  
        success: function (returndata) {  
       	 var semantics = JSON.parse(returndata).beans;
       	 //var results = $("#results");
       	 $("#semantics").empty();
       	 $.each(semantics,function(index,value){
       		 var str='<tr >';
		     str+='<td class="span1"><a href="#">'+value.keyword+'</a></td>';
		     str+='<td class="span2">'+value.precision+'</td> ';
		     str+='</tr>';
		     $("#semantics").append(str);
       	});
        },  
        error: function (returndata) {  
            alert(returndata);  
        }  
   });  
}

</script>