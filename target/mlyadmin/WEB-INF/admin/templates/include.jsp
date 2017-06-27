<meta charset="utf-8" />
	<title>Metronic | Admin Dashboard Template</title>
	<meta content="width=device-width, initial-scale=1.0" name="viewport" />
	<meta content="" name="description" />
	<meta content="" name="author" />
	<!-- BEGIN GLOBAL MANDATORY STYLES -->
	<link href="${basePath}/media/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
	<link href="${basePath}/media/css/bootstrap-responsive.min.css" rel="stylesheet" type="text/css"/>
	<link href="${basePath}/media/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
	<link href="${basePath}/media/css/style-metro.css" rel="stylesheet" type="text/css"/>
	<link href="${basePath}/media/css/style.css" rel="stylesheet" type="text/css"/>
	<link href="${basePath}/media/css/style-responsive.css" rel="stylesheet" type="text/css"/>
	<link href="${basePath}/media/css/default.css" rel="stylesheet" type="text/css" id="style_color"/>
	<link href="${basePath}/media/css/uniform.default.css" rel="stylesheet" type="text/css"/>
	<!-- END GLOBAL MANDATORY STYLES -->
	<!-- BEGIN PAGE LEVEL STYLES --> 
	<link href="${basePath}/media/css/multi-select-metro.css" rel="stylesheet" type="text/css" />
	<link href="${basePath}/media/css/jquery.gritter.css" rel="stylesheet" type="text/css"/>
	<link href="${basePath}/media/css/daterangepicker.css" rel="stylesheet" type="text/css" />
	<link href="${basePath}/media/css/fullcalendar.css" rel="stylesheet" type="text/css"/>
	<link href="${basePath}/media/css/jqvmap.css" rel="stylesheet" type="text/css" media="screen"/>
	<link href="${basePath}/media/css/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen"/>
	<!-- END PAGE LEVEL STYLES -->
	<link rel="shortcut icon" href="${basePath}/media/image/favicon.ico" />
<!-- BEGIN JAVASCRIPTS(Load javascripts at bottom, this will reduce page load time) -->
	<!-- BEGIN CORE PLUGINS -->
	<script src="${basePath}/media/js/jquery-1.10.1.min.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery-migrate-1.2.1.min.js" type="text/javascript"></script>
	<!-- IMPORTANT! Load jquery-ui-1.10.1.custom.min.js before bootstrap.min.js to fix bootstrap tooltip conflict with jquery ui tooltip -->
	<script src="${basePath}/media/js/jquery-ui-1.10.1.custom.min.js" type="text/javascript"></script>      
	<script src="${basePath}/media/js/bootstrap.min.js" type="text/javascript"></script>
	<!--[if lt IE 9]>
	<script src="${basePath}/media/js/excanvas.min.js"></script>
	<script src="${basePath}/media/js/respond.min.js"></script>  
	<![endif]-->   
	<script src="${basePath}/media/js/jquery.slimscroll.min.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.blockui.min.js" type="text/javascript"></script>  
	<script src="${basePath}/media/js/jquery.cookie.min.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.uniform.min.js" type="text/javascript" ></script>
	<!-- END CORE PLUGINS -->
	<!-- BEGIN PAGE LEVEL PLUGINS -->
	<script src="${basePath}/media/js/jquery.vmap.js" type="text/javascript"></script>   
	<script src="${basePath}/media/js/jquery.vmap.russia.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.vmap.world.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.vmap.europe.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.vmap.germany.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.vmap.usa.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.vmap.sampledata.js" type="text/javascript"></script>  
	<script src="${basePath}/media/js/jquery.flot.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.flot.resize.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.pulsate.min.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/date.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/daterangepicker.js" type="text/javascript"></script>     
	<script src="${basePath}/media/js/jquery.gritter.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/fullcalendar.min.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.easy-pie-chart.js" type="text/javascript"></script>
	<script src="${basePath}/media/js/jquery.sparkline.min.js" type="text/javascript"></script>  
	<!-- END PAGE LEVEL PLUGINS -->
	<!-- BEGIN PAGE LEVEL SCRIPTS -->
	<script src="${basePath}/media/js/app.js" type="text/javascript"></script>
	<!-- END PAGE LEVEL SCRIPTS --> 
	<link href="${basePath}/media/css/bootstrap-fileupload.css" rel="stylesheet" type="text/css" /> 
	<link href="${basePath}/media/css/chosen.css" rel="stylesheet" type="text/css">
<link href="${basePath}/media/css/profile.css" rel="stylesheet" type="text/css">
<!-- BEGIN PAGE LEVEL PLUGINS -->
<script type="text/javascript" src="${basePath}/media/js/bootstrap-fileupload.js"></script>
<script type="text/javascript" src="${basePath}/media/js/chosen.jquery.min.js"></script>
<script type="text/javascript" src="${basePath}/media/js/jquery.multi-select.js"></script>
<script src="${basePath}/media/js/form-components.js"></script> 
<!-- END PAGE LEVEL PLUGINS -->
	<script>
		jQuery(document).ready(function() {    
		   App.init(); // initlayout and core plugins
		   $('#permissions').multiSelect({
	            selectableOptgroup: true
	        }); 
		   $('#positions').multiSelect({
	            selectableOptgroup: true
	        }); 
		});
	</script>
	<!-- END JAVASCRIPTS -->
