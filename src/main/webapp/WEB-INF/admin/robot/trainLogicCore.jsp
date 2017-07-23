<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				机器人场景核心语义训练信息
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
				   <div class="row-fluid" style="background: #fafafa;"  class="form-horizontal">
				       <div class="span2 ">
							<div class="control-group">
								<label class="control-label" >机器人名称</label>
								<div class="controls">
									<input type="text" id="robotName" value="${bean.robotName}"  class="m-wrap span12" >
								</div>
							</div>
						</div>
						<div class="span2 ">
							<div class="control-group">
								<label class="control-label" >机器人账号</label>
								<div class="controls">
									<input type="text" id="robotAccount" value="${bean.robotAccount}"  class="m-wrap span12" >
								</div>
							</div>
						</div>
				        <!--/span-->
						<div class="span2 ">
							<div class="control-group">
								<label class="control-label" >场景名称</label>
								<div class="controls">
									<input type="text"  value="${bean.sceneName}"  class="m-wrap span12" placeholder="例如：聊天">
								</div>
							</div>
						</div>
						<div class="span2 ">
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
								<label class="control-label">逻辑名称</label>
								<div class="controls">
									<input type="text" id="logicName" value="${bean.logicName}" class="m-wrap span12" placeholder="例如：咨询">
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
				   </div> 
					<!--/row-fluid-->
					<div class="row-fluid">
					     <div class="span5 ">
							<div class="control-group">
								<label class="control-label" >提问内容</label>
								<div class="controls">
									<input type="text"  id="questionContent"  class="m-wrap span12" placeholder="例如：你好">
								</div>
						 	</div>
						  </div>
						  <!--/span-->
						  <div class="span5 ">
							<div class="control-group">
								<label class="control-label" >提问语义</label>
								<div class="controls">
									<input type="text"  id="questionCommand"   class="m-wrap span12" value="${bean.logicName}">
								</div>
						 	</div>
						  </div>
						  <!--/span-->
						  <div class="span2 ">
							 <div class="control-group">
									<label class="control-label" >&nbsp;</label>
									<div class="controls">
									    <button class="btn blue btn-block"  onclick = "sendQuestion()">提交 <i class="m-icon-swapright m-icon-white"></i></button>
									</div>
							  </div>
						  </div>
						  <!--/span-->
					</div> 
					<div class="row-fluid">
					      <!--/span-->
						  <div class="span5">
							<div class="control-group">
								<label class="control-label" >应答内容</label>
								<div class="controls">
									<input type="text"  id="answerContent"    class="m-wrap span12" placeholder="例如：你也好">
								</div>
						 	</div>
						  </div>
						  <!--/span-->
						  <div class="span5">
							<div class="control-group">
								<label class="control-label" >应答语义</label>
								<div class="controls">
									<input type="text"  id="answerCommand"   class="m-wrap span12"  value="${bean.logicName}">
								</div>
						 	</div>
						  </div>
						  <!--/span-->
						  <div class="span2 ">
							<div class="control-group">
								<label class="control-label" >&nbsp;</label>
								<div class="controls">
								    <button class="btn blue btn-block"  onclick = "sendAnswer()">提交 <i class="m-icon-swapright m-icon-white"></i></button>
								</div>
						 	</div> 
						  </div>
						  <!--/span-->
					</div> 
					<table class="table table-striped table-bordered table-advance table-hover">
						<thead>
							<tr>
								<!-- <th><i class="icon-briefcase"></i>语义ID</th> -->
								<th><i class="icon-briefcase"></i>语义词库</th>
								<th><i class="icon-bookmark"></i>提问</th>
								 <th><i class="icon-bookmark"></i>提问语义</th>
								 <th><i class="icon-bookmark"></i>应答语义</th>
								 <th><i class="icon-bookmark"></i>应答内容</th>
								 <!-- <th><i class="icon-bookmark"></i>跳转词库</th> -->
								 <!-- <th><i class="icon-bookmark"></i>模式</th> -->
								<th></th>
							</tr>
						</thead>
						<tbody id="knowledges">
							<%-- <c:forEach var="question" items="${beans}"> 
							    <tr>
									<td><a href="#">${question.questionId}</a></td>
									<td><a href="#">${question.account}</a></td>
									<td>${question.application}</td>
									 <td>${question.content}</td> 
									 <td>${question.command}</td> 
									 <td>${question.classify}</td> 
									 <td>${question.nextclassify}</td> 
									 <td>${question.pattern}</td> 
									<td><a class="btn mini green-stripe" href="${basePath}/admin/question/delete?questionId=${question.questionId}">删除</a></td>
								</tr>
							</c:forEach> --%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->   
<script type="text/javascript">
window.onload=function(){ 
	loadKnowledges();
}
function deleteKnowledge(questionId,answerId){
	var formData = new FormData();
		if(questionId!='null'){
			formData.append("questionId", questionId);
		}
	    if(answerId!='null'){
	    	formData.append("answerId", answerId);
		}
	    $.ajax({  
	         url: '${basePath}/admin/knowledge/delete' ,  
	         type: 'POST',  
	         data: formData,  
	         contentType: false,  
	         processData: false,  
	         success: function (returndata) {  
	        	 var results = JSON.parse(returndata);
	        	 console.log(results);
	        	 if(results.success==1){
	        		 loadKnowledges(); 
	        	 }
	        	 //window.location.href='${basePath}/admin/article/list';
	         },  
	         error: function (returndata) {  
	             alert(returndata);  
	         }  
	    });  
}
function loadKnowledges(){
	var robotAccount = $("#robotAccount").val();
	var application  = $("#application").val();
	var semantic  = $("#semantic").val();
	
    var formData = new FormData();
    /* formData.append("robotAccount", robotAccount);
    formData.append("application", application);
    formData.append("semantic", semantic); */
	$.ajax({  
        url: '${basePath}/admin/knowledge/achieve/'+robotAccount+'/'+application+'/'+semantic ,  
        type: 'GET',  
        data: formData,  
        contentType: false,  
        processData: false,  
        success: function (returndata) {  
       	 var knowledges = JSON.parse(returndata).knowledges;
       	 console.log(knowledges);
       	 //var results = $("#results");
       	 $("#knowledges").empty();
       	 $.each(knowledges,function(index,value){
       		 var str='<tr >';
		     str+='<td><a href="#">'+value.semantic+'</a></td>';
		     str+='<td>'+value.questionContent+'</td> ';
		     str+='<td>'+value.questionCommand+'</td>';
		     str+='<td>'+value.answerCommand+'</td> ';
		     str+='<td>'+value.answerContent+'</td> ';
		     str+='<td><a class="btn mini green-stripe" href="javascript:void(0);" onclick="deleteKnowledge(\''+value.questionId+'\',\'null\')">删除提问</a>|';
		     str+='<a class="btn mini green-stripe" href="javascript:void(0);" onclick="deleteKnowledge(\'null\',\''+value.answerId+'\')">删除应答</a></td>';
		     str+='</tr>';
		     $("#knowledges").append(str);
       	});
       
       	 //window.location.href='${basePath}/admin/article/list';
        },  
        error: function (returndata) {  
            alert(returndata);  
        }  
   });  
}
function sendQuestion(){
	var robotAccount = $("#robotAccount").val();
	var application  = $("#application").val();
	var semantic  = $("#semantic").val();
	var questionContent  = $("#questionContent").val();
	var questionCommand  = $("#questionCommand").val();
	var answerCommand  = $("#answerCommand").val();
	var answerContent  = $("#answerContent").val();
	
    var formData = new FormData();
    formData.append("robotAccount", robotAccount);
    formData.append("application", application);
    formData.append("semantic", semantic);
    formData.append("questionContent", questionContent);
    formData.append("questionCommand", questionCommand);
    formData.append("answerCommand", answerCommand);
    formData.append("answerContent", answerContent);
    $.ajax({  
         url: '${basePath}/admin/knowledge/recquestion' ,  
         type: 'POST',  
         data: formData,  
         contentType: false,  
         processData: false,  
         success: function (returndata) {  
        	 var results = JSON.parse(returndata);
        	 console.log(results);
        	 if(results.success==1){
        		 loadKnowledges(); 
        	 }else{
        		 
        	 }
        	 //window.location.href='${basePath}/admin/article/list';
         },  
         error: function (returndata) {  
             alert(returndata);  
         }  
    });  
}
function sendAnswer(){
	var robotAccount = $("#robotAccount").val();
	var application  = $("#application").val();
	var semantic  = $("#semantic").val();
	var questionContent  = $("#questionContent").val();
	var questionCommand  = $("#questionCommand").val();
	var answerCommand  = $("#answerCommand").val();
	var answerContent  = $("#answerContent").val();
	
    var formData = new FormData();
    formData.append("robotAccount", robotAccount);
    formData.append("application", application);
    formData.append("semantic", semantic);
    formData.append("questionContent", questionContent);
    formData.append("questionCommand", questionCommand);
    formData.append("answerCommand", answerCommand);
    formData.append("answerContent", answerContent);
    $.ajax({  
         url: '${basePath}/admin/knowledge/recanswer' ,  
         type: 'POST',  
         data: formData,  
         contentType: false,  
         processData: false,  
         success: function (returndata) {  
        	 var results = JSON.parse(returndata);
        	 console.log(results);
        	 if(results.success==1){
        		 loadKnowledges(); 
        	 }else{
        		 
        	 }
        	 //window.location.href='${basePath}/admin/article/list';
         },  
         error: function (returndata) {  
             alert(returndata);  
         }  
    });  
}
</script>   
		