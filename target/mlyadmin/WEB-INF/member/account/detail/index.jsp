<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
	<div class="tab-pane profile-classic row-fluid">
			<div class="span2"><img src="${basePath}/media/image/profile-img.png" alt="" /> <a href="#" class="profile-edit">edit</a></div>
			<ul class="unstyled span10">
				<li><span>姓名:</span>${member.realname!}</li>
				<li><span>QQ:</span> John</li>
				<li><span>Last Name:</span> Doe</li>
				<li><span>Counrty:</span> Spain</li>
				<li><span>生日:</span> ${member.birthday!}</li>
				<li><span>QQ:</span>${member.qq!}</li>
				<li><span>邮箱:</span> <a href="#">${member.email!}</a></li>
				<li><span>手机:</span> +${bean.mobile}</li>
				<li><span>个人介绍:</span> ${bean.intro}.</li>
			</ul>
		</div>
</div>
<!-- END PAGE CONTAINER-->    
		