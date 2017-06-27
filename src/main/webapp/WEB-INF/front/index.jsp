<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>mlycan</title>
<jsp:include page="templates/include.jsp"></jsp:include>
</head>
<!-- END HEAD -->
<!-- BEGIN BODY -->
<body class="page-header-fixed page-full-width">
	<!-- BEGIN HEADER -->
<div class="header navbar navbar-inverse navbar-fixed-top">
		<!-- BEGIN TOP NAVIGATION BAR -->
		<div class="navbar-inner  navbar hor-menu ">
			<div class="container-fluid">
						<ul class="nav">
							<li class="active">
								<a href="#">首页</a>
							</li>
							<li >
								<a href="${basePath}/site/aboutus.html">关于我们</a>
							</li>
							<li>
							   <a href="#service">项目服务</a>
							</li>
							<li>
								<a href="#inmarket">互动营销</a>                       
							</li>
							<li>
								<a href="#analysis">数据分析</a>                       
							</li>
							<li>
								<a href="${basePath}/site/contactus.html">联系我们</a>                       
							</li>
						</ul>
						<ul class="nav pull-right">
							<li class="dropdown user">
								<a href="#" class="dropdown-toggle" data-toggle="dropdown">
								<span class="username">咨询热线：123456789</span>
								<i class="icon-angle-down"></i>
								</a>
							</li>
						</ul>
				</div>
				<!-- END HORIZANTAL MENU -->
			</div>
		<!-- END TOP NAVIGATION BAR -->
	</div>
<!-- END HEADER -->
	<!-- BEGIN CONTAINER -->
	<div class="page-container row-fluid">
		<div class="page-content no-min-height">
		  <div class="container-fluid promo-page">
		  <!-- BEGIN PAGE CONTENT-->
			<div class="row-fluid span12">
				<div class="block-grey">
					<div class="container">
						<div id="promo_carousel" class="carousel slide">
							<div class="carousel-inner">
								<div class="active item">
									<div class="row-fluid">
										<div class="span7 margin-bottom-20 margin-top-20 animated rotateInUpRight">
											<h1>Welcome to Metronic..</h1>
											<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique. Pellentesque viverra vehicula sem ut volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
											<p>Lunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero consectetur adipiscing elit magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
											<a href="${basePath}/index.html" class="btn red big xlarge">
											Take a tour
											<i class="m-icon-big-swapright m-icon-white"></i>                                
											</a>
										</div>
										<div class="span5 animated rotateInDownLeft">
											<a href="${basePath}/index.html"><img src="${basePath}/media/image/img1.png" alt=""></a>
										</div>
									</div>
								</div>
								<div class="item">
									<div class="row-fluid">
										<div class="span5 animated rotateInUpRight">
											<a href="index.html"><img src="${basePath}/media/image/img1_2.png" alt=""></a>
										</div>
										<div class="span7 margin-bottom-20 animated rotateInDownLeft">
											<h1>Buy Metronic Today..</h1>
											<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique. Pellentesque viverra vehicula sem ut volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
											<p>Lunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Ut non libero consectetur adipiscing elit magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
											<a href="${basePath}/index.html" class="btn green big xlarge">
											But it today
											<i class="m-icon-big-swapright m-icon-white"></i>                                
											</a>
										</div>
									</div>
								</div>
							</div>
							<a class="carousel-control left" href="#promo_carousel" data-slide="prev">
							<i class="m-icon-big-swapleft m-icon-white"></i>
							</a>
							<a class="carousel-control right" href="#promo_carousel" data-slide="next">
							<i class="m-icon-big-swapright m-icon-white"></i>
							</a>
						</div>
					</div>
				</div>
				<section class="block-transparent" id="aboutus">
					<div class="container">
					<div class="row-fluid margin-bottom-20">
							<div class="span6 margin-bottom-20">
								<h2>Metronic Viverra</h2>
								<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos <a href="#">ellentesque la vehi</a> dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique. Pellentesque viverra vehicula sem ut volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
								<p>Lunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita <a href="#">distinctio lorem ipsum dolor</a> sit amet, consectetur adipiscing elit. Ut non libero consectetur adipiscing elit magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
							</div>
							<div class="span6 margin-bottom-20">
								<a href="index.html"><img src="${basePath}/media/image/img3.png" alt=""></a>
							</div>
						</div>
					</div>
				</section>
				<section class="block-transparent" id="service">
					<div class="container">
					    <div class="row-fluid invoice-logo">
							<div class="span6 invoice-logo-space"><img src="${basePath}/media/image/walmart.png" alt=""> </div>
							<div class="span6">
								<p class="sub-title"><a href="${basePath}/site/service.html">项目服务>></a></p>
							</div>
						</div> 
						<hr/>                       
		               <div class="row-fluid search-images">
							<ul class="thumbnails">
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image1.jpg">
									<img src="${basePath}/media/image/image1.jpg" alt="">
									<span><em>600 x 400 - keenthemes.com</em></span>
									</a>
								</li>
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="Photo" href="media/image/image2.jpg">
									<img src="${basePath}/media/image/image2.jpg" alt="">
									<span><em>220 x 340 - example.com</em></span>
									</a>
								</li>
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image1.jpg">
									<img src="${basePath}/media/image/image1.jpg" alt="">
									<span><em>800 x 540 - demo.com</em></span>
									</a>
								</li>
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image1.jpg">
									<img src="${basePath}/media/image/image2.jpg" alt="">
									<span><em>390 x 220 - keenthemes.com</em></span>
									</a>
								</li>
							</ul>
							<ul class="thumbnails">
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image2.jpg">
									<img src="${basePath}/media/image/image2.jpg" alt="">
									<span><em>600 x 400 - keenthemes.com</em></span>
									</a>
								</li>
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image1.jpg">
									<img src="${basePath}/media/image/image1.jpg" alt="">
									<span><em>390 x 220 - keenthemes.com</em></span>
									</a>
								</li>
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image2.jpg">
									<img src="${basePath}/media/image/image2.jpg" alt="">
									<span><em>800 x 540 - demo.com</em></span>
									</a>
								</li>
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image1.jpg">
									<img src="${basePath}/media/image/image1.jpg" alt="">
									<span><em>390 x 220 - keenthemes.com</em></span>
									</a>
								</li>
							</ul>
							<ul class="thumbnails">
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image3.jpg">
									<img src="${basePath}/media/image/image2.jpg" alt="">
									<span><em>600 x 400 - keenthemes.com</em></span>
									</a>
								</li>
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image1.jpg">
									<img src="${basePath}/media/image/image1.jpg" alt="">
									<span><em>390 x 220 - keenthemes.com</em></span>
									</a>
								</li>
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image2.jpg">
									<img src="${basePath}/media/image/image2.jpg" alt="">
									<span><em>800 x 540 - demo.com</em></span>
									</a>
								</li>
								<li class="span3">
									<a class="fancybox-button" data-rel="fancybox-button" title="390 x 220 - keenthemes.com" href="media/image/image1.jpg">
									<img src="${basePath}/media/image/image1.jpg" alt="">
									<span><em>390 x 220 - keenthemes.com</em></span>
									</a>
								</li>
							</ul>
						</div> 
					 </div>
				</section>
				<section class="block-transparent" id="inmarket">
				    
					<div class="container">
					<div class="row-fluid invoice-logo">
						<div class="span6 invoice-logo-space"><img src="${basePath}/media/image/walmart.png" alt=""> </div>
						<div class="span6">
							<p class="sub-title"><a href="${basePath}/site/inmarket.html">互动营销>></a></p>
						</div>
					</div> 
					<hr/>
						<div class="row-fluid">
							<div class="span5 margin-bottom-20">
								<a href="${basePath}/site/inmarket.html"><img src="${basePath}/media/image/img2.png" alt=""></a>
							</div>
							<div class="span7">
								<h2>Metronic viverra vehicula sem ut volutpat</h2>
								<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique. Pellentesque viverra vehicula sem ut volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
								<p>Lunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero consectetur adipiscing elit magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
								<a href="${basePath}/site/inmarket.html" class="btn blue big xlarge">
								Learn more
								<i class="m-icon-big-swapright m-icon-white"></i>                                
								</a>
							</div>
						</div>
					</div>
				</section>
				<section class="block-transparent" id="analysis">
					 
					<div class="container">
						<div class="row-fluid invoice-logo">
							<div class="span6 invoice-logo-space"><img src="${basePath}/media/image/walmart.png" alt=""> </div>
							<div class="span6">
								<p class="sub-title"><a href="${basePath}/site/analysis.html">数据分析>></a></p>
							</div>
						</div> 
					    <hr/>
						<div class="row-fluid">
							<div class="span3">
								<h3><a href="#">Consectetur adipiscing</a></h3>
								<p>Pellentesque viverra vehicula sem ut volutpat dosum molor sit amet, consectetur adipiscing elit</p>
							</div>
							<div class="span3">
								<h3><a href="#">Ut volutpat dosum</a></h3>
								<p>Lunt in lpa qui officia deserunt mollitia mo animi, asdid leoff iscia est labor le harum quidem rerum facilis</p>
							</div>
							<div class="span3">
								<h3><a href="#">Viverra de esque</a></h3>
								<p>Volutpat dosum esque viverra ved et quam lacusehicula sem ut  molorviverra sit amet, consetetur edipiscin la</p>
							</div>
							<div class="span3">
								<h3><a href="#">Sem ut volutpat dum</a></h3>
								<p>Deleniti atque corrupa vehicula sem ut volutpat dosum molor sit amet, consectetur adipiscing praesentium</p>
							</div>
						</div>
						<div class="row-fluid">
							<div class="span3">
								<h3><a href="#">Consectetur adipiscing</a></h3>
								<p>Pellentesque viverra vehicula sem ut volutpat dosum molor sit amet, consectetur adipiscing elit</p>
							</div>
							<div class="span3">
								<h3><a href="#">Ut volutpat dosum</a></h3>
								<p>Lunt in lpa qui officia deserunt mollitia mo animi, asdid leoff iscia est labor le harum quidem rerum facilis</p>
							</div>
							<div class="span3">
								<h3><a href="#">Viverra de esque</a></h3>
								<p>Volutpat dosum esque viverra ved et quam lacusehicula sem ut  molorviverra sit amet, consetetur edipiscin la</p>
							</div>
							<div class="span3">
								<h3><a href="#">Sem ut volutpat dum</a></h3>
								<p>Deleniti atque corrupa vehicula sem ut volutpat dosum molor sit amet, consectetur adipiscing praesentium</p>
							</div>
						</div>
					</div>
				</section>
				<section class="block-transparent" id="consultation">
					<div class="container">
						<div class="row-fluid">
							<div class="span5 margin-bottom-20">
								<a href="index.html"><img src="${basePath}/media/image/img2.png" alt=""></a>
							</div>
							<div class="span7">
								<h2>Metronic viverra vehicula sem ut volutpat</h2>
								<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique. Pellentesque viverra vehicula sem ut volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
								<p>Lunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero consectetur adipiscing elit magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
								<a href="index.html" class="btn blue big xlarge">
								Learn more
								<i class="m-icon-big-swapright m-icon-white"></i>                                
								</a>
							</div>
						</div>
					</div>
				</section>
				<section class="block-transparent" id="contactus">
					<div class="container">
						<div class="row-fluid">
							<div class="span5 margin-bottom-20">
								<a href="index.html"><img src="${basePath}/media/image/img2.png" alt=""></a>
							</div>
							<div class="span7">
								<h2>Metronic viverra vehicula sem ut volutpat</h2>
								<p>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique. Pellentesque viverra vehicula sem ut volutpat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
								<p>Lunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio lorem ipsum dolor sit amet, consectetur adipiscing elit. Ut non libero consectetur adipiscing elit magna. Sed et quam lacus. Fusce condimentum eleifend enim a feugiat.</p>
								<a href="index.html" class="btn blue big xlarge">
								Learn more
								<i class="m-icon-big-swapright m-icon-white"></i>                                
								</a>
							</div>
						</div>
					</div>
				</section>
				<div class="block-footer">
					<div class="container">
						<div class="row-fluid">
							<div class="span4">
								<h3>Subscribe</h3>
								<p>Donec id elit non mi porta gravida at eget metus. Fusce dapibus, justo sit amet risus etiam.</p>
								<form class="form-search" action="#">
									<div class="input-append">
										<input type="text" class="m-wrap" placeholder="Email Address"><button type="button" class="btn blue">GO!</button>
									</div>
								</form>
							</div>
							<div class="span4">
								<h3>Photo Stream</h3>
								<ul class="unstyled blog-images">
									<li><a href="#"><img src="${basePath}/media/image/1.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/2.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/3.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/4.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/5.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/6.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/8.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/10.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/11.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/1.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/2.jpg" alt=""></a></li>
									<li><a href="#"><img src="${basePath}/media/image/7.jpg" alt=""></a></li>
								</ul>
							</div>
							<div class="span4">
								<h3>Stay Tuned</h3>
								<ul class="social-icons">
									<li><a href="#" data-original-title="amazon" class="amazon"></a></li>
									<li><a href="#" data-original-title="behance" class="behance"></a></li>
									<li><a href="#" data-original-title="blogger" class="blogger"></a></li>
									<li><a href="#" data-original-title="deviantart" class="deviantart"></a></li>
									<li><a href="#" data-original-title="dribbble" class="dribbble"></a></li>
									<li><a href="#" data-original-title="dropbox" class="dropbox"></a></li>
									<li><a href="#" data-original-title="facebook" class="facebook"></a></li>
									<li><a href="#" data-original-title="forrst" class="forrst"></a></li>
									<li><a href="#" data-original-title="github" class="github"></a></li>
									<li><a href="#" data-original-title="Goole Plus" class="googleplus"></a></li>
									<li><a href="#" data-original-title="jolicloud" class="jolicloud"></a></li>
									<li><a href="#" data-original-title="last-fm" class="last-fm"></a></li>
									<li><a href="#" data-original-title="linkedin" class="linkedin"></a></li>
									<li><a href="#" data-original-title="picasa" class="picasa"></a></li>
									<li><a href="#" data-original-title="pintrest" class="pintrest"></a></li>
									<li><a href="#" data-original-title="rss" class="rss"></a></li>
									<li><a href="#" data-original-title="skype" class="skype"></a></li>
									<li><a href="#" data-original-title="spotify" class="spotify"></a></li>
									<li><a href="#" data-original-title="stumbleupon" class="stumbleupon"></a></li>
									<li><a href="#" data-original-title="tumblr" class="tumblr"></a></li>
									<li><a href="#" data-original-title="twitter" class="twitter"></a></li>
									<li><a href="#" data-original-title="vimeo" class="vimeo"></a></li>
									<li><a href="#" data-original-title="wordpress" class="wordpress"></a></li>
									<li><a href="#" data-original-title="xing" class="xing"></a></li>
									<li><a href="#" data-original-title="yahoo" class="yahoo"></a></li>
									<li><a href="#" data-original-title="youtube" class="youtube"></a></li>
									<li><a href="#" data-original-title="vk" class="vk"></a></li>
									<li><a href="#" data-original-title="instagram" class="instagram"></a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		 </div>
		</div>
    </div>
	<!-- END CONTAINER -->
	
	<jsp:include page="templates/footer.jsp"></jsp:include>
	
	</body>
<!-- END BODY -->
</html>
<script>
	jQuery(document).ready(function() {    
	   jQuery('#promo_carousel').carousel({
	      interval: 10000,
	      pause: 'hover'
	   });
	});
</script>