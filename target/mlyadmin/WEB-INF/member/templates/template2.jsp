<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title><tiles:insertAttribute name="title" /></title>
<jsp:include page="include.jsp"></jsp:include>
</head>
<body>
	<tiles:insertAttribute name="header" />
	<div class="container">
		<div class="main-content">
			<div class="page-content">
				<div class="row">
					<div class="col-md-12">
						<tiles:insertAttribute name="body" />
					</div>
				</div>
			</div>
		</div>
		<tiles:insertAttribute name="footer" />
	</div>

</body>
</html>