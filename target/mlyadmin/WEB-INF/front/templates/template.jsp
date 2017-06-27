<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><tiles:insertAttribute name="title" /></title>
<jsp:include page="include.jsp"></jsp:include>

</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed page-full-width">
	<tiles:insertAttribute name="header" />
	<div class="block-grey row-fluid">
		<div id="promo_carousel" class="carousel slide">
			<div class="carousel-inner">
				<div class="active item" style="margin-top: 72px;height: 254px;background: url(${basePath}/media/image/contact.png) no-repeat center top;">
					
				</div>
			</div>
		</div>
	</div>
	<!-- BEGIN CONTAINER -->
	<div class="page-container row-fluid">
	
		   <tiles:insertAttribute name="body" />
		<!-- END PAGE -->
	</div>
	<!-- END CONTAINER -->
	<hr/>
	<tiles:insertAttribute name="footer" />
	</body>
<!-- END BODY -->
</html>