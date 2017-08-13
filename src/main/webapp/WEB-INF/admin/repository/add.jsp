<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				${bean.sceneName }
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
					<div  class="form-horizontal">
						
						<c:forEach var="logic" varStatus="status" items="${bean.getLogics()}">
							 <c:if test="${status.index%2==0}"><div class="row-fluid"></c:if>
							 
							    <div class="span6 ">
								<div class="control-group">
									<label class="control-label">${logic.logicName}</label>
									<div class="controls">
										<input type="text"   <c:if test="${bean.major eq logic.code}" >id="majorContent" </c:if> name="repository" application="${bean.application}" semantic="${logic.semantic }" command="${logic.command }" class="m-wrap span12" placeholder="Chee Kin">
									</div>
								</div>
							    </div>
							 
							<c:if test="${status.index%2==1||status.last}"></div></c:if>
		 				</c:forEach>
		         <!-- 手动输入内容文本框 -->
					<!-- <div class="row-fluid">
						<div class="span12 ">
							<div class="control-group">
								<label class="control-label">手动输入</label>
								<div class="controls">
									<input type="text" name="account"  class="m-wrap span12" placeholder="Chee Kin">
								</div>
							</div>
						</div>
					</div> -->
		          <div class="form-actions">
					<button type="submit" class="btn blue" onclick="send()"><i class="icon-ok"></i> Save</button>
					<a href="${basePath}/admin/scene/list.html" class="btn">Cancel</a>
				  </div>
				  </div>
		<!-- END FORM--> 
		        </div>
		</div>
	</div>
	</div>
</div>
<!-- END PAGE CONTAINER-->   
<script src="${basePath}/media/js/search.js"></script> 
<script src="${basePath}/media/js/bootstrap-datepicker.js"  type="text/javascript"></script>
<script type="text/javascript">
	jQuery(document).ready(function() {    
	   Search.init();
	});
	function send(){
		var majorContent = $("majorContent").val();
		var objre =document.getElementsByName("repository");
		 	var conditons = [];  
		for(var i=0;i<objre.length;i++){
			var application=objre[i].getAttribute("application");
			var semantic=objre[i].getAttribute("semantic");
			var command=objre[i].getAttribute("command");
			var content=objre[i].value;
			var repo = new Object();  
			    repo.application=application,
			    repo.semantic=semantic,
			    repo.command=command,
			    repo.content=content,
			    repo.majorContent=majorContent,
		 		conditons.push(repo);  
			}
			 $.ajax({
				 url: '${basePath}/admin/repository/save/logic' ,  
		         type: 'POST',  
		         dataType:"json",
		         contentType: "application/json", 
		         data:JSON.stringify(conditons),   
		         success:function(data){
						 var results = JSON.parse(data);
			        	 console.log(results);
					}
				
			});  
	
	}
			
</script>	

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
		