<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<!-- END PAGE LEVEL SCRIPTS -->  
<script>
	jQuery(document).ready(function() {    
	   Index.initCharts(); // init index page's custom scripts
	});
</script>
<!-- END JAVASCRIPTS -->
	
<!-- BEGIN PAGE CONTAINER-->
<div class="container-fluid">
	<!-- BEGIN PAGE HEADER-->
	<div class="row-fluid">
		<div class="span12">
			<!-- BEGIN PAGE TITLE & BREADCRUMB-->
			<h3 class="page-title">
				我的账户
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
	<!-- BEGIN DASHBOARD STATS -->
	<div class="row-fluid">
		<div class="span3 responsive" data-tablet="span6" data-desktop="span3">
			<div class="dashboard-stat blue">
				<div class="visual">
					<i class="icon-comments"></i>
				</div>
				<div class="details">
					<div class="number">
						1349
					</div>
					<div class="desc">                           
						New Feedbacks
					</div>
				</div>
				<a class="more" href="#">
				View more <i class="m-icon-swapright m-icon-white"></i>
				</a>                 
			</div>
		</div>
		<div class="span3 responsive" data-tablet="span6" data-desktop="span3">
			<div class="dashboard-stat green">
				<div class="visual">
					<i class="icon-shopping-cart"></i>
				</div>
				<div class="details">
					<div class="number">549</div>
					<div class="desc">New Orders</div>
				</div>
				<a class="more" href="#">
				View more <i class="m-icon-swapright m-icon-white"></i>
				</a>                 
			</div>
		</div>
		<div class="span3 responsive" data-tablet="span6  fix-offset" data-desktop="span3">
			<div class="dashboard-stat purple">
				<div class="visual">
					<i class="icon-globe"></i>
				</div>
				<div class="details">
					<div class="number">+89%</div>
					<div class="desc">Brand Popularity</div>
				</div>
				<a class="more" href="#">
				View more <i class="m-icon-swapright m-icon-white"></i>
				</a>                 
			</div>
		</div>
		<div class="span3 responsive" data-tablet="span6" data-desktop="span3">
			<div class="dashboard-stat yellow">
				<div class="visual">
					<i class="icon-bar-chart"></i>
				</div>
				<div class="details">
					<div class="number">12,5M$</div>
					<div class="desc">Total Profit</div>
				</div>
				<a class="more" href="#">
				View more <i class="m-icon-swapright m-icon-white"></i>
				</a>                 
			</div>
		</div>
	</div>
	<!-- END DASHBOARD STATS -->
	<div class="clearfix"></div>
	<div class="row-fluid">
		<div class="span6">
			<!-- BEGIN PORTLET-->
			<div class="portlet solid bordered light-grey">
				<div class="portlet-title">
					<div class="caption"><i class="icon-bar-chart"></i>Site Visits</div>
					<div class="tools">
						<div class="btn-group pull-right" data-toggle="buttons-radio">
							<a href="" class="btn mini">Users</a>
							<a href="" class="btn mini active">Feedbacks</a>
						</div>
					</div>
				</div>
				<div class="portlet-body">
					<div id="site_statistics_loading">
						<img src="${basePath}/media/image/loading.gif" alt="loading" />
					</div>
					<div id="site_statistics_content" class="hide">
						<div id="site_statistics" class="chart"></div>
					</div>
				</div>
			</div>
			<!-- END PORTLET-->
		</div>
		<div class="span6">
			<!-- BEGIN PORTLET-->
			<div class="portlet solid light-grey bordered">
				<div class="portlet-title">
					<div class="caption"><i class="icon-bullhorn"></i>Activities</div>
					<div class="tools">
						<div class="btn-group pull-right" data-toggle="buttons-radio">
							<a href="" class="btn blue mini active">Users</a>
							<a href="" class="btn blue mini">Orders</a>
						</div>
					</div>
				</div>
				<div class="portlet-body">
					<div id="site_activities_loading">
						<img src="${basePath}/media/image/loading.gif" alt="loading" />
					</div>
					<div id="site_activities_content" class="hide">
						<div id="site_activities" style="height:100px;"></div>
					</div>
				</div>
			</div>
			<!-- END PORTLET-->
			<!-- BEGIN PORTLET-->
			<div class="portlet solid bordered light-grey">
				<div class="portlet-title">
					<div class="caption"><i class="icon-signal"></i>Server Load</div>
					<div class="tools">
						<div class="btn-group pull-right" data-toggle="buttons-radio">
							<a href="" class="btn red mini active">
							<span class="hidden-phone">Database</span>
							<span class="visible-phone">DB</span></a>
							<a href="" class="btn red mini">Web</a>
						</div>
					</div>
				</div>
				<div class="portlet-body">
					<div id="load_statistics_loading">
						<img src="${basePath}/media/image/loading.gif" alt="loading" />
					</div>
					<div id="load_statistics_content" class="hide">
						<div id="load_statistics" style="height:108px;"></div>
					</div>
				</div>
			</div>
			<!-- END PORTLET-->
		</div>
	</div>
	<div class="clearfix"></div>
</div>
<!-- END PAGE CONTAINER-->    
		