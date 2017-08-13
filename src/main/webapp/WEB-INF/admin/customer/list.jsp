<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="${basePath}/media/css/search.css" rel="stylesheet" type="text/css" />
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				会员列表
			</h3>
			
			<ul class="breadcrumb">
				<li>
					<i class="icon-home"></i>
					<a href="#">感谢您注册**网</a> 
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/customer/add">添加会员</a> 
					<i class="icon-angle-down"></i>
				</li>
				<li class="pull-right no-text-shadow">
				     <i class="icon-calendar"></i>
			         <a  id="upfile" href="javascript:void(0);" >上传客户</a>
			         <i class="icon-angle-down"></i>
			    </li>
			    <li class="pull-right no-text-shadow">
			     <form method="POST" enctype="multipart/form-data" id="uploadform">  
			           <input style="line-height: 20px; width: 70px;"  type="file" name="upfile">
			       </form>
			      </li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="${basePath}/admin/customer/export">下载会员</a> 
					<i class="icon-angle-down"></i>
				</li>
				<li class="pull-right no-text-shadow">
					<i class="icon-calendar"></i>
					<a href="javascript:deletecustomer()">批量删除</a> 
					<i class="icon-angle-down"></i>
				</li>
			</ul>
			<!-- END PAGE TITLE & BREADCRUMB-->
		</div>
	</div>
	<!-- END PAGE HEADER-->
	<div class="row-fluid">
		<div class="portlet-body" style="display: block;">
			<table class="table table-striped table-bordered table-advance table-hover">
				<thead>
					<tr>
					    <th><input id="allcheck" type="checkbox" name="checkboxs"/></th>
						<th><i class="icon-briefcase"></i>客户名称</th>
						<th class="hidden-phone"><i class="icon-question-sign"></i> 客户地址</th>
						<th><i class="icon-bookmark"></i> 手机号码</th>
						<th><i class="icon-bookmark"></i> 是否打印</th>
						<th><i class="icon-bookmark"></i> 自我描述</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="customer" items="${beans}"> 
					    <tr>
					        <td><input type="checkbox" name="checkbox" value="${customer.customerId}" /></td>
							<td><a href="#">${customer.nickname}</a></td>
							<td class="hidden-phone">${customer.comefrom}</td>
							<td>${customer.mobile}</td>
							<td class="print">${customer.printCount==null?"未打印":"已打印"}(${customer.printCount==null?0:customer.printCount})</td>
							<td>${customer.intro}</td>
							<td><a class="btn mini green-stripe" href="${basePath}/admin/customer/edit?customerId=${customer.customerId}">编辑</a>
							<a class="btn mini green-stripe" href="javascript:void(0)" onclick="deletecustomer(${customer.customerId})">删除</a>
							<a class="btn mini green-stripe" href="javascript:void(0);" onclick="sendPrint(this,'${customer.printCount==null?0:customer.printCount}','${customer.customerId}')">确认打印</a></td>
						</tr>
					</c:forEach>
					
				</tbody>

			</table>
            <div class="space5"></div>
             <div class="pagination pagination-right">
				<ul>
					<li class=""><a href="${basePath}/admin/customer/list?curpage=1">首页</a></li> 
				<c:choose>
				   <c:when test="${curpage== '1'}">  
				    <li><a href="${basePath}/admin/customer/list?curpage=1">Prev</a></li>     
				   </c:when>
				   <c:otherwise> 
				   <li><a href="${basePath}/admin/customer/list?curpage=${curpage-1}">Prev</a></li>
				   </c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2>5}">
						<c:forEach begin="1" end="${curpage-2>=5?5:curpage-3}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/customer/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage-2>5}">
						<li class=""><a href="#">……</a></li> 
					</c:when>
				</c:choose>
				<c:choose>
						<c:when test="${curpage+2<5&&curpage-2<talpage-5&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:5}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/customer/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-4}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/customer/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
						<c:when test="${curpage+2>=5&&curpage-2>=talpage-3&&talpage>5}">
							<c:forEach begin="${curpage-2<1?1:talpage-5}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/customer/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
						</c:when>
					 <c:otherwise> 
							 <c:forEach begin="${curpage-2<1?1:curpage-2}" end="${curpage+2>=talpage?talpage:curpage+2}" var = "page">
								<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/customer/list?curpage=${page}">${page}</a></li> 
							</c:forEach>
					</c:otherwise>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2<talpage-5}">
						<li class=""><a href="#">……</a></li> 
					</c:when>
				</c:choose>
				<c:choose>
				    <c:when test="${curpage+2<talpage}">
						<c:forEach begin="${curpage+2<talpage-4?talpage-4:curpage+3}" end="${talpage}" var = "page">
							<li class="${curpage==page?'active':''}"><a href="${basePath}/admin/riddle/list?curpage=${page}">${page}</a></li> 
						</c:forEach>
					</c:when>
				</c:choose>
				<c:choose>
				   <c:when test="${curpage== talpage}">  
				      <li><a href="${basePath}/admin/customer/list?curpage=${talpage}">Next</a></li>     
				   </c:when>
				   <c:otherwise> 
				      <li><a href="${basePath}/admin/customer/list?curpage=${curpage+1}">Next</a></li>
				   </c:otherwise>
				</c:choose>
					<li class=""><a href="${basePath}/admin/customer/list?curpage=${talpage}">尾页</a></li> 
				</ul>
			</div>
		</div>
	</div>
</div>
<!-- END PAGE CONTAINER--> 
<script> 
//ajax 方式上传文件操作  
$(document).ready(function(){
	
	$("#allcheck").click(function(){
		
		if($('#allcheck').is(':checked')) {
			$("input[name='checkbox']").each(function(){
				if($(this).is(':checked')!=$('#allcheck').is(':checked')){
					$(this).click();
				}
			})
		}else{
			$("input[name='checkbox']").each(function(){
				if($(this).is(':checked')!=$('#allcheck').is(':checked')){
					$(this).click();
				}
			})
		}
	}) 
	$("#upfile").on('click',function(e){  
		var form = new FormData(document.getElementById("uploadform"));
//        var req = new XMLHttpRequest();
//        req.open("post", "${pageContext.request.contextPath}/public/testupload", false);
//        req.send(form);
	       $.ajax({
	           url:"${basePath}/admin/customer/upload",
	           type:"post",
	           data:form,
	           processData:false,
	           contentType:false,
	           success:function(data){
	        	   window.location.href ="${basePath}/admin/customer/list.html"
	           },
	           error:function(e){
	               alert("错误！！");
	           }
	       });         
		});  
	});  
	function sendPrint(obj,printCount,customerId){
    $.ajax({  
         url: '${basePath}/admin/customer/print?customerId='+customerId ,  
         type: 'POST',  
         contentType: false,  
         processData: false,  
         success: function (returndata) {  
        	 var results = JSON.parse(returndata);
        	 console.log(results);
        	 if(results.success>=1){
        		 obj.parentElement.previousElementSibling.previousElementSibling.innerText="已打印("+(printCount*1+1)+")";
        	 }else{
        		 alert("打印失败");
        	 }
        	 
         },  
         error: function (returndata) {  
             alert(returndata);  
         }  
    });  
}
	function deletecustomer(customerid){
		var customerIds= new Array();
		if(customerid!=null){
			customerIds.push(customerid);
		}else{
			$("input[name='checkbox']").each(function(){
				if($(this).is(':checked')){
					customerIds.push($(this).val())
				}
			})	
		}
	    $.ajax({  
	         url: '${basePath}/admin/customer/delete' ,  
	         type: 'POST',  
	         dataType:"json",
	         contentType: "application/json; charset=utf-8",  
	         data:JSON.stringify(customerIds),  
	         success: function (returndata) {  
	        	 console.log(returndata);
	        	 if(returndata.success>=1){
	        		 window.location.href ="${basePath}/admin/customer/list.html"
	        	 }else{
	        		 alert("删除失败");
	        	 }
	        	 
	         },  
	         error: function (returndata) {  
	             alert(returndata);  
	         }  
	    });  
	}
</script> 